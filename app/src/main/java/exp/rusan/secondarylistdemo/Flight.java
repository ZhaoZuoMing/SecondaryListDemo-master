package exp.rusan.secondarylistdemo;

import java.util.List;

/**
 * Created by zhaody on 2017/11/6.
 */

public class Flight {
    private  String fromName;
    private  String toName;
    private List<Seat> seats;

    public Flight(String fromName, String toName, List<Seat> seats) {
        this.fromName = fromName;
        this.toName = toName;
        this.seats = seats;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
