class Calculator{
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}
public class CalculatorMain {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int add = cal.add(1, 2);
        System.out.println("Addition Result : " + add);

        System.out.println();

        int subtract = cal.subtract(5, 6);
        System.out.println("Subtraction Result : " + subtract);

    }
}