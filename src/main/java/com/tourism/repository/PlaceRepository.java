package com.tourism.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tourism.model.Place;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
	List<Place> findByNameContainingIgnoreCaseOrLocationContainingIgnoreCaseOrCategoryContainingIgnoreCase(
		    String name, String location, String category
		);
}