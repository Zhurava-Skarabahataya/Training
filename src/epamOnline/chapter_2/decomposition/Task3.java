package epamOnline.chapter_2.decomposition;

//3. Вычислить площадь правильного шестиугольника со стороной а,
// используя метод вычисления площади треугольника.

public class Task3 {
    public static void main(String[] args) {
        double a = 6;
        double oneTriangle = Math.sqrt(3) * a * a / 4;
        double hexagonSquare = oneTriangle * 6;
        System.out.println(hexagonSquare);
    }
}
