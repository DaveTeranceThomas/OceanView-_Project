package com.oceanview.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Reservation {

    @Id
    private String reservationId;

    @NotBlank
    private String guestName;

    private String address;

    @Pattern(regexp="\\d{10}", message="Contact must be 10 digits")
    private String contact;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    @FutureOrPresent
    private LocalDate checkIn;

    private LocalDate checkOut;

    private double total;

    // Getters & Setters
    public String getReservationId() { return reservationId; }
    public void setReservationId(String reservationId) { this.reservationId = reservationId; }

    public String getGuestName() { return guestName; }
    public void setGuestName(String guestName) { this.guestName = guestName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public RoomType getRoomType() { return roomType; }
    public void setRoomType(RoomType roomType) { this.roomType = roomType; }

    public LocalDate getCheckIn() { return checkIn; }
    public void setCheckIn(LocalDate checkIn) { this.checkIn = checkIn; }

    public LocalDate getCheckOut() { return checkOut; }
    public void setCheckOut(LocalDate checkOut) { this.checkOut = checkOut; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}