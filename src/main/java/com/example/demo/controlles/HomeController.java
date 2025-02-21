package com.example.demo.controlles;

import com.example.demo.Cars;
import com.example.demo.CarsName;
import com.example.demo.Repos.CarRepository;
import com.example.demo.Repos.CarsNameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named
public class HomeController {
    public final static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    private String name;

    private String surname;

    private String dateBirth;
    private String placeBirth;
    private String address;
    private String email;
    private String city;
    private boolean checkbox;
    private String finish;
    private String selectonemenu;
    private List<Car> cars;
    private Car selectedCar;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarsNameRepository carsNameRepository;

    private List<Cars> carsListDataBase;

    public List<Cars> getCarsListDataBase() {
        return carRepository.findAll();
    }

    public void setCarsListDataBase(List<Cars> carsListDataBase) {
        this.carsListDataBase = carsListDataBase;
    }

    private List<CarsName> carsNameList;

    public List<CarsName> getCarsNameList() {

        return carsNameList;
    }

    public void setCarsNameList(List<CarsName> carsNameList) {
        this.carsNameList = carsNameList;
    }

    public String getSelectonemenu() {
        return selectonemenu;
    }

    public void setSelectonemenu(String selectonemenu) {
        this.selectonemenu = selectonemenu;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

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
        System.out.println("SelectOneMenu: " + selectonemenu);
    }

    public String goPrime() {
        return "primefaces.xhtml?faces-redirect=true";
    }

    public void showMessage() {
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("My first growl", "Your message: \n" + "\n" + name + "\n" + surname));
    }

    @PostConstruct
    private void initCars() {
        this.cars = new ArrayList<>();
        for (int i = 1; i < 1001; i++) {
            cars.add(new Car(i, "Automobile 0" + i, 2000 + i, "Color:" + i));
        }
    }


    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public void saveCar() {
        Cars car = new Cars(new Date(), "Toyota", 7778);
        carRepository.save(car);
        car = new Cars(new Date(), "Honda", 8808);
        carRepository.save(car);
        car = new Cars(new Date(), "Mersedes", 4848);
        carRepository.save(car);
        car = new Cars(new Date(), "Audi", 1111);
        carRepository.save(car);

        for (Cars cars : carRepository.findAll()){
            CarsName carsName = new CarsName();
            carsName.setName(cars.getName());
            carsNameRepository.save(carsName);
        }

    }


}
