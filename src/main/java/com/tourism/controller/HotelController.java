package com.tourism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tourism.model.Hotel;
import com.tourism.service.HotelService;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@CrossOrigin("*")
public class HotelController {

    @Autowired
    private HotelService service;

    // Add hotel
    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return service.addHotel(hotel);
    }
   
    // Get hotels by place
    @GetMapping("/{placeName}")
    public List<Hotel> getHotels(@PathVariable String placeName) {
        return service.getHotelsByPlace(placeName);
    }

    // Search hotels
    @GetMapping("/search")
    public List<Hotel> searchHotels(@RequestParam String keyword) {
        return service.searchHotels(keyword);
    }
    @GetMapping
    public List<Hotel> getAllHotels() {
        return service.getAllHotels();
    }
}