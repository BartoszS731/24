import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj pierwszą liczbę:");
            double num1 = scanner.nextDouble();

            System.out.println("Podaj operator (+, -, *, /) lub 'q' aby zakończyć:");
            String operator = scanner.next();

            // Exit condition
            if (operator.equals("q")) {
                System.out.println("Kalkulator zakończył działanie.");
                break;
            }

            System.out.println("Podaj drugą liczbę:");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Błąd: Dzielenie przez zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Błędny operator. Spróbuj ponownie.");
                    continue;
            }

            System.out.println("Wynik: " + result);
        }

        scanner.close();
    }
}
