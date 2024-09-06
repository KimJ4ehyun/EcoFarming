package com.a101.ecofarming.complaint.entity;

import com.a101.ecofarming.global.audit.Auditable;
import com.a101.ecofarming.proof.entity.Proof;
import com.a101.ecofarming.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "complaint")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Complaint extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complaint_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "proof_id", nullable = false)
    private Proof proof;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    private String description;

    @Column(name = "ai_pass")
    private Boolean aiPass;

    @Column(name = "admin_pass")
    private Boolean adminPass;

}

