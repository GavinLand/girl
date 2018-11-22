package com.red;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by acer on 2018/1/18.
 * jpa单表查询 hibernate
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private  GirlService girlService;
    /**
     * 查询女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }
    @PostMapping(value="/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age
                          ){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }
    @PostMapping(value = "getgril")
    public Girl getgirl(@RequestParam(value = "id",required = false)Integer id){
        return girlRepository.findOne(id);
    }

    @PostMapping(value = "upgirl")
    public void upgirl(@RequestParam(value = "id",required = false) Integer id,
                       @RequestParam(value = "cupSize",required = true) String cupSize
                       ){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girlRepository.save(girl);
    }

    /**
     * 通过年龄查询
     * @param age
     * @return
     */
    @GetMapping(value = "getgirlsbyage/{age}")
    public List<Girl> getGirlsAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @GetMapping(value = "inserTow")
    public void insertTow(){
        girlService.insertTow();
    }
}
