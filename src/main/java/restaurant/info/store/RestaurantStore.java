package restaurant.info.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import restaurant.info.entity.Restaurant;

public class RestaurantStore {
	private static Map<Integer, Restaurant> allRestaurants;
	static {
		allRestaurants = new HashMap<>();
		Restaurant r1 = new Restaurant(101, "Ambrosia","Indian", 30);
		Restaurant r2 = new Restaurant(102, "Thai Express","Thai", 3);
		Restaurant r3 = new Restaurant(103, "Mainland China","Chinese", 7);
		Restaurant r4 = new Restaurant(104, "McDonalds","American", 7);
		Restaurant r5 = new Restaurant(105, "Little Italy","Italian", 4);
		
		allRestaurants.put(r1.getRestaurantId(), r1);
		allRestaurants.put(r2.getRestaurantId(), r2);
		allRestaurants.put(r3.getRestaurantId(), r3);
		allRestaurants.put(r4.getRestaurantId(), r4);
		allRestaurants.put(r5.getRestaurantId(), r5);
		
	}
	public static Restaurant retrieveOne(Integer id) {
		return allRestaurants.get(id);
	}
	
	public static Collection<Restaurant> retrieveAll(){
		return allRestaurants.values();
	}
}
