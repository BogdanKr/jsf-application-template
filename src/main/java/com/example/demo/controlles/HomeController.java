package com.example.demo.controlles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named
public class HomeController {
    public final static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    private String name = "Bogdan";

    private String surname = "Krasun";

    private String dateBirth;
    private String placeBirth;
    private String address;
    private String email;
    private String city;
    private boolean checkbox;

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String sayHello1() {
        System.out.println("Name & Surname :  " + name + " " + surname);
        LOGGER.warn("Привет, Это первый лог!!))");
        return "hello.xhtml?faces-redirect=true&name=" + name;
    }

    public void sayHello2() {
        System.out.println("Hello1 " + name + " " + surname);
    }

    public String submitBirth() {
        System.out.println("Date and place of birth: " + dateBirth + " " + placeBirth);
        return "address.xhtml?faces-redirect=true&name=" + placeBirth;
    }

    public String submitAddress() {
        System.out.println("Адрес: " + address);
        return "email.xhtml?faces-redirect=true&name=" + address;
    }

    public void finish() {
        System.out.println("Finish: " + name + " " + surname);
    }
}
