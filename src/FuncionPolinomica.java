public class FuncionPolinomica {
     public double[] coeficientes;

//constructor de la clase FuncionPolinomica
    public FuncionPolinomica(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    public double[] getCoeficientes() {
        return coeficientes;
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
