public class Excepciones {
    public static void validarNumeroTrapecios(int n){
        if(n<=0){
            throw new IllegalArgumentException(
                    "El numero de trapecios debe ser mayor que cero"
            );
        }
    }

    public static void validarFuncion(double[] coeficientes){
        if (coeficientes == null) {
            throw new IllegalArgumentException(
                    "Los coeficientes no pueden ser nulos"
            );
        }

        if (coeficientes.length < 3){
            throw new IllegalArgumentException(
                    "La funcion debe ser de grado 2 como minimo"
            );
        }

        if (coeficientes[0] == 0.0){
            throw new IllegalArgumentException(
                    "El coeficiente del termino cuadratico no puede ser cero"
            );
        }
    }

    public static void validarInfinity(double valor, String nombre){
        if(Double.isInfinite(valor)){
            throw new IllegalArgumentException(
                    nombre + " es demasiado grande"
            );
        }
    }

}
