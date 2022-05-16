package com.th.user.audit.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class UserAudit implements Serializable {
    @Transient
    public static final String SEQUENCE_NAME = "user_audit_seq";
    @Id
    private Long id;
    private String srcAcctNo;
    private String destNo;
    private String refNo;
    private String activity;
    private String result;
}
