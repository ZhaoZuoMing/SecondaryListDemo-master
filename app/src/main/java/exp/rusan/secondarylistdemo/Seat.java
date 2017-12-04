package exp.rusan.secondarylistdemo;

/**
 * Created by zhaody on 2017/11/6.
 */

public class Seat {
    public Seat(String price, String seatType) {
        this.price = price;
        this.seatType = seatType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    private String  price;
    private  String seatType;

}
