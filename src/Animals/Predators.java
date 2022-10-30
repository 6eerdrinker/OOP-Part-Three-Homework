package Animals;

import java.util.Objects;

public class Predators extends Mammal{
    String foodType;
    public Predators (String animalsName, int age, String livingEnvironment,
                      String travelSpeed, String foodType) {
        super(animalsName, age, livingEnvironment, travelSpeed);
        if (foodType == null|| foodType.isBlank()|| foodType.isEmpty()) {
            this.foodType = "Тип еды указан некорректно";
        }else {
            this.foodType = foodType;}
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void hunt() {
        System.out.println("Для добычи пищи хищники охотятся.");
    }

    @Override
    public void go() {
        System.out.println("Хищники передвигаются в основном с большой скоростью.");
    }

    @Override
    public void eat() {
        System.out.println("Хищники едят мясо.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(foodType, predators.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "foodType='" + foodType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", travelSpeed='" + travelSpeed + '\'' +
                "} " + super.toString();
    }
    public static void printInfo(Predators predators) {
        System.out.println("Животное: " + predators.getAnimalsName() + ", " +
                predators.getAge() + " - летнего возраста, " + "среда обитания: "
                + predators.getLivingEnvironment() + ". " + predators.getTravelSpeed() +
                ", тип питания: " + predators.getFoodType());}
}
