package com.ideaworks.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.executable.ValidateOnExecution;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 *  @ConfigurationProperties：
 *  告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *  prefix = "person"：
 *  配置文件中哪个下面的所有属性进行一一映射
 */
@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {

    private String site;
//    @Value("${person.name}")
//    @Email
    private String name;
//    @Value("#{11*2+1}")
    private Integer age;
//    @Value("false")
    private boolean man;
//    @Value("${person.birth}")
    private Date birth;
    private Map<String,Object> info;
//    @Value("${person.friends}")
    private List<Object> friends;
//    @Value("${person.pet}")
    private Pet pet;

    @Override
    public String toString() {
        return "Person{" +
                "site='" + site + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", man=" + man +
                ", birth=" + birth +
                ", info=" + info +
                ", friends=" + friends +
                ", pet=" + pet +
                '}';
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return man == person.man &&
                Objects.equals(site, person.site) &&
                Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(birth, person.birth) &&
                Objects.equals(info, person.info) &&
                Objects.equals(friends, person.friends) &&
                Objects.equals(pet, person.pet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(site, name, age, man, birth, info, friends, pet);
    }
}
