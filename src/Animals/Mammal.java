package Animals;

public class Mammal extends Animals {
    String livingEnvironment;
    String travelSpeed;

    public Mammal(String animalsName, int age, String livingEnvironment, String travelSpeed) {
        super(animalsName, age);

        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Некорректно указана среда обитания";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

        if (travelSpeed == null || travelSpeed.isBlank() || travelSpeed.isEmpty()) {
            this.travelSpeed = "Скорость передвижения указана некорректно";
        } else {
            this.travelSpeed = travelSpeed;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public String getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(String travelSpeed) {
        this.travelSpeed = travelSpeed;
    }

    public void walk() {
        System.out.println("Млекопитающие могут гулять.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Млекопитающие питаются разной пищей.");
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Разные млекопитающие передвигаются с разной скоростью.");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

}
