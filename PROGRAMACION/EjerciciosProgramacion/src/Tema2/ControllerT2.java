package Tema2;

import java.util.Scanner;

public class ControllerT2 {

    Scanner scanner = new Scanner(System.in);

    /*
    Crea un programa que pida al usuario dos números enteros por consola
    y muestre el resultado de las cinco operaciones aritméticas básicas:
     suma, resta, multiplicación, división y módulo (resto).
     */
    public void ej1t2(){

        System.out.println("Introduce el primer número:");
        int op1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int op2 = scanner.nextInt();
        int suma = op1+op2;
        System.out.println("Suma: "+suma);
        int resta = op1-op2;
        System.out.println("Resta: "+resta);
        int multiplicacion = op1*op2;
        System.out.println("Multiplicación: "+multiplicacion);
        int division = op1/op2;
        System.out.println("División: "+division);
        int modulo = op1%op2;
        System.out.println("Módulo (resto): "+modulo);

       scanner.close();


    }

    /*
    Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones relacionales entre ellos
     (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
     */
    public void ej2t2(){
        System.out.println("Introduce el primer número:");
        int op1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int op2 = scanner.nextInt();
        boolean resultado = op1>op2;
        System.out.println("¿10 es mayor que 10? "+resultado);
        resultado = op1<op2;
        System.out.println("¿10 es menor que 10? "+resultado);
        resultado = op1==op2;
        System.out.println("¿10 es igual a 10? "+resultado);
        resultado = op1!=op2;
        System.out.println("¿10 es diferente de 10? "+resultado);
        resultado = op1>=op2;
        System.out.println("¿10 es mayor o igual que 10? "+resultado);
        resultado = op1<=op2;
        System.out.println("¿10 es menor o igual que 10? "+resultado);

        scanner.close();

    }

    /*
    Crea un programa que declare una variable con valor inicial 100 y
    aplique diferentes operadores de asignación compuesta
     (+=, -=, *=, /=).
    Muestra el valor de la variable después de cada operación.
     */
    public void ej3t2(){

        int valorInicial = 100;
        System.out.println("Valor inicial: "+valorInicial);
        valorInicial +=50;
        System.out.println("Después de sumar 50 (+=): "+valorInicial);
        valorInicial -=30;
        System.out.println("Después de restar 30 (-=) "+valorInicial);
        valorInicial *=2;
        System.out.println("Después de multiplicar por 2: (*=) "+valorInicial);
        valorInicial /=4;
        System.out.println("Después de dividir entre 4 (/=) "+valorInicial);

    }

    /*
    Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el operador módulo.
     Muestra el resultado por consola.
     */
    public void ej4t2(){
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        if (numero%2==0){
            System.out.printf("El número %d es par%n",numero);

        }else {
            System.out.printf("El número %d es impar%n",numero);
        }
        scanner.close();
    }

    /*
    Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
     Usa operadores lógicos para determinar si puede alquilar un coche
     (debe tener 21 años o más Y tener carnet).
     */
    public void ej5t2(){
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        System.out.println("¿Tienes carnet de conducir?");
        boolean carnet = scanner.nextBoolean();
        boolean alquilar = edad>=21 && carnet;
        System.out.println("¿Eres mayor de 21 años?: "+(edad>=21));
        System.out.println("¿Tienes carnet? "+carnet);
        System.out.println("¿Puedes alquilar un coche? "+alquilar);

        scanner.close();

    }

    /*
    Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
     Calcula el precio final después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.
     */
    public void ej6t2(){
        System.out.println("Introduce el precio del producto:");
        double precio = scanner.nextDouble();
        System.out.println("Introduce el porcentaje de descuento");
        int descuento = scanner.nextInt();
        int precioFinal = (int) (precio-descuento);
        System.out.println("Precio original: "+precio+"€");
        System.out.printf("Descuento (%s): %s%n",descuento,descuento+"€");
        System.out.println("Precio final: "+precioFinal+"€");

    }

    /*

     */
}
