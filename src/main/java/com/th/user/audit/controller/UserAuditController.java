package com.th.user.audit.controller;

import com.th.user.audit.entity.UserAudit;
import com.th.user.audit.service.UserAuditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/v1")
public class UserAuditController {

    @Autowired
    private UserAuditService userAuditService;

    @PostMapping(value = "/getall")
    @ResponseBody
    public List<UserAudit> getAll() {
        return userAuditService.getAll();
    }
}
