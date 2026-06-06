public class FuncionPolinomica {
    private double[] coeficientes;
    private int numeroDeTrapecios;
    private float[] limites;
    
//constructor de la clase FuncionPolinomica
    public FuncionPolinomica(double[] coeficientes, int numeroDeTrapecios, float[] limites) {
        this.coeficientes = coeficientes;
        this.numeroDeTrapecios = numeroDeTrapecios;
        this.limites = limites;
    }
// Esta función evalua el valor de la funcion para un valor de x
    public double evaluar(double x) {
        double resultado = 0.0;
        for (int i = 0; i < coeficientes.length; i++) {
            resultado += coeficientes[i] * Math.pow(x, i);
        }
        return resultado;
    }

}
