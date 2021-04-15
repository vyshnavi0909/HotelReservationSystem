import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelResSysTest {

    @Test
    public void toAddHotel() {
        System.out.println("Welcome to Hotel Reservation System");

        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel("Lakewood", 110, 90, 3);
        hotelReservationSystem.addHotel("Bridgewood", 150, 50, 4);
        hotelReservationSystem.addHotel("Ridgewood", 220, 150, 5);

        List<Hotel> cheapestHotelList;
        cheapestHotelList = hotelReservationSystem.getCheapestHotel("11Sep2020", "12Sep2020");
        System.out.println("Cheapest Hotels: " + cheapestHotelList);
        List<Hotel> bestRatedHotel;
        bestRatedHotel = hotelReservationSystem.getBestRatedHotel("11Sep2020", "12Sep2020");
        System.out.println("Best Rated: " + bestRatedHotel);
    }
}

