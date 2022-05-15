package com.th.user.audit.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.th.common.UserAuditRq;
import com.th.user.audit.service.UserAuditService;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class UserAuditControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserAuditService userAuditService;

    @SneakyThrows
    @Test
    public void purchasePayment_expectSuccess() {
        mockMvc.perform(post("/v1/getall")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
