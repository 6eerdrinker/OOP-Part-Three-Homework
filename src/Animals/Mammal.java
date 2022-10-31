package Animals;

import Transport.ValidationUtils;

public class Mammal extends Animals {
    String livingEnvironment;
    String travelSpeed;

    public Mammal(String animalsName, int age, String livingEnvironment, String travelSpeed) {
        super(animalsName, age);
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "Cреда обитания введена некорректно");
        this.travelSpeed = ValidationUtils.validOrDefault(travelSpeed, "Скорость передвижения введена некорректно");

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

}
