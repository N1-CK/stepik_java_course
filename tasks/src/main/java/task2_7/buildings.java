//package task2_7;
//
//public class buildings {
//
//    public static void main(String[] args) {
//
//        House myHouse = new House();
//        System.out.println(myHouse);
//        myHouse.setPeopleCapacity(2);
//        myHouse.addResidents("Me");
//        myHouse.addResidents("Enother Me");
//        myHouse.addResidents("Next time Me");
//        System.out.println(myHouse);
//
//        HighRiseBuilding ESB = new HighRiseBuilding();
//        ESB.setQuanityFlors(5);
//        ESB.fillStage(3);
//        ESB.ParkingPlaces(10);
//        System.out.println(ESB.fellarkingPlaces(4));
//        System.out.println(ESB);
//
//        Library Krupskaya = new Library();
//        Krupskaya.setName("\"Крупская\"");
//        Krupskaya.setPeopleCapacity(10);
//        Krupskaya.residentAdd(2);
//        Krupskaya.bookAdd("War&pice");
//        System.out.println(Krupskaya);
//
//        ShoppingCenter Alimpic = new ShoppingCenter();
//        Alimpic.magazineAdd("Bershka");
//        Alimpic.magazineAdd("Zala");
//        System.out.println(Alimpic);
//
//
//        PoliceDepartment sixPart = new PoliceDepartment();
//        sixPart.setPolicemanCapacity(5);
//        sixPart.polisemanAdd("John");
//        System.out.println(sixPart);
//
//        University MGU = new University();
//        MGU.setStudentCapacity(10);
//        MGU.studentsAdd(9);
//        System.out.println(MGU);
//
//
//
//
//    }
//
//
//}
//abstract class Building {
//    private static int counter;
//    private  Integer id;
//    private  String name; // название
//    private  String location; // адрес
//    private  String buildEar; // год постройки
//    private  String nameOfArchitect; // имя архитектора
//    private  Boolean isArchitecturalMonument; //
//
//
//    {
//        counter++;
//        this.id = counter;
//        this.name = "Имя не присвоено";
//        this.location = "Адрес не назначен";
//        this.buildEar = "Год посторйки не задан";
//        this.nameOfArchitect = "Архитектор неизвестен";
//        this.isArchitecturalMonument = null;
//    }
//
//    public static int getCounter() {
//        return counter;
//    }
//    public static void setCounter(int counter) {
//        Building.counter = counter;
//    }
//    public Integer getId() {
//        return id;
//    }
//    public void setId(Integer id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getLocation() {
//        return location;
//    }
//    public void setLocation(String location) {
//        this.location = location;
//    }
//    public String getBuildEar() {
//        return buildEar;
//    }
//    public void setBuildEar(String buildEar) {
//        this.buildEar = buildEar;
//    }
//    public String getNameOfArchitect() {
//        return nameOfArchitect;
//    }
//    public void setNameOfArchitect(String nameOfArchitect) {
//        this.nameOfArchitect = nameOfArchitect;
//    }
//    public Boolean getArchitecturalMonument() {
//        return isArchitecturalMonument;
//    }
//    public void setArchitecturalMonument(Boolean architecturalMonument) {
//        isArchitecturalMonument = architecturalMonument;
//    }
//
//    @Override
//    public String toString() {
//        return "class="+getClass()+
//                ", id=" + getId() +
//                ", name='" + getName() + '\'' +
//                ", location='" + getLocation() + '\'' +
//                ", buildEar='" + getBuildEar() + '\'' +
//                ", nameOfArchitect='" + getNameOfArchitect() + '\'' +
//                ", isArchitecturalMonument=" + getArchitecturalMonument()
//                ;
//    }
//}
//public class HighRiseBuilding extends Building{
//    private static final String buildingAppointment = "Многофункциональное здание";
//    private Integer quanityFlors; // Чило этажей
//    private Integer ParkingPlaces; // Наличие бесплатной парковки
//
//    {
//        this.quanityFlors = 00;
//        this.ParkingPlaces = 0;
//    }
//
//    public void setQuanityFlors(Integer quanityFlors) {
//        this.quanityFlors = quanityFlors;
//    }
//
//    public void ParkingPlaces(Integer freeParkingPlaces) {
//        this.ParkingPlaces = freeParkingPlaces;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString()+
//                ", quanityFlors=" + quanityFlors +
//                ", ParkingPlaces=" + ParkingPlaces +
//                ", buildingAppointment="+buildingAppointment;
//
//    }
//
//    //Количество свободных этажей. Если этаж заполняется  свободных этажей становится меньше
//    public void fillStage(Integer fillStage){
//        int freeStages = quanityFlors - fillStage;
//        if(freeStages>0){
//            System.out.println( "количество свободных этажей = "+ freeStages);
//        }else if (freeStages<=0){
//            System.out.println("Нет свободных этажей!");}
//    }
//    //Количество свободных парковочных мест, количество парковочных мест - количество машин посетителей
//    public String fellarkingPlaces(int quanityOfVisitorsCars){
//        int freeParkingPlaces =ParkingPlaces-quanityOfVisitorsCars;
//
//
//        return (freeParkingPlaces > 0? "количество свободных парковочных мест = "+freeParkingPlaces:
//                "Нет свободных парковочных мест");
//
//    }
//
//
//}
//import java.util.LinkedList;
//
//public class House extends Building{
//    private static final String buildingAppointment = "Проживание людей";
//    private Integer roomQuanity; // количество комнат
//    private Double leaveSquare; // жилая площадь
//
//    public void setPeopleCapacity(Integer peopleCapacity) {
//        this.peopleCapacity = peopleCapacity;
//        System.out.println("вместимость изменена на "+ peopleCapacity);
//    }
//
//    private Integer peopleCapacity; // вместимость дома (чел.)
//    private LinkedList<String> Residents = new LinkedList<>(); // список жильцов
//
//    {
//        this.roomQuanity = 0;
//        this.leaveSquare =0.0;
//        this.peopleCapacity =0;
//    }
//    @Override
//    public String toString() {
//        return super.toString()+
//                ", roomQuanity=" + roomQuanity +
//                ", leaveSquare=" + leaveSquare +
//                ", peopleCapacity=" + peopleCapacity +
//                ", buildingAppointment="+buildingAppointment;
//
//    }
//
//    // Добавить имя жителя в дом, есл исвободных мест нет то он не будет добавлен.
//    public LinkedList addResidents(String humanName){
//
//        if (peopleCapacity>0){
//            this.peopleCapacity--;
//            Residents.add(humanName);
//            System.out.println("Добавлен жилец " + humanName);
//            System.out.println("Количество свободных меств в доме = " + peopleCapacity);
//        }else {
//            System.out.println("свободных мест нет, ищите другое жильё");
//        }
//        return Residents;
//    }
//
//
//}
//class Library extends Building{
//    private static final String buildingAppointment = "Хранение и предоставление доступа к книгам";// назначение здания
//    private  Integer bookQuanity; // кличество книг
//    private  Integer peopleCapacity; // вместимость(людей);
//
//    {
//        this.bookQuanity = 00;
//        this.peopleCapacity = 00;
//    }
//
//    public void setPeopleCapacity(Integer peopleCapacity) {
//        this.peopleCapacity = peopleCapacity;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString()+
//                ", bookQuanity=" + bookQuanity +
//                ", peopleCapacity=" + peopleCapacity +
//                ", buildingAppointment="+buildingAppointment;
//
//    }
//    //Возвращает количество книг в дидлиотеке
//    public void bookAdd (String Book){
//        this.bookQuanity++;
//        System.out.println("В библиотеке "+ this.getName()+ " теперь " + bookQuanity + " книг" );
//    }
//    // возвращает количество свободных мест в библиотеке
//    public int residentAdd(int quanituResidents){
//        int freeSpaces = peopleCapacity-quanituResidents;
//        System.out.println("В библиотеке " + this.getName()+ " осталось "+ freeSpaces +" мест");
//        return freeSpaces;
//    }
//}
//
//public class PoliceDepartment extends Building{
//    private static final String buildingAppointment = "Расположение отделения полиции";
//    private Integer policemanCapacity; // количество служебных мест
//    private Integer cajeCapacity; // количество камер
//
//    {
//        this.policemanCapacity = 0;
//        this.cajeCapacity =0;
//    }
//
//    public void setPolicemanCapacity(Integer policemanCapacity) {
//        this.policemanCapacity = policemanCapacity;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString()+
//                ", policemanCapacity=" + policemanCapacity +
//                ", cajeCapacity=" + cajeCapacity +
//                ", buildingAppointment="+buildingAppointment;
//
//    }
//
//    public void polisemanAdd (String newPolicemanName){
//        int policemanQuanity;
//        if(policemanCapacity>0){
//            policemanQuanity = policemanCapacity-1;
//            System.out.println("В полицейском участке осталось " + policemanQuanity+ " свободных мест");
//        }else {
//            System.out.println("Мест нет, иди работай в Макдак");
//        }
//
//    }
//
//}
//import java.util.LinkedList;
//
//public class ShoppingCenter extends Building{
//    private static final String buildingAppointment = "Торговые помещения";// назначение здания
//    private Double tradingSquare;//торговая площадь
//    private Integer magazinesQuanity;// количество магазинов
//    private LinkedList <String> Magazines = new LinkedList<>(); // список магазинов
//    {
//        this.tradingSquare=0.0;
//        this.magazinesQuanity=0;
//
//    }
//    @Override
//    public String toString() {
//        return super.toString()+
//                ", tradingSquare=" + tradingSquare +
//                ", magazinesQuanity=" + magazinesQuanity +
//                ", buildingAppointment="+buildingAppointment;
//
//    }
//
//    // Добавить магазин в торговый центр. при этом количество магазинов увеличивается.
//    public LinkedList<String> magazineAdd (String nameMagazine){
//        Magazines.add(nameMagazine);
//        this.magazinesQuanity = Magazines.size();
//        System.out.println("Количество магазинов = " + magazinesQuanity);
//        return Magazines;
//    }
//}
//public class University extends Building {
//    private static final String buildingAppointment = "Проведение учебных занятий";// назначение здания
//    private Integer studentCapacity; // вместимость студенов
//    private Integer yearsSinceFounding; // лет с основния
//    private Boolean isHight; // высшее уч. заведение?
//    private Integer FreeSpaceForStudents;
//
//    {
//        this.studentCapacity = 0;
//        this.yearsSinceFounding = 0;
//        this.isHight = false;
//        this.FreeSpaceForStudents=0;
//    }
//
//    public void setStudentCapacity(Integer studentCapacity) {
//        this.studentCapacity = studentCapacity;
//    }
//
//    public void studentsAdd (int studentRecived){
//        FreeSpaceForStudents= studentCapacity-studentRecived;
//        System.out.println( FreeSpaceForStudents >0?
//                "Осталось " + FreeSpaceForStudents + " сыободных мест" :
//                "Мест нет иди работать грузчиком!");
//    }
//
//    @Override
//    public String toString() {
//        return super.toString()+
//                ", studentCapacity=" + studentCapacity +
//                ", yearsSinceFounding=" + yearsSinceFounding +
//                ", FreeSpaceForStudents=" + FreeSpaceForStudents +
//                ", buildingAppointment="+buildingAppointment;
//
//    }
//
//}