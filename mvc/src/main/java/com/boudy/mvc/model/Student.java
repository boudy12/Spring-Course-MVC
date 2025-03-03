package com.boudy.mvc.model;

public class Student {

    // Attributes (Fields)
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String favoriteOS;


    // Constructor
    
    public Student() {
    	
    }
    
    public Student(String firstName, String lastName, String country, String favoriteLanguage, String favoriteOS) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOS = favoriteOS;

    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
    
    public String getFavoriteOS() {
        return favoriteOS;
    }

    public void setFavoriteOS(String favoriteOS) {
        this.favoriteOS = favoriteOS;
    }


}
