package com.example.belajarcrud01.models;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private String description;

    private String image;

    private double price;

    private int amount;

    @ManyToOne
    private UsersModel usersModel;

    public ProductModel(Long id, String number, String description, String image, double price, int amount, UsersModel usersModel) {
        this.id = id;
        this.number = number;
        this.description = description;
        this.image = image;
        this.price = price;
        this.amount = amount;
        this.usersModel = usersModel;
    }
     public ProductModel(){

     }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public void setUserModel(UsersModel usersModel) {
    }
}
