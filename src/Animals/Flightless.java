package Animals;

import java.util.Objects;

public class Flightless extends Birds{
    String movementType;

    public Flightless(String animalsName, int age, String livingEnvironment, String movementType) {
        super(animalsName, age, livingEnvironment);
        if (movementType == null|| movementType.isBlank()|| movementType.isEmpty()) {
            this.movementType = "Тип передвижения указан некорректно";
        }else {
            this.movementType = movementType;}
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
    public void hunt() {
        super.hunt();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        System.out.println("Не летающие птицы, кроме страусов, " +
                "передвигаются с небольшой скоростью.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementType);
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "movementType='" + movementType + '\'' +
                "} " + super.toString();
    }

    public static void printInfo(Flightless flightless) {
        System.out.println("Животное: " + flightless.getAnimalsName() + ", " +
                flightless.getAge() + " - летнего возраста, " + "среда обитания: "
                + flightless.getLivingEnvironment() + ". Тип передвижения:" + flightless.getMovementType());}

}
