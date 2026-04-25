
package com.tourism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tourism.model.Place;
import com.tourism.service.PlaceService;

import java.util.List;

@RestController
@RequestMapping("/places")
@CrossOrigin("*")
public class PlaceController {

    @Autowired
    private PlaceService service;

    @GetMapping
    public List<Place> getAllPlaces() {
        return service.getAllPlaces();
    }

    @PostMapping
    public Place addPlace(@RequestBody Place place) {
        return service.addPlace(place);
    }
    @GetMapping("/search")
    public List<Place> search(@RequestParam String keyword) {
        return service.searchPlaces(keyword);
    }
    @PutMapping("/{id}")
    public Place updatePlace(@PathVariable int id, @RequestBody Place place) {
        return service.updatePlace(id, place);
    }
    @DeleteMapping("/delete/{id}")
    public String deletePlace(@PathVariable int id) {
        service.deletePlace(id);
        return "Deleted successfully";
    }
}