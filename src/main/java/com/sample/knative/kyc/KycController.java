package com.sample.knative.kyc;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class KycController {

    @GetMapping("/")
    String getAppStatus() {
        return "KYC Application Running !!!";
    }

    @PostMapping("/customer")
    ResponseEntity<String> saveCustomer(@Valid @RequestBody Customer customer) {
        return ResponseEntity.ok("Customer Data Saved !!!");
    }
}