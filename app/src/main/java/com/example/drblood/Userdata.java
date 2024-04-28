package com.example.drblood;

import androidx.constraintlayout.widget.Group;

public class Userdata {
    String Address;
    String Blood_Group;
    String DOB;
    String Email;
    String Gender;
    String Name;
    String ph_no;
    String Status;
    String Username;


    public Userdata() {

    }

    public Userdata(String address, String blood_Group, String DOB, String email, String gender, String name, String ph_no, String status,String username) {
        Address = address;
        Blood_Group = blood_Group;
        this.DOB = DOB;
        Email = email;
        Gender = gender;
        Name = name;
        this.ph_no = ph_no;
        Status = status;
        Username=username;
    }
    public String getUsername(){
        return Username;
    }
    public void setUsername(String username){
        Username=username;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBlood_Group() {
        return Blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        Blood_Group = blood_Group;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

}
