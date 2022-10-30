package Animals;

import java.util.Objects;

public class Flying extends Birds {
    String movementType;



    public Flying(String animalsName, int age, String livingEnvironment, String movementType) {
        super(animalsName, age, livingEnvironment);
        if (movementType == null || movementType.isBlank() || movementType.isEmpty()) {
            this.movementType = "Тип передвижения указан не корректно.";
        }else
        {this.movementType = movementType;}

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
    public void hunt() {
        super.hunt();
    }

    @Override
    public void eat() {
        System.out.println("Летающие птицы питаются насекомыми, рыбой, мелкими животными.");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        System.out.println("Летающие птицы передвигаются с высокой скоростью.");;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying fying = (Flying) o;
        return Objects.equals(movementType, fying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementType);
    }

    @Override
    public String toString() {
        return "Fying{" +
                "movementType='" + movementType + '\'' +
                "} " + super.toString();
    }
    public static void printInfo(Flying flying) {
        System.out.println("Животное: " + flying.getAnimalsName() + ", " +
                flying.getAge() + " - летнего возраста, " + "среда обитания: "
                + flying.getLivingEnvironment() + ". Тип передвижения:" + flying.getMovementType());}
}
