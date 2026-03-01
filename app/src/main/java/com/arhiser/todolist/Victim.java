package com.arhiser.todolist;

public class Victim {
    private String phone;
    private String name;
    private int smsCount;

    public Victim(String phone, String name, int smsCount) {
        this.phone = phone;
        this.name = name;
        this.smsCount = smsCount;
    }

    public String getPhone() { return phone; }
    public String getName() { return name; }
    public int getSmsCount() { return smsCount; }
}
