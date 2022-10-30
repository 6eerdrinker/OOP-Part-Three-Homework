package Animals;

public class Animals {
    private String animalsName;
    private int age;

    public Animals(String animalsName, int age) {
        if (animalsName == null || animalsName.isBlank() || animalsName.isEmpty()) {
            this.animalsName = "Название животного введено некорректно";
        }else {
            this.animalsName = animalsName;}
        if (age == 0) {
            System.out.println("Возраст животного введен некорректно");
        }else {
            this.age = age;}
    }

    public String getAnimalsName() {
        return animalsName;
    }

    public void setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Все животные питаются.");
    }

    public void sleep() {
        System.out.println("Все животные спят.");
    }

    public void go() {
        System.out.println("Все животные передвигаются.");
    }
}
