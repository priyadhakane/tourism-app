package com.tourism.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String name;
	    private String location;
	    private String placeName;
	    private double price;

	    // Getters & Setters
	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public String getLocation() { return location; }
	    public void setLocation(String location) { this.location = location; }

	    public String getPlaceName() { return placeName; }
	    public void setPlaceName(String placeName) { this.placeName = placeName; }

	    public double getPrice() { return price; }
	    public void setPrice(double price) { this.price = price; }
	}
