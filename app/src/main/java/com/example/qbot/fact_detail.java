package com.example.qbot;

public class fact_detail {
    private  String name;
    private String email;
    private  int priority;
    private  String position;
    private String url;

    public fact_detail()
    {
        //empty constructor needed
    }

    public fact_detail(String name,String email,String position,int priority,String url)
    {
        this.name=name;
        this.email=email;
        this.position=position;
        this.priority=priority;
        this.url=url;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public String getUrl() {
        return url;
    }

}

