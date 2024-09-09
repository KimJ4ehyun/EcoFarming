package com.a101.ecofarming.proof.repository;

import com.a101.ecofarming.proof.entity.Proof;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProofRepository extends JpaRepository<Proof, Integer> {
    Page<Proof> findByChallengeId(Integer challengeId, Pageable pageable);
}

