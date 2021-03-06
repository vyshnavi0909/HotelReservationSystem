public class Hotel {

    private int rating;
    private String hotelName;
    private int regWeekDay;
    private int regWeekEnd;
    private int totalPrice;
    private int rewardedWeekEnd;
    private int rewardedWeekDay;

    public Hotel() {
    }

    public Hotel(String hotelName, int regWeekDay, int regWeekEnd, int rating, int rewardedWeekDay, int rewardedWeekEnd) {
        this.hotelName = hotelName;
        this.regWeekDay = regWeekDay;
        this.regWeekEnd = regWeekEnd;
        this.rating = rating;
        this.rewardedWeekDay = rewardedWeekDay;
        this.rewardedWeekEnd = rewardedWeekEnd;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegWeekDay() {
        return regWeekDay;
    }

    public void setRegWeekDay(int regWeekDay) {
        this.regWeekDay = regWeekDay;
    }

    public int getRegWeekEnd() {
        return regWeekEnd;
    }

    public void setRegWeekEnd(int regWeekEnd) {
        this.regWeekEnd = regWeekEnd;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int calculatingTotalPrice(int weekDays, int weekEnds) {
        this.totalPrice = weekDays * regWeekDay + weekEnds * regWeekEnd ;
        return totalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String toString(){
        return "\nHotel Name: " + hotelName + ", Rating: " + rating + ", Total rate: "  + totalPrice + "$";
    }

    public int calculatingTotalPriceForRewarded(int weekDays, int weekEnds) {
        this.totalPrice = weekDays * rewardedWeekDay + weekEnds * rewardedWeekEnd ;
        return totalPrice;
    }
}