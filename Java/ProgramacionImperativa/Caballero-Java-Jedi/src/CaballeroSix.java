public class CaballeroSix {
    public static void main(String[] args) {
        
        //Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
        //usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
        //tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
        //dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares. 
       
        final int tasaCambio = 50000;

        double bitcoinUsuario = 0.5;

        System.out.println("La cantidad de dolares que tiene el usuario en proporcion del bitcoin ingresado es de : " +  (bitcoinUsuario*tasaCambio));
    }
}
