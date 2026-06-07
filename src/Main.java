public class Main {
    public static void main(String[] args) {

        try{
            // Crear entrada de datos
                EntradaDatos entradaDatos = new EntradaDatos();
            // Leer coeficientes
                double[] coeficientes = entradaDatos.leerCoeficientes();
            // Validar funcion
                Excepciones.validarFuncion(coeficientes);
            // Leer limites
                double[] limites = entradaDatos.leerLimites();
                double a = limites[0];
                double b = limites[1];
            // Leer numeros de trapecios
                int numeroTrapecios = entradaDatos.leerNumeroTrapecios();
            // Validar numero de trapecios
                Excepciones.validarNumeroTrapecios(numeroTrapecios);
            // Crear FuncionPolinomica
                FuncionPolinomica funcionPolinomica = new FuncionPolinomica(coeficientes);
            // Crear MetodoTrapecio
                MetodoTrapecio metodoTrapecio = new MetodoTrapecio();
            // Calcular área
                double area = metodoTrapecio.calcularArea(a,b,numeroTrapecios,funcionPolinomica);
            //  Mostrar resultado
                System.out.println("El area es: " + area);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ha ocurrido un error inesperado");
        }

    }
}
