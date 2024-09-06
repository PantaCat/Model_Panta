package com.panta.controller;

import com.panta.config.EurekaInstanceConfig;
import com.panta.feignClients.PantaCommonMyBatisPulsClients;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaServiceInstance;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private DiscoveryClient discoveryClient;
    @Autowired
    private PantaCommonMyBatisPulsClients pantaCommonMyBatisPulsClients;

    @PostMapping("/hello")
    public String hello(){
        List<ServiceInstance> instances = discoveryClient.getInstances("PantaServive");
        //服务可能有多个, 获取第⼀个
        System.out.println("instances" + instances.size());
        EurekaServiceInstance instance = (EurekaServiceInstance)instances.get(0);
        System.out.println(instance.getInstanceId());
        EurekaInstanceConfig eic = new EurekaInstanceConfig(instance.getServiceId(), instance.getPort());
        //拼接url
        String url = eic.getServerUrl()+"/demo/hello";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String jsonBody = "{\"name\":\"John\", \"age\":30}";
        HttpEntity<String> entity = new HttpEntity<>(jsonBody, headers);

        return restTemplate.postForObject(url,entity, String.class);
    }

    @PostMapping("/saveData")
    public String saveData(){
        pantaCommonMyBatisPulsClients.saveData("小辣鸡");
        return "okk";
    }

}
