public class CaballeroThre {
    public static void main(String[] args) {
         //  Conversión de euros a dólares: Escribir un programa en Java que solicite al
        // usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
        // tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
       // el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
       
       final double  tasaCambio = 1.20;

       int eurosUsuario = 100;

       System.out.println("El usuario tiene  : " + ((eurosUsuario*tasaCambio)) + " Dolares");

    }
    
}
