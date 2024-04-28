package com.example.drblood;

import android.location.Address;

public class Requestordata {
    String Patientname;
    String Patientphno;
    String Units;
    String Address;
    String Requireddate;
    String Bloodgroup;
    String Patientid;
    String RequestorName;
    boolean emergencyc;



    public Requestordata()
    {

    }
    public Requestordata(String address,String bloodgroup,String requireddate,String patientname,String patientphno,String units,String patientid,String Requestorname,boolean emergencyC){
        Address=address;
        Requireddate=requireddate;
        Patientname=patientname;
        Patientphno=patientphno;
        Units=units;
        Bloodgroup=bloodgroup;
        Patientid=patientid;
        RequestorName=Requestorname;
        emergencyc=emergencyC;
    }
    public String getRequestorName(){
        return RequestorName;
    }
    public void setRequestorName(String requestorName){
        this.RequestorName=requestorName;
    }

    public boolean isEmergencyc() {
        return emergencyc;
    }

    public void setEmergencyc(boolean emergencyc) {
        this.emergencyc = emergencyc;
    }

    public String getPatientid() {
        return Patientid;
    }
    public void setPatientid(String patientid){
        this.Patientid=patientid;
    }

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String patientname) {
        this.Patientname = patientname;
    }

    public String getPatientphno() {
        return Patientphno;
    }

    public void setPatientphno(String patientphno) {
        Patientphno = patientphno;
    }

    public String getUnits() {
        return Units;
    }

    public void setUnits(String Units) {
        this.Units = Units;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getRequireddate() {
        return Requireddate;
    }

    public void setRequireddate(String Requireddate) {
        this.Requireddate = Requireddate;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }

    public void setBloodgroup(String Bloodgroup) {
        this.Bloodgroup = Bloodgroup;
    }
}
