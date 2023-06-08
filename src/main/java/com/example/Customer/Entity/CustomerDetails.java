package com.example.Customer.Entity;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@Embeddable
public class CustomerDetails {

    @Pattern(regexp = "^(M|F)$", message = "Sex should be 'M' or 'F'")
    private String sex;

    @Past
    @Max(value = 2001, message = "Date of birth should be before January 1, 2002")
    @Column(name = "dob")
    private String dob;

    @Column(name = "native_place")
    private String native_place;
    // Constructors, getters, and setters

    public CustomerDetails() {
    }

    public CustomerDetails(String sex, String dob, String native_place) {
        this.sex = sex;
        this.dob = dob;
        this.native_place = native_place;
    }

    // Getters and setters omitted for brevity

    public String getSex() {
        return sex;
    }

    public String getDob() {
        return dob;
    }

    public String getNative_place() {
        return native_place;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setNative_place(String native_place) {
        this.native_place = native_place;
    }
}

