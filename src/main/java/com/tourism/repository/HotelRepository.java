package com.tourism.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tourism.model.Hotel;
import java.util.List; public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    List<Hotel> findByPlaceName(String placeName);

    List<Hotel> findByNameContainingIgnoreCaseOrLocationContainingIgnoreCase(
        String name, String location
    );
}