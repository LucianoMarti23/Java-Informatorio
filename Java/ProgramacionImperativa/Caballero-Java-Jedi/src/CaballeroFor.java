public class CaballeroFor {
    public static void main(String[] args) {
        
       // Conversión de libras esterlinas a dólares: Escribir un programa en Java que
        // solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
       // dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
       // libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
         // deberá mostrar 70 dólares.

         final double tasaCambioEsterlina = 1.40;

         int librasUsuarios = 50;

         System.out.println("La cantidad de dolares del usuario es de : " + (tasaCambioEsterlina*librasUsuarios));
    }
}
