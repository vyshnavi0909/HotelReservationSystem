import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class HotelReservationSystem {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMyyyy");
    private List<Hotel> hotelList;

    public HotelReservationSystem() {
        this.hotelList = new ArrayList<>();
    }

    public void addHotel(String hotelName, int rate) {
        Hotel hotel = new Hotel(hotelName, rate);
        hotelList.add(hotel);
    }

    public Hotel getCheapestHotel(String checkinDate, String checkoutDate) {
        try {
            Date checkin = dateFormat.parse(checkinDate);
            Date checkout = dateFormat.parse(checkoutDate);

            int numOfDays = (int) (((checkout.getTime() - checkin.getTime())/ (86.4e6)) + 1);
            System.out.println("Number of days: " + numOfDays);
            return hotelList.stream()
                    .sorted(Comparator.comparingInt(hotel -> hotel.calculatingTotalPrice(numOfDays)))
                    .findFirst().orElse(null);
        }catch (NullPointerException | ParseException e) {
            System.out.println("Exception occured: " + e );
        }
        return null;
    }
}
