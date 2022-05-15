package com.th.user.audit.repository;

import com.th.user.audit.entity.UserAudit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserAuditRepository extends MongoRepository<UserAudit, String> {
}
