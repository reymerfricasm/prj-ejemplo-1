package com.ebank.customadapter;

public class User {
    private String name;
    private String address;

    public User(String name, String addrs){
        this.name = name;
        this.address = addrs;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
}
