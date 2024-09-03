package com.panta.config;

import lombok.Data;

@Data
public class EurekaInstanceConfig {
    private String serverName;
    private int port;

    public EurekaInstanceConfig(String serverName, int port) {
        this.serverName = serverName;
        this.port = port;
    }
    public String getServerUrl(){
        return "http://"+serverName+":"+port;
    }
}
