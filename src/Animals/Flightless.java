package Animals;

import Transport.ValidationUtils;

import java.util.Objects;

public class Flightless extends Birds{
    String movementType;

    public Flightless(String animalsName, int age, String livingEnvironment, String movementType) {
        super(animalsName, age, livingEnvironment);
        this.movementType = ValidationUtils.validOrDefault(movementType,
                "Тип передвижения введен некорректно");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }
    public void walk() {
        System.out.println("Нелетающие птицы могут гулять.");
    }

    @Override
    public void eat() {
        System.out.println("Нелетающие птицы едят насекомых, рыбу, лягушек и т.д.");
    }

    @Override
    public void go() {
        System.out.println("Не летающие птицы, кроме страусов, " +
                "передвигаются с небольшой скоростью.");
    }


    public static void printInfo(Flightless flightless) {
        System.out.println("Животное: " + flightless.getAnimalsName() + ", " +
                flightless.getAge() + " - летнего возраста, " + "среда обитания: "
                + flightless.getLivingEnvironment() + ". Тип передвижения:" + flightless.getMovementType());}

}
