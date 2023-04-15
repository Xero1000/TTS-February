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
	
	// instance for repository and an arraylist to store the entries
	@Autowired 
	private FavoriteRestaurantsRepository restaurantRepository;
	private static List<Restaurant> entries = new ArrayList<>();
	
	// GET request for homepage
	// Uses entries arraylist to get data from repository and display it on the page
	@GetMapping(value="/")
	public String index(Model model) {
		entries.removeAll(entries);
		for (Restaurant restaurant : restaurantRepository.findAll()) {
			entries.add(restaurant);
		}
		model.addAttribute("entries", entries);
		return "favoriteRestaurant/index";
	}
	
	// When user clicks Create New Entry button
	// They are taken to the page to enter info for a new entry
	@GetMapping(value="/new")
	public String newEntry(Restaurant restaurant, Model model) {
		return "favoriteRestaurant/newEntry";
	}
	
	// When user submits the new entry on the /new page, they're redirected to /resultPage
	// The info submitted is stored in repository and shown to the user 
	@PostMapping(value="/resultPage")
	public String addNewRestaurant(Restaurant restaurant, Model model) {
		restaurantRepository.save(restaurant);
		entries.add(restaurant);
		model.addAttribute("name", restaurant.getName());
		model.addAttribute("websiteLink", restaurant.getWebsiteLink());
		model.addAttribute("pictureLink", restaurant.getPictureLink());
		return "favoriteRestaurant/result";
	}
	
	// When user clicks delete button, they're redirected to a page 
	// notifying them their entry has been deleted
	// The entry is removed from the repository
	@GetMapping(value="/deletePage/{id}")
	public String deleteEntry(@PathVariable Long id) {
		restaurantRepository.deleteById(id);
		return "favoriteRestaurant/delete";
	}
	
	// When user clicks the edit button, they're taken to a page where they change
	// the entry's information
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
	
	// When user submits their info on /editPage/{id},
	// the original entry within the repository is replaced with
	// the new information
	// The user is then redirected to the /result page
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
