package com.panta.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "panta-common-mybatispuls")
public interface PantaCommonMyBatisPulsClients {

    @PostMapping("/test/saveData")
    String saveData(@RequestParam(value = "name") String name);
}
