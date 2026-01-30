package Tema3;

import java.util.Scanner;

public class ControllerT3 {

    Scanner scanner = new Scanner(System.in);

    //EJERCICIOS IF
    /*
    Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más).
     Muestra un mensaje indicando si puede votar o no.
     */
    public void ejIF1(){
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        if (edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar.");
        }else {
            System.out.println("No eres mayor de edad. No puedes votar.");
        }
        scanner.close();
    }

    /*
    Desarrolla un programa que pida un número al usuario
     y determine si es positivo, negativo o cero. Muestra el resultado por consola.
     */
    public void ejIF2(){
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        if (numero>0){
            System.out.println("El número es positivo.");
        } else if (numero==0) {
            System.out.println("El número es cero.");

        }else {
            System.out.println("El número es negativo.");
        }
        scanner.close();
    }

    /*
    Escribe un programa que pida la nota de un examen (entre 0 y 10)
     y determine si el alumno ha aprobado (nota mayor o igual a 5) o ha suspendido.
     */
    public void ejIF3(){
        System.out.println("Introduce tu nota:");
        double nota = scanner.nextDouble();

        if (nota>=0 && nota<=10){
            if (nota>=5){
                System.out.println("¡Enhorabuena! Has aprobado.");
            }else {
                System.out.println("¡Mala suerte! Has suspendido.");
            }

        }else {
            System.out.println("Rango incorrecto.");
        }
        scanner.close();
    }

    /*
    Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€,
     aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.
     */
    public void ejIF4(){
        System.out.println("Introduce el importe de la compra:");
        double importe = scanner.nextDouble();
        if (importe>=0){
            System.out.println("Importe original: "+importe);
            if (importe>=100){
                double descuento = importe*0.10;
                double descuentoAplicado = importe*0.90;
                System.out.println("Descuento aplicado: "+descuento);
                System.out.println("Importe final: "+descuentoAplicado);



            }else {
                System.out.println("Importe final: "+importe);
            }


        }else {
            System.out.println("Importe incorrecto");
        }
        scanner.close();

    }

    /*
    Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo.
    Muestra un mensaje personalizado para cada caso.
     */
    public void ejIF5(){
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        if (numero%2==0){
            System.out.printf("El número %d es par.",numero);
        }else {
            System.out.printf("El número %d es impar.",numero);
        }
        scanner.close();

    }

    /*
    Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años.
     Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".
     */
    public void ejIF6(){
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        if (edad>0){
            if (edad>=16){
                System.out.println("Acceso permitido.");
            }else {
                System.out.println("Acceso denegado. Debes tener al menos 16 años.");
            }

        }else {
            System.out.println("Edad incorrecta.");
        }
        scanner.close();
    }

    /*
    Crea un programa que pida una nota numérica (0-10) y determine la calificación:
    Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).
     */
    public void ejIF7(){
        System.out.println("Introduce tu nota");
        double nota = scanner.nextDouble();
        if (nota>=0 && nota<=10){
            if(nota<1) {
                System.out.println("Examen desastroso");

            } else if (nota<4) {
                System.out.println("Examen mal");

            } else if (nota<5) {
                System.out.println("Examen raspado");

            } else if (nota<8) {
                System.out.println("Examen bien");

            } else if (nota<9) {
                System.out.println("Examen notable");

            } else if (nota<10) {
                System.out.println("Examen sobresaliente");

            }else{ //esto ya sería el restante, por eso ya no ponemos else if
                System.out.println("Examen de MH");
            }

        }else {
            System.out.println("Rango incorrecto");
        }

        System.out.println("Finalizando la evaluación");

        scanner.close();

    }

    /*
    Desarrolla un programa que pida dos números al usuario y determine cuál es mayor, o si son iguales.
     Muestra el resultado por consola.
     */
    public void ejIF8(){
        System.out.println("Introduce el primer número");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = scanner.nextInt();
        if (numero1>numero2){
            System.out.printf("El número %d es mayor que %d",numero1,numero2);
        } else if (numero1<numero2) {
            System.out.printf("El número %d es mayor que %d",numero2,numero1);

        }else {
            System.out.println("Los números son iguales");
        }
    }

    /*
    Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario. Calcula el IMC (peso / altura²)
     y determina si está en peso normal (IMC entre 18.5 y 24.9),
     por debajo del peso normal (IMC menor a 18.5) o por encima del peso normal (IMC mayor a 24.9).
     */
    public void ejIF9(){
        System.out.println("Introduce tu peso en kg");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura en metros:");
        double altura = scanner.nextDouble();
        double IMC = peso/(altura*altura);
        System.out.println("Tu IMC es: "+IMC);
        if (IMC>=18.5 && IMC<=24.9){
            System.out.println("Estás en peso normal.");

        }else if (IMC<18.5){
            System.out.println("Estás por debajo del peso normal.");

        } else {
            System.out.println("Estás por encima del peso normal.");
        }
        scanner.close();

    }

    /*
    Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción.
     La altura mínima es 120 cm y la máxima es 200 cm.
     Si está dentro del rango, muestra "Puedes subir", si no, indica el motivo (demasiado bajo o demasiado alto).
     */
    public void ejIF10(){
        System.out.println("Introduce tu altura en cm:");
        double altura = scanner.nextDouble();
        if (altura>=120 && altura<=200){
            System.out.println("Puedes subir");
        }else if (altura<120){
            System.out.println("No puedes subir a la atracción. Altura mínima: 120 cm.");
        }else {
            System.out.println("No puedes subir a la atracción. Altura máxima: 200 cm.");
        }
        scanner.close();
    }

    /*
    Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false).
    Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%.
    Si es socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€, descuento del 5%.
     En cualquier otro caso, no hay descuento.
     Muestra el importe original, el descuento aplicado y el importe final.
     */
    public void ejIF11(){
        System.out.println("Introduce el importe de la compra:");
        double importe = scanner.nextDouble();
        System.out.println("¿Eres socio?:");
        boolean socio = scanner.nextBoolean();
        System.out.println("Importe original:"+importe);
        if (socio && importe>=200){
            double descuento = importe*0.20;
            double descuentoAplicado = importe*0.80;
            System.out.println("Eres socio y tu compra es >=200€");
            System.out.println("Descuento aplicado (20%): "+descuento);
            System.out.println("Importe final: "+descuentoAplicado);
        }else if (socio && importe<200){
            double descuento = importe*0.10;
            double descuentoAplicado = importe*0.90;
            System.out.println("Eres socio y tu compra es <200€");
            System.out.println("Descuento aplicado (10%): "+descuento);
            System.out.println("Importe final: "+descuentoAplicado);

        }else if (!socio && importe>=300){
            double descuento = importe*0.05;
            double descuentoAplicado = importe*0.95;
            System.out.println("No eres socio y tu compra es >=300€");
            System.out.println("Descuento aplicado (5%): "+descuento);
            System.out.println("Importe final: "+descuentoAplicado);


        }else {
            System.out.println("No se aplica descuento.");
            System.out.println("Importe final: "+importe);
        }

        scanner.close();

    }

    /*
    Crea un programa que pida al usuario crear una contraseña.
     La contraseña debe cumplir estos requisitos: tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
      El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña es válida o no, indicando qué requisitos no cumple.

Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto).
     */
    public void ejIF12() {
        System.out.println("Introduce una contraseña:");
        String contrasenya = scanner.next();

        System.out.println("Longitud de la contraseña: " + contrasenya.length());
        boolean longitudOK = contrasenya.length() >= 8;
        System.out.println("¿Tiene al menos 8 caracteres?: " + longitudOK);

        boolean contieneNumero = false;
        for (int i = 0; i < contrasenya.length(); i++) {
            char c = contrasenya.charAt(i);
            if (Character.isDigit(c)) {
                contieneNumero = true;
                break;
            }

        }
        System.out.println("¿Contiene al menos un número?: " + contieneNumero);

        boolean contrasenyaProhibida = false;
        if (contrasenya.equals("password") || contrasenya.equals("12345678")) {
            contrasenyaProhibida = true;


        }
        System.out.println("¿Es una contraseña prohibida?: " + contrasenyaProhibida);

        boolean contrasenyaValida = true;
        if (longitudOK && contrasenyaProhibida && !contieneNumero) {
            contrasenyaValida = false;

        }
        System.out.println("¿Es válida? (cumple todos los requisitos): " + contrasenyaValida);


        if (!contrasenyaValida) {
            System.out.println("Contraseña NO válida.");

            if (!longitudOK) {
                System.out.println("Debe tener al menos 8 caracteres.");
            }
            if (!contieneNumero) {
                System.out.println("Debe contener al menos un número.");
            }
            if (contrasenyaProhibida) {
                System.out.println("No puede ser una contraseña prohibida.");
            }
        }else {
            System.out.println("Contraseña válida.");
        }

        scanner.close();






    }

    /*
    Escribe un programa para calcular el precio de entrada a un museo.
    Pide la edad del usuario y el día de la semana (1=Lunes, 2=Martes... 7=Domingo).
     Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17 años: 5€ (pero gratis los martes).
      Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€.
      Usa operadores lógicos para determinar el precio correcto y muestra el cálculo.
     */
    public void ejIF13(){
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        System.out.println("Introduce el día de la semana (1-7):");
        int DiaSemana = scanner.nextInt();
        System.out.println("Edad: "+edad);

        boolean menorDoce = true;
        boolean martes = true;
        boolean MayorDoce = true;





        }



    }

