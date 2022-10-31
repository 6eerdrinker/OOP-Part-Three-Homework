package Animals;

import Transport.ValidationUtils;

import java.util.Objects;

public class Predators extends Mammal{
    String foodType;
    public Predators (String animalsName, int age, String livingEnvironment,
                      String travelSpeed, String foodType) {
        super(animalsName, age, livingEnvironment, travelSpeed);
       this.foodType = ValidationUtils.validOrDefault(foodType, "Тип еды введен некорректно");
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
    public static void printInfo(Predators predators) {
        System.out.println("Животное: " + predators.getAnimalsName() + ", " +
                predators.getAge() + " - летнего возраста, " + "среда обитания: "
                + predators.getLivingEnvironment() + ". " + predators.getTravelSpeed() +
                ". Тип питания: " + predators.getFoodType());}
}
