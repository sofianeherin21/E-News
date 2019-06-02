package com.example.dell.e_news;

/**
 * Created by Dell on 2/6/2017.
 */

public class DataTemp {

    private int id;
    private String name;
    private String email;
    private String location;
    private String bday;
    private String occ;
    private String pass;

    String url ="http://google.com";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DataTemp() {

    }


    public DataTemp(String n, String e, String l, String d, String o, String p ){
        name = n;
        email = e;
        location=l;
        bday=d;
        occ=o;
        pass=p;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getOcc() {
        return occ;
    }

    public String getPass() {
        return pass;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getLocation() {
        return location;
    }

    public String getBday() {
        return bday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


