package Transport;
public class Train extends Transport{
    private final float tripPrice;
    public String travelTime;
    private final String departureStation;
    private final String arrivalStation;
    public int wagonsNumber;

    public Train(String brand, String model, int productionYear, String color,
                 String assemblyCountry, int maxSpeed, float tripPrice,
                 String travelTime, String departureStation,
                 String arrivalStation, int wagonsNumber) {
        super(brand, model, productionYear, color, assemblyCountry, maxSpeed);
        this.travelTime = ValidationUtils.validOrDefault(travelTime, "Указано не верно");

        if (wagonsNumber <= 0) {
            System.out.println("Указано не корректно.");
        }else {this.wagonsNumber = wagonsNumber;}

        this.tripPrice = tripPrice;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        setTravelTime(travelTime);
        setWagonsNumber(wagonsNumber);
    }

    public float getTripPrice() {
        return tripPrice;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public int getWagonsNumber() {
        return wagonsNumber;
    }

    public void setWagonsNumber(int wagonsNumber) {
        this.wagonsNumber = wagonsNumber;
    }

    @Override
    public void refill() {
        System.out.println("Поезд заправляется дизельным топливом");
    }
}
