package Animals;

import Transport.ValidationUtils;

import java.util.Objects;

public class Herbivores extends Mammal{
    String foodType;

    public Herbivores(String animalsName, int age, String livingEnvironment,
                      String travelSpeed, String foodType) {
        super(animalsName, age, livingEnvironment, travelSpeed);
        this.foodType = ValidationUtils.validOrDefault(foodType, "Некорректно указан тип еды");
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void graze() {
        System.out.println("Для получения пищи травоядные пасутся.");
    }

    @Override
    public void eat() {
        System.out.println("Травоядные едят растительность.");
    }

    @Override
    public void go() {
        System.out.println("Разные травоядные передвигаются с разной скоростью.");;
    }

    public static void printInfo(Herbivores herbivores) {
        System.out.println("Животное: " + herbivores.getAnimalsName() + ", " +
                herbivores.getAge() + " - летнего возраста, " + "среда обитания: "
                + herbivores.getLivingEnvironment() + ". " + herbivores.getTravelSpeed() +
                ". Тип питания: " + herbivores.getFoodType());}

}
