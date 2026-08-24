package restaurant.info.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant.info.entity.Restaurant;
import restaurant.info.store.RestaurantStore;

@RestController
@RequestMapping("/info")
@CrossOrigin
public class RestaurantController {
	@GetMapping
	public Collection<Restaurant> retrieveAll(){
		return RestaurantStore.retrieveAll();
	}
	
	@GetMapping("/{ID}")
	public Restaurant retrieveOne(@PathVariable("ID") Integer restaurantId) {
		return RestaurantStore.retrieveOne(restaurantId);
	}
	
	@PostMapping
	public void createRestaurant(@RequestBody Restaurant restaurant) {
		System.out.println("Restaurant received for creation:" + restaurant);
		//actual code for restaurant creation
	}
}
