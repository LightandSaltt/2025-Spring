package com.grepp.spring.infra.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity { // entity 클래스들이 상속받는 클래스

    protected Boolean activated;

    @CreatedDate
    protected LocalDateTime createdAt = LocalDateTime.now();
    @LastModifiedBy
    protected LocalDateTime modifiedAt = LocalDateTime.now();

    public void unActivated(){
        this.activated = false;
    }
}
