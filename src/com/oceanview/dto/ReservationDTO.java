package com.oceanview.dto;

import com.oceanview.model.RoomType;
import java.time.LocalDate;

public class ReservationDTO {

    public String guestName;
    public String address;
    public String contact;
    public RoomType roomType;
    public LocalDate checkIn;
    public LocalDate checkOut;
}
