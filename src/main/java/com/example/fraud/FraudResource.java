package com.example.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class FraudResource {

    private final FraudAppService fraudAppService;

    /**
     * 反欺诈检测
     *
     * @param command
     * @return
     */
    @PutMapping("/fraudcheck")
    public FraudResponse check(@RequestBody CheckFraudCommand command) {
        return fraudAppService.checkAmount(command);
    }
}

