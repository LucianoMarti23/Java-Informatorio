public class MaestroThre {
    public static void main(String[] args) {


        //Cálculo de la hipotenusa de un triángulo:
        //Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
        //dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
        //hipotenusa, a y b son los catetos.
        
        int catetoA = 3;
        int catetoB = 4;


        System.out.println("Cateto A: " + catetoA);
        System.out.println("Cateto B: " + catetoB);
        System.out.println("Hipotenusa: " + Math.sqrt(catetoA*catetoA + catetoB * catetoB));

       ;
        
    }
    
}
