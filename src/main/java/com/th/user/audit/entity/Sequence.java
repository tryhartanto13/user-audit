package com.th.user.audit.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "sequences")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sequence implements Serializable {
    @Id
    private String id;

    private Long seq;
}
