package com.example.cabina10.latinoapp.models;

public class User {
    public int id;
    public String token;
    public String username, first_name, last_name;
    public User(){

    }

    public User(String _username, String _fist_name, String _last_name){
        this.username = _username;
        this.first_name = _fist_name;
        this.last_name = _last_name;
    }
    //public static void sync(QueueObject o){

    //}
}
