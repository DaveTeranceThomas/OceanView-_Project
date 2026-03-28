package com.oceanview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oceanview.model.Reservation;

public interface ReservationRepository 
        extends JpaRepository<Reservation, String> {
}