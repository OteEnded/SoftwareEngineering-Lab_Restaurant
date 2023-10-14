package ku.cs.restaurant.controller;

import ku.cs.restaurant.entity.Restaurant;
import ku.cs.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping("/restaurant")
    public List<Restaurant> getAllRestaurants(){
        return service.getAll();
    }

    @GetMapping("/restaurant/{id}")
    public Restaurant getById(@PathVariable UUID id){
        return service.getById(id);
    }

    @PostMapping("/restaurant")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant){
        return service.create(restaurant);
    }

    @PutMapping("/restaurant")
    public Restaurant update(@RequestBody Restaurant restaurant) {
        // print to console "Here"
        System.out.println("Here");
        return service.update(restaurant);
    }

    @DeleteMapping("/restaurant/{id}")
    public Restaurant delete(@PathVariable UUID id) {
        return service.delete(id);
    }

    @GetMapping("/restaurant/name/{name}")
    public Restaurant getByName(@PathVariable String name){
        return service.getByName(name);
    }

    @GetMapping("/restaurant/location/{location}")
    public List<Restaurant> getByLocation(@PathVariable String location){
        return service.getByLocation(location);
    }
}
