package com.shop.model;

public class User {

    private String name;
    private String email;
    private String mobileNumber;
    private String security;
    private String answer;
    private String password;
    private String address;
    private String apt;
    private String city;
    private String state;
    private String codeZip;

    public User(String name, String email, String mobileNumber, String security, String answer, String password, String address, String apt, String city, String state, String codeZip) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.security = security;
        this.answer = answer;
        this.password = password;
        this.address = address;
        this.apt = apt;
        this.city = city;
        this.state = state;
        this.codeZip = codeZip;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCodeZip() {
        return codeZip;
    }

    public void setCodeZip(String codeZip) {
        this.codeZip = codeZip;
    }
    
    
    

}
