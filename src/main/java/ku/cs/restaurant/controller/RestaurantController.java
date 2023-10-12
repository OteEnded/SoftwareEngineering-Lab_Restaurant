package ku.cs.restaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @GetMapping("/restaurent")
    public String getAllRestaurents(){
        return "All restaurents";
    }


}
