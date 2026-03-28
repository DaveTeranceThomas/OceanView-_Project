package com.oceanview.service;

import org.springframework.stereotype.Service;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import com.oceanview.model.*;

@Service
public class ReservationService {

    public Reservation createReservation(Reservation reservation) {

        long nights = ChronoUnit.DAYS.between(
                reservation.getCheckIn(),
                reservation.getCheckOut());

        double base = nights * reservation.getRoomType().getRate();
        double service = base * 0.10;
        double tax = base * 0.05;

        reservation.setReservationId(
                UUID.randomUUID().toString().substring(0,8));

        reservation.setTotal(base + service + tax);

        return reservation;
    }
}