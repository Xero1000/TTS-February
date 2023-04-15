package com.techtalentsouth.FavoriteRestaurantsList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// The class that will store info on each Restaurant 
@Entity 
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String websiteLink;
	private String pictureLink;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String name, String websiteLink, String pictureLink) {
		this.name = name;
		this.websiteLink = websiteLink;
		this.pictureLink = pictureLink;
	}
	
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

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", websiteLink=" + websiteLink + ", pictureLink="
				+ pictureLink + "]";
	}
	
}
