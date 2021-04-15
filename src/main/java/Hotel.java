public class Hotel {
    private int regWeekDay;
    private int regWeekEnd;
    private String hotelName;
    private int totalPrice;


    public Hotel() {
    }

    public Hotel(String hotelName, int regWeekDay, int reWeekEnd) {
        this.hotelName = hotelName;
        this.regWeekDay = regWeekDay;
        this.regWeekEnd = reWeekEnd;
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

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int calculatingTotalPrice(int weekDays, int weekEnds) {
        this.totalPrice = weekDays * regWeekDay + weekEnds * regWeekEnd ;
        return totalPrice;
    }

    public String toString(){
        return hotelName + ", " + totalPrice;
    }
}
