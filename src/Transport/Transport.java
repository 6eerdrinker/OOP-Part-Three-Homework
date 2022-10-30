package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private final int productionYear;
    private String color;
    private final String assemblyCountry;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear,
                     String color, String assemblyCountry, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setMaxSpeed(maxSpeed);
        if (this.brand == null || brand.isBlank()) {
            this.brand = "Марка указана не корректно";
        } else {
            this.brand = brand;
        }
        if (this.model == null || model.isBlank()) {
            this.model = "Модель указана не корректно.";
        } else {
            this.model = model;
        }
        if (this.color == null || color.isBlank()) {
            this.color = "Указано не корректно";
        } else {
            this.color = color;
        }
        if (this.maxSpeed == 0) {
            System.out.println("Указано не корректно.");
        } else {
            this.maxSpeed = maxSpeed;
        }

        this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;

    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
