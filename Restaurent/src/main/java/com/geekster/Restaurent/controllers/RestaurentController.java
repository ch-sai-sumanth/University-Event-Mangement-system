package com.geekster.Restaurent.controllers;

import com.geekster.Restaurent.models.Restaurent;
import com.geekster.Restaurent.services.RestaurentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurentController {


    @Autowired
    RestaurentServices restaurentServices;

    @GetMapping(value="/getRestaurentById/{id}")
    public Restaurent getRestaurentById(@PathVariable int id)
    {
        return restaurentServices.getRestaurentById(id);
    }

    @GetMapping(value="/getAllRestaurents")
    public List<Restaurent> getAllRestaurents()
    {
        return restaurentServices.getAllRestaurents();
    }

    @PostMapping(value="/addRestaurent")
    public String addRestaurent(@RequestBody Restaurent restaurentDetails)
    {
        return  restaurentServices.addRestaurent(restaurentDetails);
    }

    @PutMapping(value="/updateRestaurentDetailsById/{id}")
    public String updateRestaurentDetails(@RequestBody Restaurent restaurentDetails,@PathVariable int id)
    {
        return restaurentServices.updateRestaurentDetails(restaurentDetails,id);
    }

    @DeleteMapping(value="/deleteRestaurentById/{id}")
    public String deleteRestaurent(@PathVariable int id)
    {
        return restaurentServices.deleteRestaurent(id);
    }

}
