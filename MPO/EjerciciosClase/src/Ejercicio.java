import java.util.Scanner;

public class Ejercicio {

   private Scanner lectorTeclado; //lo ponemos aqui porque lo usaremos en diferentes metodos. No es recomendable darle valor arriba, sino cuando vamos a usarlo.
    public void ejercicio1() {
        /*
        Hágase una aplicación que permita introducir el número de bebidas y bocadillos
comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
€). También se podrá introducir el número de alumnos que realizaron la compra
(valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
redondeada a 2 decimales. (CosteBar)
         */

        lectorTeclado = new Scanner(System.in);
    //1 -> pedir cosas por teclado
    //2--> guardar cosas en variables.
        System.out.println("Cuantas bebidas vas a comprar");
        int bebidas = lectorTeclado.nextInt();
        System.out.println("Cuantos bocadillos vas a comprar");
        int bocatas = lectorTeclado.nextInt();
        System.out.println("Cuanto vale cada bebida");
        double precioBebida = lectorTeclado.nextDouble();
        System.out.println("Cuanto vale cada bocata");
        double precioBocata = lectorTeclado.nextDouble(); // 3,20
        System.out.println("Cuantas personas han realizado la compra");
        int numeroPersonas = lectorTeclado.nextInt();
        //3 --> realizaar calculos
        double costeBocadillos = bocatas*precioBocata;
        double costeBebidas = bebidas*precioBebida;
        double costeTotal = costeBebidas+costeBocadillos;
        double precioPersona = costeTotal/numeroPersonas;
        //4 --> mostrar información.
        System.out.printf("El precio total de la compra es %.2f%n",costeTotal); // esto sirve para limitar el resultado a dos decimales.
        System.out.printf("El precio total de los bocatas es %.2f%n",costeBocadillos); // el %n sirve para salto de linea ya que con el printf no lo hace solo. EL /n sirve para todos, pero el %n solo para el printf.
        System.out.printf("El precio total de las bebidas es %.2f%n",costeBebidas);
        System.out.printf("El precio a pagar por persona es %.2f%n",precioPersona);

        lectorTeclado.close();


    }

    public void ejercicio2() {

        /*
        Permítase introducir el valor con IVA de una compra con dos decimales (la
compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha
compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto fue
el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)

         */

     lectorTeclado = new Scanner(System.in);

        System.out.println("Valor de la compra?");
        double valorCompra = lectorTeclado.nextDouble();
        System.out.println("Valor IVA?");
        int iva = lectorTeclado.nextInt();

        //calculos jeje
        double compraSinIva = valorCompra / (1+iva/100.0); // lo hice asi porque no daba ya que dividía un double entre un int. Si le pones decimalaes al 100 si deja ya que se convierte en double.
        double valorIva = valorCompra-compraSinIva;

        System.out.printf("El valor de la compra sin IVA es %.2f%n",compraSinIva);
        System.out.printf("El valor del IVA es %.2f%n",valorIva);

        lectorTeclado.close();


    }

    public void ejercicio3() {

        /*
        Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
centenas, decenas y unidades), y se obtiene el número correspondiente.
(Numero)

         */

        lectorTeclado = new Scanner(System.in);

        System.out.println("Decenas de mil");
        int decenasDeMil = lectorTeclado.nextInt();
        System.out.println("Unidades de mil");
        int unidadesDeMil = lectorTeclado.nextInt();
        System.out.println("Centenas");
        int centenas = lectorTeclado.nextInt();
        System.out.println("Decenas");
        int decenas = lectorTeclado.nextInt();
        System.out.println("Unidades");
        int unidades = lectorTeclado.nextInt();

        System.out.println("Número introducido: "+decenasDeMil+unidadesDeMil+centenas+decenas+unidades);

        lectorTeclado.close();



    }

    public void ejercicio4() {

        /*
        Hágase un programa que convierta segundos en horas, minutos y segundos.
(Segundos)
         */

        lectorTeclado = new Scanner(System.in);

        // 1--> pedir datos
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int segundos = lectorTeclado.nextInt();
        //2 --> realizar calculos
        //segundos en horas -> 3600
        // minutos en horas -> 60
        // segundos en minutos -> 60

        int horas = segundos/3600;
        int minutos = (segundos%3600)/60; // esto era lo de modular. Explicado en la clase del 17 de octubre MPO, min:50 mas o menos.
        int segudos = segundos%60;
        //3 --> mostrar datos
        System.out.println("El número de horas es "+horas);
        System.out.println("El número de minutos es "+minutos);
        System.out.println("El número de segundos es "+segudos);
        lectorTeclado.close();




    }
}
