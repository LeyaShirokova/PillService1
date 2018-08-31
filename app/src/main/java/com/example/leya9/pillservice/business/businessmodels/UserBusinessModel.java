package com.example.leya9.pillservice.business.businessmodels;

public class UserBusinessModel {
    private long passwordId;
    private long socialSecurityNumber;
    private String fullName;
    private String HealthCareOrganization;
    private String email;
    private String phone;
    private String address;
    private boolean status;

    public UserBusinessModel() {
    }

    public UserBusinessModel(long passwordId, long socialSecurityNumber,
                             String fullName, String healthCareOrganization,
                             String email, String phone, String address, boolean status) {
        this.passwordId = passwordId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.fullName = fullName;
        HealthCareOrganization = healthCareOrganization;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public long getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(long passwordId) {
        this.passwordId = passwordId;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHealthCareOrganization() {
        return HealthCareOrganization;
    }

    public void setHealthCareOrganization(String healthCareOrganization) {
        HealthCareOrganization = healthCareOrganization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
