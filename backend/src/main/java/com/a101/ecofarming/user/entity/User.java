package com.a101.ecofarming.user.entity;

import com.a101.ecofarming.global.audit.Auditable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "`user`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class User extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private int money;

    @Column(nullable = false)
    private int prizeMoney;
}