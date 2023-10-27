import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");

        System.out.print("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        int x1 = Integer.parseInt(coordinate1.substring(1, coordinate1.indexOf(",")));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(" ") + 1,
                coordinate1.indexOf(")")));

        System.out.print("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        int x2 = Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(" ") + 1,
                coordinate2.indexOf(")")));

        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
            java.lang.System.exit(0);
        }

        LinearEquation line = new LinearEquation(x1, y1, x2, y2);
        System.out.println();
        System.out.println(line.lineInfo());
        System.out.println();
        System.out.print("Enter a value for x: ");
        double xValue = scan.nextDouble();
        System.out.println();
        System.out.println("The point on the line is: " + line.coordinateForX(xValue));

    }
}
