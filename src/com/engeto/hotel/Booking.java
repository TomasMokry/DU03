package com.engeto.hotel;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Guest guest;
    private Room room;
    private List<Guest> otherGuests;
    private LocalDate startDate;
    private LocalDate endDate;
    private TypeOfVacation typeOfVacation;

    public Booking(Guest guest, Room room, List<Guest> otherGuests, LocalDate startDate, LocalDate endDate, TypeOfVacation typeOfVacation) {
        this.guest = guest;
        this.room = room;
        this.otherGuests = otherGuests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
}
