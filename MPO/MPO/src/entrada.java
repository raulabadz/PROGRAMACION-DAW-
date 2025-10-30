public class entrada {

    public static void main(String[] args) {

        System.out.println("Ejecución de metodos");
        saludar("Borja"); // REFACTORIZACIÓN. Estoy llamando metodos, para no hacer el código repetitivo.
        saludar("Juana");
        saludar("Pedro");
        despedir();
       // Operaciones.sumar(4,8);
        // Operaciones.restar(10,5);
        Operaciones operacionesmates = new Operaciones(); // Así se llama a un método que está en otra clase.
                operacionesmates.sumar(5,9);



    }
    public static void saludar(String data){ // Este data es solo una referencia, puedo ponerle como yo quiera.
        System.out.println("Hola "+data);
        System.out.println("Este metodo se va a repetir en el saludo");


    }
    public static void despedir(){
        System.out.println("Aquí me despido");
        System.out.println("Hasta luego");
    }
}
