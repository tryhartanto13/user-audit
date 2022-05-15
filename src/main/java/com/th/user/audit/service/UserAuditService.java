package com.th.user.audit.service;

import com.th.user.audit.entity.UserAudit;
import com.th.user.audit.repository.UserAuditRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserAuditService {

    @Autowired
    private UserAuditRepository userAuditRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private MongoRepository mongoRepository;

    public void save(UserAudit userAudit) {
        userAuditRepository.save(userAudit);
    }

    public List<UserAudit> getAll(){
        return (List<UserAudit>) userAuditRepository.findAll();
    }
}
