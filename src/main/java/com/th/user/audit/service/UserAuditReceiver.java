package com.th.user.audit.service;

import com.th.common.UserAuditRq;
import com.th.user.audit.entity.UserAudit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class UserAuditReceiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch(){return latch;}

    @Autowired
    private UserAuditService userAuditService;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @JmsListener(destination = "${user.audit.topic}", containerFactory = "defaultJmsListenerContainerFactory")
    public void receiveUserAudit(UserAuditRq userAuditRq) {
        userAuditService.save(UserAudit.builder().id(sequenceGeneratorService.generateSequence(UserAudit.SEQUENCE_NAME)).srcAcctNo(userAuditRq.getSrcAcctNo()).destNo(userAuditRq.getDestNo())
                .refNo(userAuditRq.getRefNo()).activity(userAuditRq.getActivity()).result(userAuditRq.getResult()).build());
    }



}
