import controller.GestorUsuarios; // como podemos ver, generalmente al intentar acceder a ella, ya se importa sola la clase.

// si yo necesito irme a algun paquete, o a algun sitio que quiera coger funcionalidad:
// import nombrepaquete.NombreClase
// o se puede también import nombrepaquete.* y así importa todas las clases que haya dentro del paquete.
// si la clase que estas definiendo, no está en src, sino en algún sitio tendremos que poner package nombrePaquete
public class Main {

    public static void main(String[] args) {

        //  System.out.println("Iniciando la clase ");
        //    GestorUsuarios gestorusuarios = new GestorUsuarios();
        //  gestorusuarios.validarUsuario("Borja",41, "raulabad.z2308@gmail.com");

/*
        int numero1 = 5;
        int nuermo2 = 6;
        int resultado = numero1 & nuermo2;
        System.out.println("El resultado de la comparacion & a nivel de bit es "+resultado);
        resultado = numero1 | nuermo2;
        System.out.println("El resultado de la comparacion | a nivel de bit es "+resultado);
        String palabra = null;
        int comparar1 = 0;
        int comparar2 = 20;
        ^
        boolean resultadoComparacion = comparar1>comparar2 || comparar1>=0 || comparar2<100 || palabra.length()==0;
        // System.out.println(palabra.length()); // me ha dado fallo porque esto es null.length, por lo tanto error NullPointerException
        System.out.println("El resultado de la comparacion boorleana es "+resultadoComparacion); En este primer caso daría TRUE porque en un OR solo con que sea uno verdadero ya es TRUE.

       COMO COMPARAR PALABRAS:

       String palabra1 = "Borja";
        String palabra2 = "Pedro";
        boolean resultadoPalabras = palabra1.equals(palabra2);
        System.out.println("El resultado de comparar las dos palabras es "+resultadoPalabras);

        COMO COMPARAR PALABRAS, una caracter mayus otra minus:

        String palabra1 = "Borja";
        String palabra2 = "borja";
        boolean resultadoPalabras = palabra1.equalsIgnoreCase(palabra2); Vas a comparar ambos palabras, pero obvias temas de mayusculas y minisculas.
        System.out.println("El resultado de comparar las dos palabras es "+resultadoPalabras);

        COMO COMPARAR EN GENERAL
        int numero1 = 1;
        int numero2 = 2;
        boolean resultadoNumeros = numero1 == numero2;
        Aqui ya el resultado sería FALSE, pero para saber utilizar mejor el boolean.

        CASTEO -> pasar temporalmente una variable de un tipo a otro (double)variable
        int numero = 69;
        System.out.println("El numero correspodiente es: "+numero);
        char letra = (char) numero; Si no ponemos el char no deja, porque int y char son dos tipos
        que necesitan de una conversión explicita.
        System.out.println("Esta es la letra correspondiente a "+letra);

        char letraByte = 'A';
        int numeroLetra = letraByte;
        System.out.println("Esta es la letra correspondiente a "+numeroLetra);
        char utlimoNumeroASCII = 56121;
        System.out.println("El ultimo numero ASCII es "+utlimoNumeroASCII);
        String palabraCifrar = "Esta frase la quiero cirar";
        for (int i = 0; i < palabraCifrar.length(); i++) { --> Aqui lo que hace es que
        recorre toda la palabra a través de un for (así se repite letra por letra de manera cifrada con el for ya que esa es su función: repetir lineas de codigo,
        el i = 0, es porque empieza desde el principio de la palabra.
        Que en informatica siempre se empieza desde 0, y el i< palabraCifrar.length(); se refiere a que mide hasta la ultima letra
        ya que es su longitud=length.

         int codigo = palabraCifrar.charAt(i); Aqui se está definiendo la función charAt(i) que permite
         saber en que posición está la letra coreespondiente.

         Si ponemos int codigo, se está haciendo una conversión (casteo) implicita donde estás posiciones en cuanto a letra,
         pasan a int, y se convierten en número, estando así CIFRADO el mensaje.

         if(i%2==0){
                codigo*=2;
            } else {
                codigo*=3;
            }
            System.out.print(codigo +" "); Si hacemos esto, permite que no se descifre el mensaje, multiplicando a los pares 2
            y a los impares 3. Ese codigo +" ") es para que se imprima un espacio entre cada caracter asi se ve chikiluki.





         */

    }

}
