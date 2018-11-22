package com.red;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

/**
 * Created by acer on 2018/1/20.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;
    //事物加在方法上面 Transient事物注解
    @Transient
    public void insertTow(){
        Girl girlA = new Girl();
        girlA.setAge(15);
        girlA.setCupSize("G");
        Girl girlB = new Girl();
        girlB.setAge(15);
        girlB.setCupSize("F");
        girlRepository.save(girlA);
        girlRepository.save(girlB);
    }
}
