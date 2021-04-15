import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelResSysTest {

    @Test
    public void toAddHotel() {
        System.out.println("Welcome to Hotel Reservation System");

        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel("Lakewood", 110, 90);
        hotelReservationSystem.addHotel("Bridgewood", 150, 50);
        hotelReservationSystem.addHotel("Ridgewood", 220, 150);

        List<Hotel> cheapestHotelList;
        cheapestHotelList = hotelReservationSystem.getCheapestHotel("11Sep2020", "12Sep2020");
        System.out.println(cheapestHotelList);
    }
}
