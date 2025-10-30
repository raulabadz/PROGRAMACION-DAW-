public class Main {

    //TODO
    int edadGlobal = 15;
    // Clases siempre empienzan en mayusculas
    // Las variables van siempre dentro de los metodos. Pueden ser declaradas fuera, pero siempre deben estar dentro de un método.
    // No pueden existir dos variables con el mismo nombre.
    // Hay variables complejas, como String, que tiene funciones extras. Pueden ejecutar metodos específicos.
    //Hay variables primitivas. Solo guardan un dato.
    // La variable Object. Puede hacer muchas cosas, de String, de int, de double, etc. CLASE PADRE, de aqui vienen todas.
    //Hay clases envolventes, que nos permiten hacer de variables primitivas, con más funciones.
    // Si quieres solo un dato, pues usa la primitiva. Si quieres algo más con ese dato, usa la envolvente, ya que eso USA más memoria.
    // Hay variables mutables, que pueden cambiar. Y hay variables no mutables, que van en MAYUSCULAS.
    //This como palabra reservada para llamar a una variable global dentro de un metodo con otra variable con el mismo nombre.


public static void main(String[] args) { // Metodo principal, siempre debe de haber uno.
    System.out.println("Mi primer programa en JAVA");
    String miNombre = "Raúl"; // String es una variable, y si no le pongo nada, su valor es nulo igual. VA SIEMPRE entre comillas
    miNombre = "Raul Alejandro"; // Para cambiar nombre variable, solo hace falta nombrarla.
    Character letraCompleja = 'y';
    char letraNIE = 'Y'; // Variable de letras, va en comillas simples.
    letraNIE = 123; // Me deja iguarlarlo a un número por el ASCII CODE, que son números que se refieren a letras.
    letraNIE = 'D';
    Integer edadCompleja = 21;
    int edad = 20; // Variable que se refiere a números sin comas.
    Double alturaCompleja = 1.80;
    double altura  = 1.70; // Variable que se refiere a un número decimal, con mucha precisión, muchos decimales.
    Float pesoCompleja = 80.5f;
    float peso = 65.2f; // Variable que se refiere a un decimal, pero con menos precisión y que acaba siempre en f. MENOS DECIMALES
    Boolean experienciaCompleja = false;
    boolean experiencia = true; // Variable de true o false.
    final String NIE = "Y6882975D"; // Esto es una variable no mutable, constante. No puede cambiar.

    System.out.println("Mi nombre es: "+miNombre); // Esto se llama concatenar. Lo del +variable
    System.out.println("La letra de mi NIE es: "+letraNIE);
    System.out.println("Mi edad es: "+edad+" años"); // Se puede concatenar dos veces, ir uniendo.
    System.out.println("Mi altura es: "+altura+" cm");
    System.out.println("Mi peso es: "+peso+" kg");
    System.out.println("Mi experiencia es: "+experiencia);
    System.out.println("Mi NIE es: "+NIE);
    System.out.println("El valor del número PI es: "+Math.PI); //Hay constantes o variables no mutables ya dentro de Java, como el número PI y se llaman de esa manera.
    System.out.println("El valor del número E es "+Math.E); //Se ve como estas constantes o variables siempre deben ir en mayusculas.
    System.out.println("El valor máximo de un Int es "+Integer.MAX_VALUE);




}

//EJEMPLO de variables de Bloque y Globales

public void miMetodo() {
    int edadGlobal = 123123;
    int edad = 12;
    System.out.println(edad); // Hay variables que son de bloque y solo están restringidas a ese bloque. A ese metodo. -->
    System.out.println(this.edadGlobal); // En este caso tenemos dos variables de nombres iguales, una global, y una de bloque TODO. Si no ponemos nada llamará a la del metodo, pero si ponemos this.edadGlobal. LLamará a la Global.
}

public void miMetodo1(){
    System.out.println(); // --> Si las quiero llamar desde otro metodo no puedo. PERO SI, MIRAR ARRIBA DEL TODO
    System.out.println(edadGlobal); // En cambio si uso la edadGlobal que aparece en la CLASE. Si me dejará usarla.
}

}
