package com.red;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by acer on 2018/1/18.
 */
@RestController
public class HellowController {
    @Autowired
    private GrilProperties grilProperties;

    //@Value("${cupSize}")
    //private String cupSize;
    @RequestMapping(value = {"/hello","/he"})
    public String say(){
        return "say hello"+grilProperties.getCupSize()+grilProperties.getAge();
    }
    @RequestMapping(value ="getsay/{id}")
    public String getSay(@PathVariable("id") Integer id){
        return "getSay Id"+id;
    }
    @RequestMapping(value = "param")
    public String getParam(@RequestParam("id") Integer mid){
        return "getSay Id"+mid;
    }
    @RequestMapping(value = "param2",method = RequestMethod.GET)
    public String getParam2(@RequestParam(value = "id",required = false,defaultValue = "0") Integer mid){
        return "getSay Id"+mid;
    }
    @GetMapping(value = "param3")
    public String getParam3(@RequestParam(value = "id",required = false,defaultValue = "0") Integer mid){
        return "getSay Id"+mid;
    }
}
