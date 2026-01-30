import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //inicial ; final ;incremento
        // [0,5]
        //pide por teclado 10 numeros y di de todos ellos cuantos
        //son pares
        //son impares
        //el numero medio introducido
        //Calcular cual es el mas grande y el mas pequeño. MIRARRR para aprender a hacer.

        Scanner scanner = new Scanner(System.in);
        /*
        int contadorPares=0, contadorImpares=0;
        int sumatorio = 0; // esto se hace, porque nada asegura que vayas a entrar a los valores que hay en el for.

        for (int i=0; i<5;i++){
            System.out.println("Introduce un número en posición "+i); // ESTO SIRVE POR EJEMPLO, un programa que le pidamos al usuario introducir 5 números, etc.
            int numero = scanner.nextInt();
            if (numero%2==0){
                contadorPares++;

            }else {
                contadorImpares++;
            }
            sumatorio +=numero; //esto quiere decir, en el sumatorio le voy a sumar lo que has introducido.

        }
        System.out.println("Saliendo del for ");
        System.out.println("El numero de pares es "+contadorPares);
        System.out.println("El numero de impares es "+contadorImpares);
        System.out.println("El numero medio introducido es "+sumatorio/5);
         */



        // for (int i = 10; i>=0; i--){
        //     System.out.println("Ejecucion de linea repetida "+i); Esto lo que hará es ir restando, y si pongo i-=2 va de menos 2 a menos 2 y así.
        /*
        tabla de multiplicar del 5
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d/n ", 5, i, 5 * i);
                               5     i    5*i
        }

        además, si quiero romper la ejecución de algo, refiriendome al if, al poner un break cortamos el flujo y que ahí quede.

        %s--> String
        %d--> número sin decimales
        %.2f -> numero con dos decimales
        %n --> salto de linea

         */

       /*
        System.out.println("Indica el tamaño del cuadrado");
        int tamaño = scanner.nextInt();
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i==0 || i==tamaño-1){
                    System.out.print(" * ");
                }
                else if (j==0 || j==tamaño-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
        */
        /*
        Calcular factorial de un número:
        4! sería 4*3*2*1
        nunca se llega a 0 porque sino daría 0 la operación y el factorial de 0 es 1.
        De manera que así sería la estructura al calcular un factorial.
        1*1=1
        1*2=2
        2*3=6
        6*4=24

        int factorial = 1;
        for (int i = 1; i <=4; i++) {//esto quiere decir que empieza por 1, ya que el calculo de un factorial empieza por uno.
            factorial = factorial*i;//ya que sabemos que el factorial seguro es 1, lo multiplicamos por la i que aumenta un número cada vez y ya da.

        }
        System.out.println("El factorial del número es: "+factorial);
         */
        
        //Una palbra es palindromo o no?? ejemplo oso, Ana, aqui está la manera de mirarlo con un programa.

        /*
        System.out.println("Indica la palabra para ver si es Palindromo");
        String palabra = scanner.nextLine();
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length()/2; i++) { //aqui es entre dos, porque la comparación de letra por letra llega hasta allives, y el resto ya es la misma palabra al reves.
            //System.out.println(palabra.charAt(i));
            // i=0 -> a != a
            // i=1 -> l != l
            // i=2 -> l != l
            // i=3 -> i != i
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)){//aqui con .charAt(i) lo que hace es sacar letra por letra hasta allives. CLASE 06-11 min 44 PROGRAMACION.
                esPalindromo = false;
                break; //AQUI rompe la ejecución porque ya se ha quedado claro que no es palindromo.

            }

        }
        if (esPalindromo){
            System.out.println("La palabra es Palindromo");
        }else {
            System.out.println("La palanra no es Palindromo");
        }
         */

        //TODO ARRAYS!!

        String [] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
       /*
        for (int i = 0; i < 7; i++) { //aqui estoy sacando todos los números, pero puedo sacar menos si quiero, en vez de 7, poner 3, etc.
        if (i%2==0){
            System.out.println(diasSemana[i]); //de esta manera sacamos los 7 valores de los 7 días de la semana.
            }
        */
        //inicio; final; incremento --> esto es el for normal.
        //   Tipo de variable (nombre que queramos) : coleccionARecorrer
        for (String item: diasSemana){ //este item valdrá lo que tiene que recorrer, que en este caso son dias de la semana.


        }



    }


}
