//package task2_9_1;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        // Создаем фигуры
//        Figure figure = new Figure("Фигура", "Красный");
//        Triangle triangle = new EquilateralTriangle("Треугольник", "Жёлтый", 10, 10, 10);
//        Quadrilateral quadrilateral = new Rectangle("Четырёхугольник", "Зелёный", 10, 20, 30, 40);
//        Pentagon pentagon = new Pentagon("Пятиугольник", "Голубой", 10, 20, 30, 40, 50);
//        Hexagon hexagon = new Hexagon("Шестиугольник", "Синий", 10, 20, 30, 40, 50, 60);
//        Oval oval = new Oval("Овал", "Фиолетовый", 10, 20);
//        Circle circle = new Circle("Окружность", "Чёрный", 10);
//
//        // Выводим информацию о фигурах
//        System.out.println("Фигура: " + figure.getName() + ", цвет: " + figure.getColor());
//        System.out.println("Треугольник: " + triangle.getName() + ", цвет: " + triangle.getColor() + ", стороны: " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3());
//        System.out.println("Четырёхугольник: " + quadrilateral.getName() + ", цвет: " + quadrilateral.getColor() + ", стороны: " + quadrilateral.getSide1() + ", " + quadrilateral.getSide2() + ", " + quadrilateral.getSide3() + ", " + quadrilateral.getSide4());
//    }
//}