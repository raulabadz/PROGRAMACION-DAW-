import java.util.Scanner;

public class MainWhile {

    public static void main(String[] args) {
        //WHILE 0-N
        /*
        While-> estructura que repite un cuerpo siempre y cuando una condición sea true.
        cuantas ejecuciones minimo tiene este estamento -> 0 a N. Esto significa que puedo entrar o no entrar al while,
        si la variable que lo inicializa no está dentro de la condición nunca entrará. EJemplo: TODO mirar donde digo xd
        mientras (condicion){
          cuerpo -> o romper con break o cambiar la condición. La unica manera que deje de ejecutarse.

        }
        cuando sea falso, ejecuta por aquí.
         */
        // quiero pedir al usuario que me introduzca números hasta tener un negativo. TODO primer ejemplo del while
        Scanner scanner = new Scanner(System.in);
       /*
        int numero = 0; //esto de manera que el sistema inicia en 0
        while (numero>=0){ //si el numero no es >=0, es decir, <0, (un negativo) el while se rompe.
            System.out.println("Por favor introduce un número");
            numero = scanner.nextInt();
        }
        System.out.println("Sistema detenido");

        //TODO segundo ejemplo.
        //PIN TELEFONO.
        int intentos = 3; //los intentos que se tienen. TODO xd si aqui pongo -1, la condición de intentos>=0 no se cumple, y por tanto, nunca entro al while.
        int pin = 1234;
        int pinUsuario = 0; //aqui simplemente estamos inicializandolo a 0, dandole un valor inicial, de manera que no se pueda poner negativo etc.
        boolean bloqueado = false;
        while (intentos>=0 && pinUsuario!=pin){ //vas a seguir repitiendo, siempre que intentos sea mayor igual que 0, o el Pin del usuario sea diferente al Pin que es realmente.
            System.out.println("Por favor introduce un pin");
            pinUsuario = scanner.nextInt();
            intentos--; //cada vez que introduzcamos el pinUsuario, tenemos menos un intento, por eso el --.
            if (intentos==0 && pinUsuario!=pin){
                bloqueado = true;

            }
        }
        if (bloqueado){
            System.out.println("Telefono bloqueado");
        }else {
            System.out.println("Bienvenido al telefono");
        }

        */
        //DO WHILE 1-N
        /*
        do-while --> se repite el cuerpo de un estamento siempre y cuando la condicion de repetición
        sea true -> 1 a N TODO aqui si o si se garantiza a que entre el while, se garantiza la ejecución.
        Hasta que haya un break o sino, infinito.

        TODO Primer ejemplo do-while
        int numero = 10;
        do{
            System.out.println("Lineas del cuerpo del bucle");//esto si o si ya lo pone porque ya garantiza, está dentro del do.
            System.out.println("Introduce un nuevo número");
            numero = scanner.nextInt();

        }while (numero>=10);//no se parará el bucle hasta que el numero sea <10.

         */
        int opcion;
        do {
            System.out.println("Las opciones del menú son: ");
            System.out.println("1 - sumar");
            System.out.println("2 - restar");
            System.out.println("3 - salir");
            System.out.println("Que opcion quieres hacer?");
            opcion = scanner.nextInt();

        }while (opcion!=3);

    }

}
