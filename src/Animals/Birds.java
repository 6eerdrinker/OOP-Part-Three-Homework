package Animals;

import Transport.ValidationUtils;

public class Birds extends Animals{
    String livingEnvironment;

    public Birds(String animalsName, int age, String livingEnvironment) {
        super(animalsName, age);
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "Среда обитания введена некорректно");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
    public void hunt() {
        System.out.println("Для добычи пищи птицы охотятся.");
    }
    @Override
    public void eat() {
        System.out.println("Птицы питаются зерном, насекомыми, ягодой, мясом, хлебом, рыбой.");;
    }
    @Override
    public void go() {
        System.out.println("Не все птицы летают.");;
    }
}
