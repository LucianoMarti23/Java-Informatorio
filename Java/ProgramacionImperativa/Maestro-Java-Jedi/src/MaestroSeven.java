public class MaestroSeven {
    public static void main(String[] args) {
            //  Cálculo de la fuerza centrípeta:
            //Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
            //mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
            //y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
            //fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
            //de la trayectoria

            double masaObjeto = 5.0;

            double velocidadAngular = 10.0;

            double radioTrayectoria = 3.0;


            System.out.println("La fuerza centripeta es de : " + masaObjeto * (velocidadAngular*velocidadAngular) / radioTrayectoria);

        
    }
    
}
