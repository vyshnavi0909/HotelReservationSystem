import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelResSysTest {

    @Test
    public void toAddHotel() {
        System.out.println("Welcome to Hotel Reservation System");

        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        //adding hotels
        hotelReservationSystem.addHotel("Lakewood", 110, 90, 3, 80, 80);
        hotelReservationSystem.addHotel("Bridgewood", 150, 50, 4, 110, 50);
        hotelReservationSystem.addHotel("Ridgewood", 220, 150, 5, 100, 40);

        //cheapest hotel considering ratings for regular customers
        String cheapestHotel = hotelReservationSystem.getCheapestHotel("11Sep2020", "12Sep2020");
        System.out.println("\nCheap and best rated Hotel for regular customers: " + cheapestHotel);

        //cheap and best hotel for rewarded customers
        Hotel cheapBestHotelForRewarded = hotelReservationSystem.getCheapBestHotelForRewardedCust("11Sep2020", "12Sep2020");
        System.out.println("\nCheap and Best Hotel for rewarded customers: " + cheapBestHotelForRewarded);

        //best rated hotel for regular customers
        String bestRatedHotel = hotelReservationSystem.getBestRatedHotel("11Sep2020", "12Sep2020");
        System.out.println("\nBest Rated: " + bestRatedHotel);

    }
}

