package com.techtalentsouth.FavoriteRestaurantsList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// The class that will store info on each Restaurant 
@Entity 
public class Restaurant {
	
	// id is the primary key and is auto generated
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String websiteLink;
	private String pictureLink;
	
	// empty constructor
	public Restaurant() {
		
	}
	
	// argument constructor
	public Restaurant(String name, String websiteLink, String pictureLink) {
		this.name = name;
		this.websiteLink = websiteLink;
		this.pictureLink = pictureLink;
	}
	
	// getters and setters
	// id has a getter, but no setter
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsiteLink() {
		return websiteLink;
	}

	public void setWebsiteLink(String websiteLink) {
		this.websiteLink = websiteLink;
	}

	public String getPictureLink() {
		return pictureLink;
	}

	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}

	// toString method
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", websiteLink=" + websiteLink + ", pictureLink="
				+ pictureLink + "]";
	}
	
}
