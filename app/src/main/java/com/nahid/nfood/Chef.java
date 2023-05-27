package com.nahid.nfood;

public class Chef {

    private String Area,City, ConfirmPassword,EmailID,Fname,House,Lname,Mobile,Password,Postcode, Division;

    public Chef(String Area, String city, String confirmPassword, String emailID,
                String fname, String house, String lname, String mobile, String password,
                String postcode, String division) {
        this.Area = Area;
        City = city;
        ConfirmPassword = confirmPassword;
        EmailID = emailID;
        Fname = fname;
        House = house;
        Lname = lname;
        Mobile = mobile;
        Password = password;
        Postcode = postcode;
        Division = division;
    }

    public Chef() {
    }

    public String getArea() {
        return Area;
    }

    public String getCity() {
        return City;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public String getEmailID() {
        return EmailID;
    }

    public String getFname() {
        return Fname;
    }

    public String getHouse() {
        return House;
    }

    public String getLname() {
        return Lname;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getPassword() {
        return Password;
    }

    public String getPostcode() {
        return Postcode;
    }

  /*  public String getState() {
        return Division;
    }*/
    public String getDivision(){return Division;}

}
