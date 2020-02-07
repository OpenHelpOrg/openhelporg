package com.capstone.openhelp.models;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(columnDefinition = "bit(1) DEFAULT 0", nullable = false)
    private boolean is_org;

    private String phone;

    private String image;

    private String about;

    private String address;

    private String website;

    public User() {
    }

    public User(long id, String name, String email, String password, boolean is_org, String phone, String image, String about, String address, String website) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.is_org = is_org;
        this.phone = phone;
        this.image = image;
        this.about = about;
        this.address = address;
        this.website = website;
    }

    public User(String name, String email, String password, boolean is_org, String phone, String image, String about, String address, String website) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.is_org = is_org;
        this.phone = phone;
        this.image = image;
        this.about = about;
        this.address = address;
        this.website = website;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_org() {
        return is_org;
    }

    public void setIs_org(boolean is_org) {
        this.is_org = is_org;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
