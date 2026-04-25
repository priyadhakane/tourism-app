package com.tourism.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.model.Hotel;
import com.tourism.repository.HotelRepository;
@Service
public class HotelService {

    @Autowired
    private HotelRepository repo;

    public Hotel addHotel(Hotel hotel) {
        return repo.save(hotel);
    }

    public List<Hotel> getHotelsByPlace(String placeName) {
        return repo.findByPlaceName(placeName);
    }
    public List<Hotel> getAllHotels() {
        return repo.findAll();
    }

    public List<Hotel> searchHotels(String keyword) {
        return repo.findByNameContainingIgnoreCaseOrLocationContainingIgnoreCase(
            keyword, keyword
        );
    }
}