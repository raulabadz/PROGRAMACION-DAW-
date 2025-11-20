import java.util.Scanner;

public class EstructuraSwitch {

    public void estructuraTradicional (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota");
        int nota = scanner.nextInt();
        //Si la nota es <5 // sino si la nota es <7. Asi es el IF y ELSE

        switch (nota){
            case 1:
                System.out.println("La nota vale 1, has suspendido con honores");
                break; // no es obligatorio, pero si no lo pongo, se ejecutan todos los case en cascada.

            case 5:
                System.out.println("Has aprobado raspado");
                break;

            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;

            case 10:
                System.out.println("Lo has cuadrado! Perfecto");
                break;

            default: // puede ponerse arriba siempre y cuando tenga el break que rompa la ejecución. Pero se suele poner de último.
                System.out.println("Esta nota no es analizable");

        }

        System.out.println("Terminando de analizar notas");
    }

    public void estructuraLambda (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        String nombre = scanner.next();
        switch (nombre.toLowerCase()){
            // La manera de separar variables según sus ambitos y asi reutilizarlas es mediante llaves, de esta manera, con llaves en cada uno nos permite reutilizar el nombre.

            case "borja" -> { //esto me permite utilizar variables con el mismo nombre dentro del mismo switch, ya que están en ambitos diferentes por las llaves.
                System.out.println("Nombre introducido Borja");

            }
            case "maria" -> {
                System.out.println("Nombre introducido Maria");

            }
            case "juan" -> {
                System.out.println("Nombre introducido Juan");

            }
            case "marcos" -> {
                System.out.println("Nombre introducido Marcos");

            }
            default -> {
                System.out.println("Nombre introducido no contemplado");
            }


        }

    }

    public void estructuraChar (char letra){
        // es vocal o consonante
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("Consonante");


        }
    }

    public void menuOpciones (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor selecciona la opción a realizar");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Modulo");
        System.out.println("6 - Salir");
        System.out.println("Que quieres hacer?");
        int opcion = scanner.nextInt();
        int operando1=0, operando2=0; // esto se pone así como hay unas condiciones de mayor, igual que uno  o menor que 6. Igual nunca se inicia, entonces necesita de un valor minimo para iniciar.
        if (opcion>=1 && opcion<6){
            System.out.println("Introduce operando 1");
            operando1 = scanner.nextInt();
            System.out.println("Introduce operando 2");
            operando2 = scanner.nextInt();

        }
        double resultado = 0; //esto se hace así cuando hay condiciones, ponerlo igual siempre o mirar la clase TODO 24-10 que apareció.
        switch (opcion){
            case 1 ->{
                System.out.println("Vas a sumar");
                resultado = operando1+operando2;
            }
            case 2 ->{
                System.out.println("Vas a restar");
                resultado = operando1-operando2;
            }
            case 3 ->{
                System.out.println("Vas a multiplicar");
                resultado = operando1*operando2;
            }
            case 4 ->{
                System.out.println("Vas a dividir");
                if (operando2!=0){
                    resultado = (double) operando1/operando2;
                }

            }
            case 5 ->{
                System.out.println("Vas a modular");
                resultado = operando1%operando2;
            }
            case 6 ->{
                System.out.println("Vas a salir");
            }
            default -> {
                System.out.println("Opcion no contemplada");
            }
        }
        System.out.println("El resultado obtenido es "+resultado);

    }
}

