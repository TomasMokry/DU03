package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> allBookings = new ArrayList<>();

    public void addBooking(Booking newBooking){
        allBookings.add(newBooking);
    }

    public void removeBooking(Booking booking){
        allBookings.remove(booking);
    }
    public List<Booking> getListOfBookings(){
        return new ArrayList<>(allBookings);
    }
   

    public void setAllBookings(List<Booking> allBookings) {
        this.allBookings = allBookings;
    }
}
