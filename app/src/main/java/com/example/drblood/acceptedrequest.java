package com.example.drblood;
public class acceptedrequest {
    String Patientname;
    String Patientphno;
    String Units;
    String Address;
    String Requireddate;
    String Bloodgroup;
    String Patientid;
    String RequestorName;
    boolean emergencyc;
    String DonorName;
    String DonorPhno;

    String Donorusername;

    public String getDonorusername() {
        return Donorusername;
    }

    public void setDonorusername(String donorusername) {
        Donorusername = donorusername;
    }

    public acceptedrequest() {

    }

    public String getDonorName() {
        return DonorName;
    }

    public void setDonorName(String donorName) {
        DonorName = donorName;
    }

    public String getDonorPhno() {
        return DonorPhno;
    }

    public void setDonorPhno(String donorPhno) {
        DonorPhno = donorPhno;
    }

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String patientname) {
        Patientname = patientname;
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

    public void setUnits(String units) {
        Units = units;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getRequireddate() {
        return Requireddate;
    }

    public void setRequireddate(String requireddate) {
        Requireddate = requireddate;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        Bloodgroup = bloodgroup;
    }

    public String getPatientid() {
        return Patientid;
    }

    public void setPatientid(String patientid) {
        Patientid = patientid;
    }

    public String getRequestorName() {
        return RequestorName;
    }

    public void setRequestorName(String requestorName) {
        RequestorName = requestorName;
    }

    public boolean isEmergencyc() {
        return emergencyc;
    }

    public void setEmergencyc(boolean emergencyc) {
        this.emergencyc = emergencyc;
    }

    public acceptedrequest(String patientname, String patientphno, String units, String address, String requireddate, String bloodgroup, String patientid, String requestorName, boolean emergencyc, String donorName, String donorPhno,String Donorusername) {
        Patientname = patientname;
        Patientphno = patientphno;
        Units = units;
        Address = address;
        Requireddate = requireddate;
        Bloodgroup = bloodgroup;
        Patientid = patientid;
        RequestorName = requestorName;
        this.emergencyc = emergencyc;
        DonorName = donorName;
        DonorPhno = donorPhno;
        this.Donorusername=Donorusername;
    }
}
