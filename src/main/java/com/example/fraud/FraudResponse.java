package com.example.fraud;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FraudResponse {
    /**
     * 检测状态
     */
    private FraudStatus fraudCheckStatus;

    /**
     * 拒绝原因
     */
    @JsonProperty("rejection.reason")
    private String rejectionReason;

    public static FraudResponse ok() {
        return new FraudResponse(FraudStatus.NO_FRAUD, null);
    }
}
