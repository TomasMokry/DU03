package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> allBookings = new ArrayList<>();

    public void addBooking(Booking newBooking){
        allBookings.add(newBooking);
    }

    public void removeBooking(Booking bookingToRemove){

        allBookings.remove(bookingToRemove);
    }

    public int numOfBookings(){
        return allBookings.size();
    }
    public void printAllBookings(){
        for (Booking item : allBookings){
            System.out.println("Main guest: "+item.getGuest().getSurName());
            System.out.println("Room number: "+item.getRoom().getIdRoom());
            System.out.println("Other guests: "+item.getOtherGuests().size());
            System.out.println("Dates: "+item.getStartDate()+" - "+item.getEndDate());
            System.out.println("Type of vacation: "+item.getTypeOfVacation());
            System.out.println();
        }
    }

    public List<Booking> getListOfBookings(){

        return new ArrayList<>(allBookings);
    }
    public void setAllBookings(List<Booking> allBookings) {

        this.allBookings = allBookings;
    }
}
