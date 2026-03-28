package com.oceanview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.oceanview.model.Reservation;
import com.oceanview.repository.ReservationRepository;
import com.oceanview.service.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService service;

    @Autowired
    private ReservationRepository repo;

    @PostMapping
    public Reservation create(@Valid @RequestBody Reservation reservation) {
        Reservation r = service.createReservation(reservation);
        return repo.save(r);
    }

    @GetMapping("/{id}")
    public Reservation get(@PathVariable String id) {
        return repo.findById(id).orElseThrow();
    }

    @GetMapping
    public java.util.List<Reservation> getAll() {
        return repo.findAll();
    }
}