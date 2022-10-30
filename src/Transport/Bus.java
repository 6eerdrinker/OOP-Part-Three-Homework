package Transport;

public class Bus extends Transport {
    private final int routNumber;
    private final int numberOfSeats;
    private int fare;

    public Bus(String brand, String model, int productionYear, String color,
               String assemblyCountry, int maxSpeed, int routNumber,
               int numberOfSeats, int fare) {
        super(brand, model, productionYear, color, assemblyCountry, maxSpeed);
        this.routNumber = routNumber;
        this.numberOfSeats = numberOfSeats;

        setFare(fare);

    }

    @Override
    public void refill() {
        System.out.println("Автобусы заправляются дизельным топливом или бензином на заправке");
    }
    public int getRoutNumber() {
        return routNumber;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}
