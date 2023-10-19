import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        int x1 = Integer.parseInt(coordinate1.substring(1, 2));
        int y1 = Integer.parseInt(coordinate1.substring(4, 5));
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        int x2 = Integer.parseInt(coordinate2.substring(1, 2));
        int y2 = Integer.parseInt(coordinate2.substring(4, 5));

    }
}
