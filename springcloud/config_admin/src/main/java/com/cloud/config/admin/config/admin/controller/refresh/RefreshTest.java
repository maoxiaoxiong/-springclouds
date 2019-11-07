package com.cloud.config.admin.config.admin.controller.refresh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RefreshTest {
    @Value("${refreshtest}")
    private String refreshtest;

    @RequestMapping("/refreshtest")
    public String refreshTest() {

        return refreshtest;
    }
}
