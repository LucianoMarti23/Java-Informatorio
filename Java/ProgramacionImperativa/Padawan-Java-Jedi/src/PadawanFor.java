public class PadawanFor {
    
    public static void main(String[] args) {

        // Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
        //edad y los nombres de esas personas, luego saque su promedio e imprima por
        // pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
        // edades..

        String amigoOne = "Luciano";
        int edadOne = 23;
        
        String amigoTwo = "Lucas";
        int edadTwo = 18;

        String amigoThre = "Romario";
        int edadThre = 12;

     System.out.printf("\nPersona 1 Su nombre es:  %s  y su edad es  : %d ", amigoOne , edadOne);
     System.out.printf("\nPersona 2 Su nombre es:  %s  y su edad es  : %d ", amigoTwo , edadTwo);
     System.out.printf("\nPersona 2 Su nombre es:  %s  y su edad es  : %d ", amigoThre , edadThre);
     System.out.printf("\nEl promedio de sus edades es  : "  + ((edadOne + edadThre + edadTwo)/3));
     
    }

}
