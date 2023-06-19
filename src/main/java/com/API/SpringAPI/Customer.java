package com.API.SpringAPI;

import java.util.Objects;
import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;



@Entity
public class Customer {
    
    @Id
    @SequenceGenerator(name="customer_id_sequence", sequenceName = "customer_id_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "customer_id_sequence")

    private Integer Id;
    private String name;
    private String email;
    private Integer age;

    public Customer(Integer Id, String name, String email, Integer age){

        this.Id = Id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Customer(){
        
    }
     

    /**
     * @return Integer return the Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Integer return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return Objects.equals(Id, customer.Id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(age, customer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, email, age);
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + Id + ", name=" + name + ", email=" + email + ", age=" + age +"}";
    }

    


}
