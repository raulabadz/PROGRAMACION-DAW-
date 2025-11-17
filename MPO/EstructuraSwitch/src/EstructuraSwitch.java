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
                break;

            case 5:
                System.out.println("Has aprobado raspado");
                break;

            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;

            case 10:
                System.out.println("Lo has cuadrado! Perfecto");
                break;

            default:
                System.out.println("Esta nota no es analizable");

        }

        System.out.println("Terminando de analizar notas");
    }
}
