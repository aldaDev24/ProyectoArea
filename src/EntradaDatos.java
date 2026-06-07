import java.util.Scanner;
public class EntradaDatos {
    private final Scanner scanner;

    public EntradaDatos() {
        this.scanner = new Scanner(System.in);
    }
    public double[] leerCoeficientes() {
        // Arreglo de 3 posiciones: [0] es 'c', [1] es 'b', [2] es 'a'
        double[] coeficientes = new double[3];

        System.out.println("--- Ingrese los coeficientes de la función cuadrática (ax² + bx + c) ---");

        System.out.print("Coeficiente a (x²): ");
        coeficientes[2] = scanner.nextDouble();

        System.out.print("Coeficiente b (x¹): ");
        coeficientes[1] = scanner.nextDouble();

        System.out.print("Coeficiente c (término independiente): ");
        coeficientes[0] = scanner.nextDouble();

        return coeficientes;
    }

    public double[] leerLimites() {
        double[] limites = new double[2]; // [0] = inferior, [1] = superior

        System.out.print("Límite inferior: ");
        limites[0] = scanner.nextDouble();

        System.out.print("Límite superior: ");
        limites[1] = scanner.nextDouble();

        return limites;
    }
    public int leerNumeroTrapecios() {
        int n;
        while (true) {
            System.out.print("Número de trapecios (n): ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Error: El número de trapecios debe ser mayor a 0.");
            } else if (n >= 100_000_000) {
                System.out.println("Error: 'n' demasiado grande. Causará errores de redondeo. Intente un valor menor.");
            } else {
                break;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        EntradaDatos entrada = new EntradaDatos();
        double[] coeficientes = entrada.leerCoeficientes();
        double[] limites = entrada.leerLimites();
        int trapecios = entrada.leerNumeroTrapecios();

        System.out.println("\n--- [MÓDULO ENTRADA] Datos enviados a la rama 'entrada-datos' ---");
    }
}