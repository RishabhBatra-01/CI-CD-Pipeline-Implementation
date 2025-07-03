class Calculator{
    public int add(int a, int b) {
        return a + b;
    }
}
public class CalculatorMain {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int add = cal.add(1, 2);
        System.out.println("Result : " + add);

    }
}