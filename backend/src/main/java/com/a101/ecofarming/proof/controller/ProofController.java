package com.a101.ecofarming.proof.controller;

import com.a101.ecofarming.challengeCategory.service.ChallengeCategoryService;
import com.a101.ecofarming.proof.dto.request.ProofUploadRequestDto;
import com.a101.ecofarming.proof.dto.response.ProofGuideResponseDto;
import com.a101.ecofarming.proof.dto.response.ProofUploadResponseDto;
import com.a101.ecofarming.proof.service.ProofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proof")
public class ProofController {

    private final ProofService proofService;
    private final ChallengeCategoryService challengeCategoryService;

    @Autowired
    public ProofController(ProofService proofService,
                           ChallengeCategoryService challengeCategoryService) {
        this.proofService = proofService;
        this.challengeCategoryService = challengeCategoryService;
    }

    @GetMapping("/{challengeId}/guide")
    public ResponseEntity<ProofGuideResponseDto> getGuide(@PathVariable("challengeId") Integer challengeId) {
        //System.out.println("challengeId = " + challengeId);
        ProofGuideResponseDto response = challengeCategoryService.getGuideInfo(challengeId);
        if (response == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<ProofUploadResponseDto> uploadProof(@ModelAttribute ProofUploadRequestDto requestDto) {
        ProofUploadResponseDto response = proofService.uploadProof(requestDto);
        return ResponseEntity.ok(response);
    }

}