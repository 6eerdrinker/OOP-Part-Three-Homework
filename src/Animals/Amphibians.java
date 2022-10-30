package Animals;

import java.util.Objects;

public class Amphibians extends Animals{
    String livingEnvironment;

    public Amphibians(String animalsName, int age, String livingEnvironment) {
        super(animalsName, age);
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Некорректно указана среда обитания";
        }else {
            this.livingEnvironment = livingEnvironment;}
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
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        System.out.println("Разные земноводные передвигаются с разной скоростью.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Amphibians{} " + super.toString();
    }

    public static void printInfo(Amphibians amphibians) {
        System.out.println("Животное: " + amphibians.getAnimalsName() + ", " +
                amphibians.getAge() + " - летнего возраста, " + "среда обитания: "
                + amphibians.getLivingEnvironment() + ". ");}
}
