import java.util.*;

public class Flight {
    private int flightId;
    private String departureCity;
    private Calendar departureTime;
    private String arrivalCity;
    private Calendar arrivalTime;

    public Flight(int flightId, String departureCity, Calendar departureTime, String arrivalCity, Calendar arrivalTime){
        this.flightId = flightId;
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalCity = arrivalCity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString(){
        return String.format("%d, %s, %s, %s, %s", flightId, departureCity, departureTime, arrivalCity, arrivalTime);
    }

}
