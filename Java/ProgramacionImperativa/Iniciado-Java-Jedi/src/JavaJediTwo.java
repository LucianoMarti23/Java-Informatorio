public class JavaJediTwo {


    public static void main(String[] args) {
        int numUno = 10;
        int numDos = 2;

        System.out.println("El resultado de la suma es " + (numUno + numDos)
                + " Y su paridad es  : "
                + (((((numUno + numDos) % 2 ) == 0)) ? "Par" : "Impar"));


    }

}
