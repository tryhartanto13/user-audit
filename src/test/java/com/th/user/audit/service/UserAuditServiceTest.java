package com.th.user.audit.service;

import com.th.user.audit.entity.UserAudit;
import com.th.user.audit.repository.UserAuditRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class UserAuditServiceTest {
    @InjectMocks
    private UserAuditService userAuditService;
    @Mock
    private UserAuditRepository userAuditRepository;

    @Test
    public void save_expectSuccess() {
        userAuditService.save(UserAudit.builder().result("SUCCESS").refNo("123")
                .activity("Activity").destNo("321").srcAcctNo("32111").build());
        Mockito.verify(userAuditRepository).save(Mockito.any(UserAudit.class));
    }

    @Test
    public void getAll_expectSuccess() {
        List<UserAudit> list = new ArrayList<>();
        list.add(UserAudit.builder().result("SUCCESS").refNo("123")
                .activity("Activity").destNo("321").srcAcctNo("32111").build());
        List<UserAudit> datas = userAuditService.getAll();
        Mockito.verify(userAuditRepository).findAll();
    }
}
