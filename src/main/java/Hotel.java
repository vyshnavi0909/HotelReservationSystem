public class Hotel {
    private String hotelName;
    private int rate;
    private int totalPrice;


    public Hotel() {
    }

    public Hotel(String hotelName, int rate) {
        this.hotelName = hotelName;
        this.rate = rate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int calculatingTotalPrice(int numOfDays) {
        this.totalPrice = numOfDays * rate;
        return totalPrice;
    }

    public String toString(){
        return hotelName + ", " + totalPrice;
    }
}
