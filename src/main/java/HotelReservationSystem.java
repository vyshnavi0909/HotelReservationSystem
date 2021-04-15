import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
        private List<Hotel> hotelList;

        public HotelReservationSystem() {
            this.hotelList = new ArrayList<>();
        }

        public void addHotel(String hotelName, int rate) {
            Hotel hotel = new Hotel(hotelName, rate);
            hotelList.add(hotel);
        }
}
