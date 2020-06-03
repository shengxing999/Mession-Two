package com.wp.sm.beans;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class User {

    private long id;
    private String name;
    private long create_at;
    private long update_at;
    private int qq;
    private String job;
    private long arrive_time;
    private String school;
    private int student_id;
    private String link;
    private String wish;
    private String known_ways;
    private String bro;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", qq=" + qq +
                ", job='" + job + '\'' +
                ", arrive_time=" + arrive_time +
                ", school='" + school + '\'' +
                ", student_id=" + student_id +
                ", link='" + link + '\'' +
                ", wish='" + wish + '\'' +
                ", known_ways='" + known_ways + '\'' +
                ", bro='" + bro + '\'' +
                '}';
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

    public long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(long create_at) {
        this.create_at = create_at;
    }

    public long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(long update_at) {
        this.update_at = update_at;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public long getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(long arrive_time) {
        this.arrive_time = arrive_time;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getKnown_ways() {
        return known_ways;
    }

    public void setKnown_ways(String known_ways) {
        this.known_ways = known_ways;
    }

    public String getBro() {
        return bro;
    }

    public void setBro(String bro) {
        this.bro = bro;
    }

    public User() {
    }
}
