package Animals;

public class Birds extends Animals{
    String livingEnvironment;

    public Birds(String animalsName, int age, String livingEnvironment) {
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
        System.out.println("Для добычи пищи птицы охотятся.");
    }

    @Override
    public void eat() {
        System.out.println("Птицы питаются зерном, насекомыми, ягодой, мясом, хлебом, рыбой.");;
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        System.out.println("Не все птицы летают.");;
    }
}
