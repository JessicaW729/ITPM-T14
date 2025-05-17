public class Booking{
    private int customerId;
    private int flightId;
    private String seatNumber;
    private boolean mealPurchased;
    private boolean onboardWifiPurchased;
    private int extraBaggagePurchased;
    
    public Booking(int customerId, int flightId){
        this.customerId = customerId;
        this.flightId = flightId;
        this.seatNumber = "not specified";
        this.mealPurchased = false;
        this.onboardWifiPurchased = false;
        this.extraBaggagePurchased = 0;
    }

    public Booking(int customerId, int flightId, String seatNumber, boolean mealPurchased, boolean onboardWifiPurchased, int extraBaggagePurchased){
        this.customerId = customerId;
        this.flightId = flightId;
        this.seatNumber = seatNumber;
        this.mealPurchased = mealPurchased;
        this.onboardWifiPurchased = onboardWifiPurchased;
        this.extraBaggagePurchased = extraBaggagePurchased;
    }

    @Override
    public String toString(){
        return String.format("%d, %d, %s, %s, %s, %d", customerId, flightId, seatNumber, mealPurchased, onboardWifiPurchased, extraBaggagePurchased);
    }
}
