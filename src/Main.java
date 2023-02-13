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

        System.out.println("Guests:");
        System.out.println("Guest 01: " +guest01.description()+"\n"+separator);
        System.out.println("Guest 02: " +guest02.description()+"\n"+separator);

        System.out.println("Rooms:");
        System.out.println("Room 01:\n" +room01.description()+"\n"+separator);
        System.out.println("Room 02:\n" +room02.description()+"\n"+separator);
        System.out.println("Room 03:\n" +room03.description()+"\n"+separator);

        Booking booking01 = new Booking(guest01,room01,
                new ArrayList<>(),LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26),"work");

        List<Guest> otherGuests = new ArrayList<>();
        otherGuests.add(guest02);

        Booking booking02 = new Booking(guest01,room03,
                otherGuests,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),"work");

        ListOfBookings allBookingList = new ListOfBookings();
        allBookingList.addBooking(booking01);
        allBookingList.addBooking(booking02);

        System.out.println("Reservations:");
        for (Booking item : allBookingList.getListOfBookings()){
            System.out.println(item.description());
            System.out.println(separator);
        }



    }
}