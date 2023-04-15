package com.techtalentsouth.FavoriteRestaurantsList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class FavoriteRestaurantController {
	
	@Autowired 
	private FavoriteRestaurantsRepository restaurantRepository;
	private static List<Restaurant> entries = new ArrayList<>();
	
	@GetMapping(value="/")
	public String index(Model model) {
		entries.removeAll(entries);
		for (Restaurant restaurant : restaurantRepository.findAll()) {
			entries.add(restaurant);
		}
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
	
	@GetMapping(value="/deletePage/{id}")
	public String deleteEntry(@PathVariable Long id) {
		restaurantRepository.deleteById(id);
		return "favoriteRestaurant/delete";
	}
	
	@GetMapping(value="/editPage/{id}")
	public String editEntry(@PathVariable Long id, Restaurant restaurant, Model model) {
		Optional<Restaurant> entry = restaurantRepository.findById(id);
		if (entry.isPresent()) {
			Restaurant actualEntry = entry.get();
			model.addAttribute("restaurant", actualEntry);
			model.addAttribute("id", actualEntry.getId());
			model.addAttribute("name", actualEntry.getName());
			model.addAttribute("websiteLink", actualEntry.getWebsiteLink());
			model.addAttribute("pictureLink", actualEntry.getPictureLink());
		}
		return "favoriteRestaurant/edit";
	}
	
	@PostMapping(value="/editPage/{id}")
	public String updateEntry(@PathVariable Long id, Restaurant restaurant, Model model) {
		Optional<Restaurant> entry = restaurantRepository.findById(id);
		if (entry.isPresent()) {
			Restaurant actualEntry = entry.get();
			actualEntry.setName(restaurant.getName());
			actualEntry.setWebsiteLink(restaurant.getWebsiteLink());
			actualEntry.setPictureLink(restaurant.getPictureLink());
			restaurantRepository.save(actualEntry);
		}
		return "favoriteRestaurant/result";
	}
}
