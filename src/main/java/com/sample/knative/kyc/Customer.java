package com.sample.knative.kyc;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

class Customer {

    @NotBlank(message = "First Name Cannot Be Blank.")
    private String firstName;

    private String middleName;

    @NotBlank(message = "Last Name Cannot Be Blank.")
    private String lastName;

    @NotNull(message = "Date of Birth Cannot be Blank")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date dateOfBirth;


    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getMiddleName() {
        return middleName;
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    Date getDateOfBirth() {
        return dateOfBirth;
    }

    void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}