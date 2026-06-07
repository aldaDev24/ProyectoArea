import java.util.InputMismatchException;
import java.util.Scanner;
public class EntradaDatos {
    private final Scanner scanner;

    public EntradaDatos() {
        this.scanner = new Scanner(System.in);
    }

    public double[] leerCoeficientes() {
        double[] coeficientes = new double[3];

        while (true) {
            try {
                System.out.println("--- Ingrese los coeficientes de la función cuadrática (ax² + bx + c) ---");

                System.out.print("Coeficiente a (x²): ");
                coeficientes[0] = scanner.nextDouble();

                Excepciones.validarInfinity(coeficientes[0],"El coeficiente a");

                System.out.print("Coeficiente b (x¹): ");
                coeficientes[1] = scanner.nextDouble();

                Excepciones.validarInfinity(coeficientes[1],"El coeficiente b");

                System.out.print("Coeficiente c (término independiente): ");
                coeficientes[2] = scanner.nextDouble();

                Excepciones.validarInfinity(coeficientes[2],"El coeficiente c");

                return coeficientes;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número decimal válido. Intente nuevamente.\n");
                scanner.next();
            }
        }
    }
    public double[] leerLimites() {
        double[] limites = new double[2];

        while(true){
            try{

                System.out.print("Ingrese el limite inferior: ");
                double a = scanner.nextDouble();
                Excepciones.validarInfinity(a,"El limite superior");

                System.out.print("Ingrese el limite superior: ");
                double b = scanner.nextDouble();
                Excepciones.validarInfinity(b,"El limite inferior");

                if(a>b){
                    limites[0]=b;
                    limites[1]=a;
                }else{
                    limites[0]=a;
                    limites[1]=b;
                }

                return limites;
            }catch(InputMismatchException e){
                System.out.println("Error: Debe ingresar numeros validos. Intente nuevamente.\n");
                scanner.next();
            }
        }
    }

    public int leerNumeroTrapecios() {
        while(true){
            try{
                System.out.print("Numero de trapecios (n): ");
                return scanner.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Debe ingresar un numero entero.");
                scanner.next();
            }
        }
    }
}

