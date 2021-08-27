package com.example.fraud;

import org.springframework.stereotype.Service;

import static com.example.fraud.FraudStatus.FRAUD;

@Service
public class FraudAppService {

    public FraudResponse checkAmount(CheckFraudCommand command) {
        if (command.getLoanAmount() > 99999L) {
            return new FraudResponse(FRAUD, "Amount too high");
        }
        return FraudResponse.ok();
    }
}
