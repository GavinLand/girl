package com.red;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by acer on 2018/1/18.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GrilProperties {
    private String cupSize;
    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
