package com.emsi.eat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Snack.java

@Entity
public class Snack {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String category;
 private String picture;
 private String description;
 private float price;

 public Long getId() {
     return id;
 }

 public void setId(Long id) {
	 
     this.id = id;
 }

 public String getPicture() {
     return picture;
 }

 public void setPicture(String picture) {
     this.picture = picture;
 }

 public String getDescription() {
     return description;
 }

 public void setDescription(String description) {
     this.description = description;
 }

 public float getPrice() {
     return price;
 }

 public void setPrice(float price) {
     this.price = price;
 }

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

}
