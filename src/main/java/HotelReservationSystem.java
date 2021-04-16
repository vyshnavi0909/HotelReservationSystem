import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HotelReservationSystem {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMyyyy");
    private List<Hotel> hotelList;

    public HotelReservationSystem() {
        this.hotelList = new ArrayList<>();
    }

    public void addHotel(String hotelName, int weekDay, int weekEnd, int rating, int rewWeekDay, int rewWeekEnd) {
        Hotel hotel = new Hotel(hotelName, weekDay, weekEnd, rating, rewWeekDay, rewWeekEnd);
        hotelList.add(hotel);
    }

    public int getDay(Date checkin, Date checkout){
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(checkin);
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(checkout);

        int numOfWeekDay = 0;
        if(startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY){
            ++numOfWeekDay;
        }
        return numOfWeekDay;

    }

    public List<Hotel> getCheapestHotel(String checkinDate, String checkoutDate) {
        try {
            Date checkin = dateFormat.parse(checkinDate);
            Date checkout = dateFormat.parse(checkoutDate);

            int numOfDays = (int) (((checkout.getTime() - checkin.getTime())/ (86.4e6)) + 1);
            int weekDays = getDay(checkin, checkout);
            int weekEnds = numOfDays - weekDays;
            List<Hotel> cheapestHotel = new ArrayList<>();
//            return  hotelList.stream()
//                    .sorted(Comparator.comparingInt(hotel -> hotel.calculatingTotalPrice(weekDays, weekEnds)))
//                    .findFirst().orElse(null);
            int min = 99999999;
            int previousRating = 2;
            for(Hotel c : hotelList){
                int rate = c.calculatingTotalPrice(weekDays, weekEnds);
                int rating = c.getRating();
                if(rate <= min && rating > previousRating){
                    previousRating = c.getRating();
                    min = c.getTotalPrice();
                    cheapestHotel.clear();
                    cheapestHotel.add(c);
                }
            }
            return cheapestHotel;
        }catch (NullPointerException | ParseException e) {
            System.out.println("Exception occured: " + e );
            return null;
        }

    }

    public List<Hotel> getBestRatedHotel(String checkin, String checkout){
        try {
            Date checkIn = dateFormat.parse(checkin);
            Date checkOut = dateFormat.parse(checkout);
            int numOfDays = (int) (((checkOut.getTime() - checkIn.getTime())/ (86.4e6)) + 1);
            int weekDays = getDay(checkIn, checkOut);
            int weekEnds = numOfDays - weekDays;
            int bestRated = 0;
            List<Hotel> bestRatedHotel = new ArrayList<>();
            for (Hotel h: hotelList){
                if (h.getRating() > bestRated){
                    bestRated = h.getRating();
                    bestRatedHotel.clear();
                    bestRatedHotel.add(h);
                }
            }
            return bestRatedHotel;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}