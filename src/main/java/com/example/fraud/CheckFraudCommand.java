package com.example.fraud;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CheckFraudCommand {
    /**
     * 贷款人id
     */
    @JsonProperty("client.id")
    private Long clientId;

    /**
     * 贷款金额
     */
    private Long loanAmount;
}
