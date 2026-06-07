public class FuncionPolinomica {
     public double[] coeficientes;
     public int numeroDeTrapecios;
     public float[] limites;

    public void setCoeficientes(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }
    public void setNumeroDeTrapecios(int numeroDeTrapecios) {
        this.numeroDeTrapecios = numeroDeTrapecios;
    }
    public void setLimites(float[] limites) {
        this.limites = limites;
    }

    public double[] getCoeficientes() {
        return coeficientes;
    }
    public int getNumeroDeTrapecios() {        
        return numeroDeTrapecios;
    }
    public int getLimiteInferior() {
        return (int) limites[0];
    }
    public int getLimiteSuperior() {
        return (int) limites[1];
    }

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
