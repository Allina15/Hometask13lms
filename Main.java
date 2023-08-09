
public class Main {
    public static void main(String[] args) {
        double radius = 5.0;

        double area1 = Circle.calculateArea(radius);
        double circumference = Circle.calculateCircumference(radius);

        System.out.println("Площадь окружности с радиусом " + radius + " равна " + area1);
        System.out.println("Длина окружности с радиусом " + radius + " равна " + circumference);
    }
}

