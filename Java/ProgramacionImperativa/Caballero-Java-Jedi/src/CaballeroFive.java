public class CaballeroFive {
    public static void main(String[] args) {
       
       //  Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
        // una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
        // cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
        // ingresa 5000 pesos, el programa deberá mostrar 250 euros.
 
        final double tasaCambioEuro = 20;

        int pesosUsuario = 5000;

        System.out.println("La cantidad de euros del usuario es de  : " +  (pesosUsuario/tasaCambioEuro));

       
    }
    
}
