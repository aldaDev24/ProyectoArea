public class MetodoTrapecio {
    public double calcularArea(double a, double b,int n, FuncionPolinomica funcion) {
          double ancho=(a+b)/(int) n ;
          double suma=funcion.evaluar(a)+funcion.evaluar(b);
          for(int i=1;i<n;i++){
              double xactual=a+(i*ancho);

              suma += 2.0*funcion.evaluar(xactual);
          }
          return (ancho/2.0)*suma;

    }
}
