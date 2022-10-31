package Animals;

import Transport.ValidationUtils;

import java.util.Objects;

public class Amphibians extends Animals{
    String livingEnvironment;

    public Amphibians(String animalsName, int age, String livingEnvironment) {
        super(animalsName, age);
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "Среда обитания введена некорректно");
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
    public void hunt() {
        System.out.println("Для добычи пищи земноводные охотятся на насекомых.");
    }

    @Override
    public void eat() {
        System.out.println("Земноводные питаются, как правило, насекомыми.");
    }

    @Override
    public void go() {
        System.out.println("Разные земноводные передвигаются с разной скоростью.");
    }

    public static void printInfo(Amphibians amphibians) {
        System.out.println("Животное: " + amphibians.getAnimalsName() + ", " +
                amphibians.getAge() + " - летнего возраста, " + "среда обитания: "
                + amphibians.getLivingEnvironment() + ". ");}
}
