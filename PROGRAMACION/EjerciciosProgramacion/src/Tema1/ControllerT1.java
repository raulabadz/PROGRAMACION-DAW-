package Tema1;

import java.util.Scanner;

public class ControllerT1 {

    /*
    ej1: Crea un programa que defina tres variables: nombre, edad y ciudad.
    Asigna valores a cada una y muestra su contenido en la consola.
     */
    public void ej1 (){

        int edad = 25;
        String nombre = "Ana";
        String ciudad = "Madrid";

        System.out.println("La variable edad es: "+edad);
        System.out.println("La variable nombre es: "+nombre);
        System.out.println("La variable ciudad es: "+ciudad);



    }

    /*
    Crea un programa que defina una variable llamada puntuación con valor inicial 0.
     Luego, modifica su valor tres veces y muestra el resultado final.
     */
    public void ej2 (){
        int puntuacion = 0;

        System.out.println("Puntuación inicial: "+puntuacion);

        puntuacion += 5;
        System.out.println("Después de primera modificación: "+puntuacion);

        puntuacion += 5;
        System.out.println("Después de segunda modificación: "+puntuacion);

        puntuacion += 5;
        System.out.println("Puntuación final: "+puntuacion);


    }

    /*
    Define cinco variables con diferentes tipos de datos
     (String, int, boolean, double, char) y muestra tanto su valor como su tipo.
     */
    public void ej3(){
        String nombre = "Carlos";
        int edad = 30;
        boolean estudiante = true;
        double altura = 1.75;
        char inicial = 'C';

        System.out.println("Nombre: " + nombre + " - Tipo: String");
        System.out.println("Edad: " + edad + " - Tipo: int");
        System.out.println("¿Es estudiante?: " + estudiante + " - Tipo: boolean");
        System.out.println("Altura " + altura + " - Tipo: double");
        System.out.println("Inicial " + inicial + " - Tipo: char");

    }

    /*
    Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
    Muestra toda la información del libro en la consola.
     */
    public void ej4(){
        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int año = 1605;
        int paginas = 863;
        boolean biblioteca = true;

        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+año);
        System.out.println("Número de páginas: "+paginas);
        System.out.println("¿Disponible en biblioteca? "+biblioteca);

    }

    /*
    Crea un programa que use constantes para almacenar información que no debe cambiar
     (como el valor de PI o el nombre de una aplicación)
     y variables para información que puede cambiar. Muestra todos los valores.
     */
    public void ej5(){
        final String aplicacion = "Miapp";
        String version = "1.0.0";
        String usuario = "Laura";
        int Nivel = 1;
        int puntuacion = 0;

        System.out.println("Aplicación: "+aplicacion);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+Math.PI);
        System.out.println("Usuario actual: "+usuario);
        System.out.println("Nivel "+Nivel);
        System.out.println("Puntuación "+puntuacion);
        usuario = "Miguel";
        System.out.println("Usuario actualizado "+usuario);
        Nivel +=1;
        System.out.println("Nivel actualizado "+Nivel);
        puntuacion +=150;
        System.out.println("Puntuación actualizada "+puntuacion);




    }

    /*
Escribe un programa que declare dos variables numéricas, realice las operaciones básicas
 (suma, resta, multiplicación y división) y muestre los resultados por consola.
     */
    public void ej6(){
        int op1=10;
        int op2=5;
        System.out.println("Número 1: "+op1);
        System.out.println("Número 2: "+op2);
        System.out.println("Suma: "+(op1+op2));
        System.out.println("Resta: "+(op1-op2));
        System.out.println("Multiplicación: "+(op1*op2));
        System.out.println("División: "+(op1/op2));

    }

    /*
    Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad)
    en variables y muestre un mensaje de presentación por consola.
     */
    public void ej7(){
        String nombre = "Elena";
        String apellido = "García";
        int edad = 24;
        String ciudad = "Barcelona";
        System.out.printf("¡Hola! Me llamo %s %s%n", nombre, apellido);
        System.out.printf("Tengo %d años y vivo en %s", edad, ciudad);

    }

    /*
    Desarrolla un programa que calcule el área de un rectángulo.
    Declara variables para la base y la altura, y muestra el resultado del cálculo.
     */
    public void ej8(){
        int base = 5;
        int altura = 3;
        System.out.println("Base del rectángulo: "+base);
        System.out.println("Altura del rectángulo: "+altura);
        System.out.println("El área del rectángulo es: "+(5*3));

    }

    /*
    Escribe un programa que almacene la información de un producto
     (nombre, precio, código y disponibilidad) y muestre estos datos formateados por consola.
     */
    public void ej9(){
        String nombre = "Auriculares Bluetooth";
        double precio = 29.99;
        String codigo = "AUR-2023";
        boolean disponible = true;

        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Código: "+codigo);
        System.out.println("Disponible: "+disponible);
    }

    /*
    Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
    Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.

La fórmula para convertir de Celsius a Fahrenheit es:

F = C × 9/5 + 32
     */
    public void ej10(){
        int celsius = 25;
        int fahre = (int) (celsius*((double)9/5)+32);
        System.out.println("Temperatura en Celsius: "+celsius);
        System.out.println("Temperatura en Fahrenheit: "+fahre);
    }



}
