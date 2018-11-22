package com.red;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by acer on 2018/1/18.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<Girl> findByAge(Integer age);
}
