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
//https://6bc5-2401-4900-8831-731-6430-3a3b-33b6-99c6.ngrok-free.app/github-webhook/
        // ngrok config add-authtoken 2zS2gXTrs0EVi7ESl9eTzNNUjNv_3i23h2dvAtJ7i8wxQ9Fe8

        int subtract = cal.subtract(5, 6);
        System.out.println("Subtraction Result : " + subtract);

    }
}