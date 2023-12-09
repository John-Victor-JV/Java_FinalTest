// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // testing the program for 3 + 2 * 5
        ArithmeticExp term = new Sum(new Number(3), new Product(new Number(2), new Number(5)));
        System.out.println("Arithmetic calculation is given below.");
        System.out.println(term.ToString() + " = " + term.evaluate());
    }
}