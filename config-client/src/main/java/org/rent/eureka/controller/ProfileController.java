package org.rent.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: config-client
 * @Package: org.rent.eureka.controller
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/6/12 22:30
 * @version: V1.0
 */
@RefreshScope
@RestController
public class ProfileController {

    @Value("${from.native.default}")
    String from;

    @GetMapping("/from")
    public String from(){
        return this.from;
    }
}
