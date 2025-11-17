import java.util.Scanner;

public class Decisiones {

    public void estructuraIF(int nota){ //podría poner el int nota entre las comillas de aquí también.

        /*
        ESTRUCTURAS DE CONTROL.

        Estructura de selección -> selecciona que parte del código
        tengo que ejecutar dependiendo de una condición lógica (true-false)

        si (condicion){
            cuerpo
        } sino {
            cuerpo
        }

        También se puede dar el caso de preguntar por condiciones constantemente.
        Muchos If y Else. Por tanto sería:

        si (condicion){
            cuerpo
        } sino (condicion) {
            cuerpo
        } sino (condicion) {
            cuerpo
        } sino (condicion) { etc etc

        TODO mirar diagrama clase 23-10 min 49.
         */

        System.out.println("Vamos a explicar la estructura IF");

        if (nota>=5) { // si se cumple, ejecutará el sout de abajo. Sino, como es el caso, simplemente ejecutará.
            System.out.println("El examen está aprobado");
        } else {

            System.out.println("El examen está suspenso");

        }

        System.out.println("Terminando evaluación");


    }

    public void estructuraIFELSEIF(double nota){
        // 0 --> desastroso
        // 1- 3.99 --> mal
        // 4-4.99 --> raspado
        // 5-7.99 --> bien
        // 8-8.99 --> notable
        // 9-9.99 --> sobresaliente
        // 10 --> MH
        System.out.println("Iniciando la evaluación del examen");
        if (nota>=0 && nota<=10){ // esto se hace pq sino al poner -100 como nota, sale examen mal ya que es menor que 4. Y si se pone 100 sale examen MH por lo mismo. Así se establecen rangos.
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

    }

    public void t2ej4 () {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime que número quieres evaluar");
        int numero = lectorTeclado.nextInt();
        if (numero %2 == 0) {
            System.out.printf("El número %d es par%n", numero); //esto se hace para que salga como en la consola del ejercicio. explicación TODO clase 23-10 min 1h21min. y 1h50min -->
        }else {
            System.out.printf("El número %d es impar%n", numero);
        }
        lectorTeclado.close();
        /*
        TODO
        3.19 -> %.2f
        3 -> %d
        "Euros" -> %s
        True/false -> %b
        A -> %c
         */

    }

}