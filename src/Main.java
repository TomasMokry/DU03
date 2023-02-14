import com.engeto.hotel.Guest;
import com.engeto.hotel.ListOfBookings;
import com.engeto.hotel.Room;
import com.engeto.hotel.Booking;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String separator = "=".repeat(50);

        Guest guest01 = new Guest("Adéla", "Malíková", LocalDate.of(1993,3,13));
        Guest guest02 = new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5));

        Room room01 = new Room(1,1,true,true, BigDecimal.valueOf(1000.0));
        Room room02 = new Room(2,1,true,true,BigDecimal.valueOf(1000.0));
        Room room03 = new Room(3,3,false,true,BigDecimal.valueOf(2400.0));

        ///region Guests:
        System.out.println("Guests:\n"+separator);
        System.out.println("Guest 01: " +guest01.description()+"\n"+separator);
        System.out.println("Guest 02: " +guest02.description()+"\n"+separator);
        ///endregion

        ///region Rooms:
        System.out.println("\nRooms:\n"+separator);
        System.out.println("Room ID: "+room01.getIdRoom()+"\nBeds: "+room01.getBedNumber()+"\nHas Balcony: "
                +room01.isHasBalcony()+"\nHas Sea View: "+room01.isHasSeaView()+"\nPrice: "+room01.getPrice());
        System.out.println(separator);
        System.out.println("Room ID: "+room02.getIdRoom()+"\nBeds: "+room02.getBedNumber()+"\nHas Balcony: "
                +room02.isHasBalcony()+"\nHas Sea View: "+room02.isHasSeaView()+"\nPrice: "+room02.getPrice());
        System.out.println(separator);
        System.out.println("Room ID: "+room03.getIdRoom()+"\nBeds: "+room03.getBedNumber()+"\nHas Balcony: "
                +room03.isHasBalcony()+"\nHas Sea View: "+room03.isHasSeaView()+"\nPrice: "+room03.getPrice());
        ///endregion:

        ///region Booking:
        Booking booking01 = new Booking(guest01,room01,
                new ArrayList<>(),LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26),"work");

        List<Guest> otherGuestsBooking2 = new ArrayList<>();
        otherGuestsBooking2.add(guest02);

        Booking booking02 = new Booking(guest01,room03,
                otherGuestsBooking2,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),"work");

        ListOfBookings allBookingList = new ListOfBookings();
        allBookingList.addBooking(booking01);
        allBookingList.addBooking(booking02);

        System.out.println("Reservations:\n"+separator);
        for (Booking item : allBookingList.getListOfBookings()){
            System.out.println("Main guest: "+item.getGuest().getSurName());
            System.out.println("Room number: "+item.getRoom().getIdRoom());
            System.out.println("Other guests: "+item.getOtherGuests().size());
            System.out.println("Dates: "+item.getStartDate()+" - "+item.getEndDate());
            System.out.println("Type of vacation: "+item.getTypeOfVacation());
            System.out.println(separator);
        }
        ///endregion
    }

}