package Transport;

import java.time.LocalDate;

public class Transport_Main {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta",
                2015,
                "Желтый","Россия", 160,
                1.7f,
                "Автомат",
                "Седан", "В666РА777",
                5, true, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(), 6_500,"999999999"));


        Car audi = new Car("Ауди", "A8 50 L TDI quattro",
                2020,
                "Черный",
                "Германия", 240,
                3.0f,
                "Автомат", "Седан",
                "А888АА028", 5, false, new Car.Key(true,false),
                new Car.Insurance(LocalDate.now(),16_000,"123456789"));

        Car bmw = new Car("BMW", "Z8", 2021,
                "Черный", "Германия", 220,
                3.0f,
                "Автомат", "Кроссовер",
                "О000ОО000", 5, true, new Car.Key(true, true),
                new Car.Insurance(LocalDate.now(),25_000, "222"));

        Car kia = new Car("KIA", "Sportage 4-го поколения", 0,
                "Красный", "Южная Корея", 180,
                2.0f,
                "Автомат", "Кроссовер", "М367ВА125",
                5, false, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(),10_000,"987654321"));

        Car hyundai = new Car("Hyundai", "Avante", 2016,
                "Оранжевый", "Южная Корея", 200,
                1.6f,
                "Вариатор", "Седан", "888888888",
                5, true,new Car.Key(false,true),
                new Car.Insurance(LocalDate.now(),15_000,"098658431"));

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
        lada.refill();
        System.out.println();


        Train lastochka = new Train("Ласточка", "В-901", 2011,
                null, "России", 301, 3_500f,
                "18 часов", "Белорусского вокзала",
                "Минск - пассажирский",11);
        Train leningrad = new Train("Ленинград", "D-125", 2019,
                null, "Россия", 270, 1_700f,
                "12 часов", "Ленинградский вокзал",
                "Ленинград - пассажирский", 0);
        printInfo(lastochka);
        printInfo(leningrad);
        lastochka.refill();

        System.out.println();
        Bus paz = new Bus("ПАЗ", "3205", 2019,
                "Желтый", "Россия", 120,
                7, 37, 35);
        Bus daewoo = new Bus("Daewoo", "BS-106", 2012,
                "Белый", "Южная Корея", 160,
                20, 28, 50);
        Bus gaz = new Bus("Газ", "32215", 2011,
                "Синий", "Россия", 120,
                17, 32, 55);
        printInfo(paz);
        printInfo(daewoo);
        printInfo(gaz);
        paz.refill();
    }
    private static void printInfo(Car car) {
        System.out.println("Автомобиль: " + car.getBrand() + " " + car.getModel() +
                ", " + car.getProductionYear() + " года выпуска," +
                " объем двигателя: " + car.getEngineVolume() +
                " л., цвет: " + car.getColor() + ". Страна сборки: "
                + car.getAssemblyCountry() + ". Максимальная скорость: "
                + car.getMaxSpeed() + " км/ч" +
                ", трансмиссия: " + car.getTransmission() +
                ", тип кузова: " + car.getBodyType() +
                ", количество мест в салоне: " + car.getSeatsNum() +
                ". Государственный регистрационный номер: "
                + car.getRegNumber() + (car.isRegNumberValid() ? " - Корректный" : " - Некорректный")
                + " номер" + ". " + (car.isWinterTires() ? "Зимняя резина. " : "Летняя резина.") +
                " " + (car.getKey().isKeylessAccess() ? "Безключевой доступ." : "Безключевой доступ отсутствует.") +
                " " + (car.getKey().isRemoteEngineStart() ? "Дистанционный запуск." : "Без дстанционного запуска.") +
                " Номер страховки: " + car.getInsurance().getNumber() +
                " Стоимость страховки: " + car.getInsurance().getCost() +
                " Срок действия страховки: " + car.getInsurance().getValidUntil()
        );
    }

    public static void printInfo(Train train) {
        System.out.println("Поезд: " + train.getBrand() + " " + train.getModel() + " "
                + train.getProductionYear() + " года выпуска в " + train.getAssemblyCountry()
                + ", скорость передвижения - " + train.getMaxSpeed() + ". Отходит от " + train.getDepartureStation()
                + " и следует до станции " + train.getArrivalStation() + ". Время поездки - "
                + train.travelTime + ". Цена поездки - " + train.getTripPrice() +
                " рублей " + ". Вагонов в составе - " + train.wagonsNumber + ".");
    }

    public static void printInfo(Bus bus) {
        System.out.println("Автобус: " + bus.getBrand() + " " + bus.getModel()
                + " " + bus.getProductionYear() + " года выпуска, производство - " + bus.getAssemblyCountry() +
                ", скорость движения - " + bus.getMaxSpeed() + ". Следует по маршруту № " +
                bus.getRoutNumber() + ". Количество посадочных мест - "
                + bus.getNumberOfSeats() + ". Стоимость поездки - " + bus.getFare() + " рублей.");
    }
    }

