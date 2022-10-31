package Animals;

import Transport.ValidationUtils;

import java.util.Objects;

public class Flying extends Birds {
    String movementType;

    public Flying(String animalsName, int age, String livingEnvironment, String movementType) {
        super(animalsName, age, livingEnvironment);
        this.movementType = ValidationUtils.validOrDefault(movementType, "Тип передвижения введен некорректно");
    }
    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public static void fly() {
        System.out.println("Большинство птиц летает.");
    }
    @Override
    public void eat() {
        System.out.println("Летающие птицы питаются насекомыми, рыбой, мелкими животными.");
    }

    @Override
    public void go() {
        System.out.println("Летающие птицы передвигаются с высокой скоростью.");;
    }

    public static void printInfo(Flying flying) {
        System.out.println("Животное: " + flying.getAnimalsName() + ", " +
                flying.getAge() + " - летнего возраста, " + "среда обитания: "
                + flying.getLivingEnvironment() + ". Тип передвижения:" + flying.getMovementType());}
}
