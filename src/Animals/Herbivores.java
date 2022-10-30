package Animals;

import java.util.Objects;

public class Herbivores extends Mammal{
    String foodType;

    public Herbivores(String animalsName, int age, String livingEnvironment,
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

    public void graze() {
        System.out.println("Для получения пищи травоядные пасутся.");
    }

    @Override
    public void walk() {
        System.out.println("Травоядные могут гулять.");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        System.out.println("Травоядные едят растительность.");
    }

    @Override
    public void go() {
        System.out.println("Разные травоядные передвигаются с разной скоростью.");;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }


    @Override
    public String toString() {
        return "Herbivores{" +
                "foodType='" + foodType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", travelSpeed='" + travelSpeed + '\'' +
                "} " + super.toString();
    }

    public static void printInfo(Herbivores herbivores) {
        System.out.println("Животное: " + herbivores.getAnimalsName() + ", " +
                herbivores.getAge() + " - летнего возраста, " + "среда обитания: "
                + herbivores.getLivingEnvironment() + ". " + herbivores.getTravelSpeed() +
                ", тип питания: " + herbivores.getFoodType());}


}
