package com.tourism.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.model.Place;
import com.tourism.repository.PlaceRepository;

import java.util.List;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository repo;

    // Get all places
    public List<Place> getAllPlaces() {
        return repo.findAll();
    }

    // Add new place
    public Place addPlace(Place place) {
        return repo.save(place);
    }
    
    public void deletePlace(int id) {
        repo.deleteById(id);
    }
    
    public List<Place> searchPlaces(String keyword) {
        return repo.findByNameContainingIgnoreCaseOrLocationContainingIgnoreCaseOrCategoryContainingIgnoreCase(
            keyword, keyword, keyword
        );
    }
    
    public Place updatePlace(int id, Place newPlace) {

        Place existing = repo.findById(id).orElse(null);

        if (existing != null) {

            existing.setDescription(newPlace.getDescription());
            existing.setSpeciality(newPlace.getSpeciality());
            existing.setHistory(newPlace.getHistory());
            existing.setImageUrl(newPlace.getImageUrl());

            return repo.save(existing);
        }

        return null;
    }
}