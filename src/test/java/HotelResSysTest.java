import org.junit.jupiter.api.Test;

public class HotelResSysTest {

    @Test
    public void toAddHotel() {
        System.out.println("Welcome to Hotel Reservation System");

        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel("Lakewood", 110);
        hotelReservationSystem.addHotel("Bridgewood", 150);
        hotelReservationSystem.addHotel("Ridgewood", 220);

        Hotel cheapestHotel = hotelReservationSystem.getCheapestHotel("22Sep2020", "24Sep2020");
        System.out.println("Cheapest hotel : " + cheapestHotel);
    }
}
