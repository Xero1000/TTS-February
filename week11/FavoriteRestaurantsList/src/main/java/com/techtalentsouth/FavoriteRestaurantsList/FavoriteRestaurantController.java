package com.techtalentsouth.FavoriteRestaurantsList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class FavoriteRestaurantController {
	
	@Autowired 
	private FavoriteRestaurantsRepository restaurantRepository;
	private static List<Restaurant> entries = new ArrayList<>();
	
	@GetMapping(value="/")
	public String index(Restaurant restaurant, Model model) {
		model.addAttribute("entries", entries);
		return "favoriteRestaurant/index";
	}
	
	@GetMapping(value="/new")
	public String newEntry(Restaurant restaurant, Model model) {
		return "favoriteRestaurant/newEntry";
	}
	
	@PostMapping(value="/resultPage")
	public String addNewRestaurant(Restaurant restaurant, Model model) {
		restaurantRepository.save(restaurant);
		entries.add(restaurant);
		model.addAttribute("name", restaurant.getName());
		model.addAttribute("websiteLink", restaurant.getWebsiteLink());
		model.addAttribute("pictureLink", restaurant.getPictureLink());
		return "favoriteRestaurant/result";
	}
}
