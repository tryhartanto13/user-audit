package com.th.user.audit.service;

import com.th.common.UserAuditRq;
import com.th.user.audit.entity.UserAudit;
import com.th.user.audit.repository.UserAuditRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class UserAuditReceiverTest {
    @Mock
    private UserAuditService userAuditService;
    @InjectMocks
    private UserAuditReceiver userAuditReceiver;

    @Test
    public void receiveUserAudit_expectSuccess() {
        userAuditReceiver.receiveUserAudit(UserAuditRq.builder().result("SUCCESS").refNo("123")
                .activity("Activity").destNo("321").srcAcctNo("32111").build());
        Mockito.verify(userAuditService).save(Mockito.any(UserAudit.class));
    }
}