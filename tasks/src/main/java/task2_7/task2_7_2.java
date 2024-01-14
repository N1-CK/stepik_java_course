//package task2_7;
//
//interface LivingHouse {
//    int getNumberOfRooms();
//    int getNumberOfFloors();
//}
//
//public interface task2_7_2 {
//    int getNumberOfSeats();
//    String getWorkingHours();
//}
//
//public class Apartment extends Building implements LivingHouse {
//
//    public Apartment(String name, String address, int area, int numberOfFloors, int numberOfRooms) {
//        super(name, address, area, numberOfFloors);
//        this.numberOfRooms = numberOfRooms;
//    }
//
//    private int numberOfRooms;
//
//    @Override
//    public int getNumberOfRooms() {
//        return numberOfRooms;
//    }
//
//    @Override
//    public String toString() {
//        return "Apartment{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", area=" + area +
//                ", numberOfFloors=" + numberOfFloors +
//                ", numberOfRooms=" + numberOfRooms +
//                '}';
//    }
//}
//
//public class Restaurant extends Building implements task2_7_2 {
//
//    public Restaurant(String name, String address, int area, int numberOfFloors, int numberOfSeats, String workingHours) {
//        super(name, address, area, numberOfFloors);
//        this.numberOfSeats = numberOfSeats;
//        this.workingHours = workingHours;
//    }
//
//    private int numberOfSeats;
//    private String workingHours;
//
//    @Override
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    @Override
//    public String getWorkingHours() {
//        return workingHours;
//    }
//
//    @Override
//    public String toString() {
//        return "Restaurant{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", area=" + area +
//                ", numberOfFloors=" + numberOfFloors +
//                ", numberOfSeats=" + numberOfSeats +
//                ", workingHours='" + workingHours + '\'' +
//                '}';
//    }
//}