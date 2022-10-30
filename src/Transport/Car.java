package Transport;

import java.time.LocalDate;

public class Car extends Transport {
    public float engineVolume;
    public String transmission;
    private final String bodyType;
    public String regNumber;
    private final int seatsNum;
    public boolean winterTires;
    private final Key key;
    private final Insurance insurance;

    public Car(String brand, String model, int productionYear,
               String color, String assemblyCountry,
               int maxSpeed, float engineVolume,
               String transmission, String bodyType,
               String regNumber, int seatsNum,
               boolean winterTires,
               Key key,
               Insurance insurance) {

        super(brand, model, productionYear, color, assemblyCountry, maxSpeed);

        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "Не корректно введены данные";
        } else {
            this.bodyType = bodyType;
        }
        this.regNumber = regNumber;
        this.seatsNum = Math.max(seatsNum, 1);
        this.winterTires = winterTires;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setWinterTires(isWinterTires());

    }


    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth <= 4 || currentMonth >= 11 != this.winterTires) {
            System.out.println("Нужные обутки уже установлены");
        } else {
            System.out.println("Пора переобуться");
        }
    }

    public boolean isRegNumberValid() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2]) && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4]) && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6]) && isNumber(regNumberChars[7]) && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char simbol) {
        return Character.isDigit(simbol);
    }

    private boolean isNumberLetter(char simbol) {
        String allowedSimbols = "АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЭЮЯ";
        return allowedSimbols.contains("" + simbol);
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = ValidationUtils.validOrDefault(transmission, "МКПП");
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = ValidationUtils.validOrDefault(regNumber, "Не корректный номер");
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = isWinterTires();
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public void refill() {
        System.out.println("Автомобиль можно заправить бензином, " +
                "дизельным топливом или зарядить электричеством");

    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }


        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            if (validUntil == null) {
                this.validUntil = LocalDate.now().plusDays(365);
            } else {
                this.validUntil = validUntil;
            }

            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }


        public Insurance() {
            this(null, 10_000, null);

        }

        public LocalDate getValidUntil() {
            return validUntil;
        }

        public float getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidUntil() {
            if (validUntil.isBefore(LocalDate.now()) || validUntil.equals(LocalDate.now())) {
                System.out.println("Срочно оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки не корректный");
            }
        }


    }

}
