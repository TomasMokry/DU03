package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {
    private int idRoom;
    private int bedNumber;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private BigDecimal price;

    public Room(int idRoom, int bedNumber, boolean hasBalcony, boolean hasSeaView, BigDecimal price){
        this.idRoom = idRoom;
        this.bedNumber = bedNumber;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.price = price;
    }

    public int getIdRoom(){
       return idRoom;
    }

    public void setIdRoom(int idRoom){
        this.idRoom = idRoom;
    }

    public int getBedNumber(){
        return bedNumber;
    }
     public void setBedNumber(int bedNumber){
        this.bedNumber = bedNumber;
     }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
