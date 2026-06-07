import java.util.InputMismatchException;
import java.util.Scanner;
public class EntradaDatos {
    private final Scanner scanner;

    public EntradaDatos() {
        this.scanner = new Scanner(System.in);
    }
   import java.util.InputMismatchException;

    public double[] leerCoeficientes() {
        double[] coeficientes = new double[3];

        while (true) {
            try {
                System.out.println("--- Ingrese los coeficientes de la función cuadrática (ax² + bx + c) ---");

                System.out.print("Coeficiente a (x²): ");
                coeficientes[0] = scanner.nextDouble();

                System.out.print("Coeficiente b (x¹): ");
                coeficientes[1] = scanner.nextDouble();

                System.out.print("Coeficiente c (término independiente): ");
                coeficientes[2] = scanner.nextDouble();

                return coeficientes;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número decimal válido. Intente nuevamente.\n");
                scanner.next();
            }
        }
    }
    public double[] leerLimites(double a, double b) {
        double[] limites = new double[2];
        if (a > b) {
            limites[0] = b;
            limites[1] = a;
        } else {
            limites[0] = a;
            limites[1] = b;
        }

        return limites;
    }

    public int leerNumeroTrapecios() {
        int n;
            System.out.print("Número de trapecios (n): ");
            n = scanner.nextInt();
        return n;
    }
}

