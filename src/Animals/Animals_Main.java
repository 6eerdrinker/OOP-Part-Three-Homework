package Animals;

import java.util.*;

public class Animals_Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 8, "долина",
                "Большая скорость передвижения", "Растительная пища");
        Herbivores giraffe = new Herbivores("Жираф", 5, "джунгли",
                "Средняя скорость передвижения", "Питается растительной пищей");
        Herbivores horse = new Herbivores("Лошадь", 10, "степь",
                "Большая скорость передвижения", "Питается травой и сеном");
        Predators hyena = new Predators("Гиена", 5, "джунгли, долина",
                "Средняя скорость передвижения", "Питается мясом");
        Predators tiger = new Predators("Тигр", 7, "лес, джунгли, долина, степь",
                "Большая скорость передвижения", "Питается мясом");
        Predators bear = new Predators("Медведь", 10, "лес",
                "Средняя скорость передвижения", "Питается мясом, медом");
        Amphibians frog = new Amphibians("Лягушка", 1, "болото");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 2, "лес, луг");
        Flightless peacock = new Flightless("Павлин", 20, "лужайки",
                " семенит.");
        Flightless penguin = new Flightless("Пингвин", 2, "льдина",
                " ходит.");
        Flightless doDo = new Flightless("До-До", 1, "Ду-ду",
                " не летает.");
        Flying gull = new Flying("Чайка", 1, "небо, скалы",
                " летает над водой.");
        Flying albatross = new Flying("Альбатрос", 2, "небо над морем",
                " летает.");
        Flying falcon = new Flying("Сокол", 1, "небо",
                " парит.");

        System.out.println("Животные: ");
        System.out.println();
        System.out.println("1. Млекопитающие:");

        System.out.println();
        System.out.println("1.1. Травоядные: ");
        Herbivores.printInfo(gazelle);
        Herbivores.printInfo(giraffe);
        Herbivores.printInfo(horse);
        gazelle.graze();
        gazelle.eat();
        gazelle.go();
        gazelle.walk();

        System.out.println();
        System.out.println("1.2 Хищники: ");
        Predators.printInfo(hyena);
        Predators.printInfo(tiger);
        Predators.printInfo(bear);
        tiger.hunt();
        tiger.eat();
        tiger.go();

        System.out.println();
        System.out.println("2. Земноводные: ");
        Amphibians.printInfo(frog);
        Amphibians.printInfo(alreadyFreshwater);
        frog.hunt();
        frog.eat();
        frog.go();

        System.out.println();
        System.out.println("3. Птицы:");
        System.out.println("3.1 Нелетающие:");
        Flightless.printInfo(peacock);
        Flightless.printInfo(penguin);
        Flightless.printInfo(doDo);
        penguin.hunt();
        penguin.eat();
        penguin.walk();

        System.out.println();
        System.out.println("3.2 Летающие: ");
        Flying.printInfo(gull);
        Flying.printInfo(albatross);
        Flying.printInfo(falcon);
        falcon.hunt();
        falcon.eat();
        falcon.go();
        System.out.println();

//        Animals[] animal = {gazelle, giraffe, horse, hyena, tiger, bear,
//                frog, alreadyFreshwater, peacock, penguin, doDo, gull, albatross, falcon};
        System.out.println("Проверка на дублирование");
        Herbivores[] herbivores = {gazelle, giraffe, horse};
        System.out.println("В классе травоядных " + Arrays.toString(herbivores));
        System.out.println("Повторения: " +getDuplicatesWithIteration(herbivores));
        Predators[] predators = {hyena, tiger, bear};
        System.out.println("В классе хищников " + Arrays.toString(predators));
        System.out.println("Повторения: " +getDuplicatesWithIteration(predators));
        Amphibians[] amphibians = {frog, alreadyFreshwater};
        System.out.println("В классе земноводных " + Arrays.toString(amphibians));
        System.out.println("Повторения: " +getDuplicatesWithIteration(amphibians));
        Flightless[] flightlesses = {peacock, penguin, doDo};
        System.out.println("В классе нелетающих птиц " + Arrays.toString(flightlesses));
        System.out.println("Повторения: " +getDuplicatesWithIteration(flightlesses));
        Flying[] flyings = {gull, albatross, falcon};
        System.out.println("В классе летающих птиц " + Arrays.toString(flyings));
        System.out.println("Повторения: " +getDuplicatesWithIteration(flyings));
    }
    public static <T> List<T> getDuplicatesWithIteration(T[] a) {
        Set<T> duplicates = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            T e1 = a[i];
            if (e1 == null) continue; // игнорируем null
            // сравниваем каждый элемент со всеми остальными
            for (int j = 0; j < a.length; j++) {
                if (i == j) continue; // не проверяем элемент с собой же
                T e2 = a[j];
                if (e1.equals(e2)) {
                    // дубликат найден, сохраним его
                    duplicates.add(e2);
                }
            }
        }
        return new ArrayList<>(duplicates);
    }
}
