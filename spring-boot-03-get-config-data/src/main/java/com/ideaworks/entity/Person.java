package com.ideaworks.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;



/**
 *  @ConfigurationProperties：
 *  告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *  prefix = "person"：
 *  配置文件中哪个下面的所有属性进行一一映射
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Date birth;
    private boolean man;
    private Map<String,Object> info;
    private List<Object> friends;
    private Pet pet;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", man=" + man +
                ", info=" + info +
                ", friends=" + friends +
                ", pet=" + pet +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    public void setFriends(List<Object> friends) {
        this.friends = friends;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Date getBirth() {
        return birth;
    }

    public boolean isMan() {
        return man;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public List<Object> getFriends() {
        return friends;
    }

    public Pet getPet() {
        return pet;
    }
}
