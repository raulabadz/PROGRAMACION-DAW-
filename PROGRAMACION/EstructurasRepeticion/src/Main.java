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



        // for (int i = 10; i>=0; i--){
        //     System.out.println("Ejecucion de linea repetida "+i); Esto lo que hará es ir restando, y si pongo i-=2 va de menos 2 a menos 2 y así.
        /*
        tabla de multiplicar del 5
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d/n ", 5, i, 5 * i);
                               5     i    5*i
        }

        además, si quiero romper la ejecución de algo, refiriendome al if, al poner un break cortamos el flujo y que ahí quede.
        
         */
    }

}
