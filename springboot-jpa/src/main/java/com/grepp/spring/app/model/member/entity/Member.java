package com.grepp.spring.app.model.member.entity;

import com.grepp.spring.app.model.auth.code.Role;
import com.grepp.spring.infra.entity.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Member extends BaseEntity {

    @Id
    private String userId;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String tel;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private MemberInfo info;
}
