public class MaestroSix {
    public static void main(String[] args) {
        //Cálculo de la velocidad final:
        //Escribir un programa en Java que calcule la velocidad final de un objeto en caída
        //libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
        //transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
        //es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
        //transcurrido.
        
        int velocidadInicial = 15;

        int aceleracion = 5;

        int tiempoTranscurrido = 10;
        
        System.out.println("La velocidad final es de :   " + (double) (velocidadInicial + (aceleracion * tiempoTranscurrido) ));


        
    }
    
}
