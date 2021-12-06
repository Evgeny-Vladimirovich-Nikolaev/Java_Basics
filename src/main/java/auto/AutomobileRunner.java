import java.util.Random;

class AutomobileRunner {

    private static Automobile[] automobiles = createList();

    public static void main(String[] args) {
        run();
    }

    private static Automobile[] createList() {
        automobiles = new Automobile[10];
        for (int i = 0; i < 5; i++) {
            automobiles[i] = new Car(new LicenseGenerator().generate());
        }
        for (int i = 5; i < 10; i++) {
            Truck truck = new Truck(new LicenseGenerator().generate());
            truck.setLoaded(new Random().nextInt(2) % 2 == 0);
            automobiles[i] = truck;
        }
        return automobiles;
    }

    private static void run() {
        for (Automobile auto : automobiles) {
            auto.move(100 + new Random().nextInt(226) * 4);
        }
    }
}

class LicenseGenerator {

    Random random = new Random();

    String generate() {
        StringBuilder license = new StringBuilder();
        license.append(getSymbol());
        license.append(' ');
        for (int i = 0; i < 3; i++) {
            license.append(getDigit());
        }
        license.append(' ');
        license.append(getSymbol());
        license.append(getSymbol());
        return license.toString();
    }

    private char getSymbol() {
        return (char) (random.nextInt(26) + 1040);
    }

    private int getDigit() {
        return random.nextInt(10);
    }
}
