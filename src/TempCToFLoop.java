import java.util.Scanner;

public class TempCToFLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC = 0.00;
        double tempF = 0.00;
        boolean valid = false;
        boolean run = true;
        String keepRunning = "";

        while (run) {
            System.out.println("Please input your temperature in Celsius.");
            do {
                if (scan.hasNextDouble()) {
                    valid = true;
                    tempC = scan.nextDouble();
                } else {
                    System.out.println("Invalid input, please try again");
                }
                scan.nextLine();
            } while (!valid);
            tempF = tempC * 9 / 5 + 32;

            System.out.printf("%-10s%7.2f", "Degrees C:", tempC);
            System.out.printf("\n%-10s%7.2f", "Degrees F", tempF);

            System.out.println("");
            System.out.println("Continue? Y/N");
            keepRunning = scan.nextLine();
            if (keepRunning.equalsIgnoreCase("N")) {
                run = false;
            }
        }
    }
}