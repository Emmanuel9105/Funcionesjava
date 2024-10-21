public class Funcionsjava {
    //Funcion principal (hilo de ejecucion principal main)
    //Main runtime thread
    public static void main(String[] args) {
        // Llamada (desde el MAIN)
        saludar();
        saludar();

        for(int i=0; i<20; i++){  // Bucle que repite 20 veces saludar
            saludar();
        }
        saludar2("Emmanuel");

        dameNumeroPI();
        System.out.println(dameNumeroPI());

        System.out.println(sumamos(2,2));
        System.out.println(sumamos(2,3.5));
        double resultadoSuma= sumamos(2, 2);
        System.out.println(resultadoSuma);
    }
    //Crear nuestras funciones
    //Fuera del main y dentro de la clase

    // Funcion sin parametro y sin retorno
    public static void saludar(){
        //implementacion
                System.out.println("----------");
                System.out.println("Hola");
                System.out.println("Que tal estas?");
                System.out.println("Adios");
    }
    //2 funciones con parametros y sin returno
    public static void saludar2(String nombre) {
        //implementacion
        System.out.println("----------");
        System.out.println("Hola");
        System.out.printf("Que tal estas, %s?\n", nombre);
        System.out.println("Adios");
    }

    //3 Funcion sin parametros y con return
    public static double dameNumeroPI(){
        final double numPI = Math.PI;
        System.out.println(numPI);
        return numPI;
    }
    //4 Funciones con parametros y con return
    public static double sumamos(double a, double b){
        double resultado = a + b;
        //return a + b;
        return resultado;
    }





}//Fin CLass!
