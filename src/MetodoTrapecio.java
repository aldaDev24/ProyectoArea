public class MetodoTrapecio {

    public double calcularArea(double a, double b, int n, FuncionPolinomica funcion) {

        double deltaX = (b - a) / (double) n;

        double suma = funcion.evaluar(a) + funcion.evaluar(b);

        for (int i = 1; i < n; i++) {
            double xActual = a + (i * deltaX);
            suma += 2.0 * funcion.evaluar(xActual);
        }

        return (deltaX / 2.0) * suma;
    }
}
