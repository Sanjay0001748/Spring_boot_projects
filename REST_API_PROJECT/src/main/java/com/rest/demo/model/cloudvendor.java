package com.rest.demo.model;

public class cloudvendor {

    private String id;
    private String name;
    private String  phone_no;
    private String adress;

    public cloudvendor(String id, String name, String phone_no, String adress) {
        this.id = id;
        this.name = name;
        this.phone_no = phone_no;
        this.adress = adress;
    }
    public cloudvendor()
    {

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getAdress() {
        return adress;
    }


}
