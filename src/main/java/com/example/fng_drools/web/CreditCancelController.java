package com.example.fng_drools.web;

import com.example.fng_drools.model.CreditOpeningRequest;
import com.example.fng_drools.model.CreditOpeningResponse;
import com.example.fng_drools.service.CreditOpeningService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getCreditsCancelValidation")
public class CreditCancelController {
    private final CreditOpeningService service;

    public CreditCancelController(CreditOpeningService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<CreditOpeningResponse> getCreditOpeningsValidation(@RequestBody CreditOpeningRequest requestBody) {
        CreditOpeningResponse res = service.isFileContentValid(requestBody.getUser(), requestBody.getCreditQuotaOpenings());
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
