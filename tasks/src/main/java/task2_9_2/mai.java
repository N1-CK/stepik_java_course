package task2_9_2;

public class mai {

    public static void main(String[] args) {
        Car car = new Car("AA-123", 10);
        Bus bus = new Bus("BB-456", 50);
        Trolleybus trolleybus = new Trolleybus("CC-789", 60);

        System.out.println("Номер автомобиля: " + car.getNumber());
        System.out.println("Вместимость автобуса: " + bus.getCapacity());
        System.out.println("Вместимость троллейбуса: " + trolleybus.getCapacity());

        Tank tank = new Tank(100, 200);
        System.out.println("Броня танка: " + tank.getArmor());
        System.out.println("Огневая мощь танка: " + tank.getFirePower());

        Submarine submarine = new Submarine(500, 1000);
        System.out.println("Скорость подлодки: " + submarine.getSpeed());
        System.out.println("Глубина погружения подлодки: " + submarine.getDepth());
    }
}

class Vehicle {

    private String number;
    private int capacity;

    public Vehicle(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }
}

class Car extends Vehicle implements PublicTransport {

    public Car(String number, int capacity) {
        super(number, capacity);
    }
}

class Bus extends Vehicle {

    public Bus(String number, int capacity) {
        super(number, capacity);
    }
}

class Trolleybus extends Vehicle {

    public Trolleybus(String number, int capacity) {
        super(number, capacity);
    }
}

interface PublicTransport {

    String getNumber();
    int getCapacity();
}

interface MilitaryVehicle {

    int getArmor();
    int getFirePower();
}

interface SteamEngine {

    int getSteamPressure();
    int getBoilerPower();
}

class Tank implements MilitaryVehicle {

    private int armor;
    private int firepower;

    public Tank(int armor, int firepower) {
        this.armor = armor;
        this.firepower = firepower;
    }

    public int getArmor() {
        return armor;
    }

    public int getFirePower() {
        return firepower;
    }
}

class Submarine implements MilitaryVehicle, SteamEngine {

    private int speed;
    private int depth;
    private int steamPressure;
    private int boilerPower;

    public Submarine(int speed, int depth) {
        this.speed = speed;
        this.depth = depth;
        this.steamPressure = steamPressure;
        this.boilerPower = boilerPower;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDepth() {
        return depth;
    }

    public int getSteamPressure() {
        return steamPressure;
    }

    public int getBoilerPower() {
        return boilerPower;
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public int getFirePower() {
        return 0;
    }
}
