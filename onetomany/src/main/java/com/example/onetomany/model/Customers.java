package com.example.onetomany.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private String cName;
    private int age;
    @OneToMany(cascade = CascadeType.ALL)
    // @OneToMany(targetEntity = Products.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pro_id")
    private List<Products> pro;

    public Customers(int cid, String cName, int age) {
        this.cid = cid;
        this.cName = cName;
        this.age = age;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<Products> getPro() {
        return pro;
    }

    public void setPro(List<Products> pro) {
        this.pro = pro;
    }

}