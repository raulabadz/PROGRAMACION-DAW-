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

        scanner.close();

    }

    /*
    Crea un programa que pida al usuario su edad y si es estudiante (true/false). Usa operadores lógicos (AND, OR, NOT)
    para determinar si puede acceder a diferentes descuentos: descuento joven (menor de 26 años),
    descuento estudiante, o descuento especial (menor de 26 Y estudiante).

     */
    public void ej7t2(){
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("¿Eres estudiante? (true/false): ");
        boolean estudiante = scanner.nextBoolean();

// Cálculos
        boolean menorDe = edad < 26;
        boolean descuentoJoven = menorDe;
        boolean descuentoEstudiante = estudiante;
        boolean descuentoEspecial = menorDe && estudiante;

// Resultados
        System.out.println("¿Eres menor de 26 años?: " + menorDe);
        System.out.println("¿Eres estudiante?: " + estudiante);
        System.out.println("¿NO eres estudiante?: " + !estudiante);
        System.out.println("¿Tienes descuento joven?: " + descuentoJoven);
        System.out.println("¿Tienes descuento estudiante?: " + descuentoEstudiante);
        System.out.println("¿Tienes descuento especial?: " + descuentoEspecial);

        scanner.close();
    }

    /*
    Desarrolla un programa que pida tres números al usuario y calcule:
     la suma de los tres, el promedio,
      el resultado de multiplicar el primero por el segundo y dividirlo entre el tercero.
       Usa paréntesis para controlar la precedencia de operadores.

     */
    public void ej8t2(){



        System.out.println("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numero2= scanner.nextInt();
        System.out.println("Introduce el tercer número: ");
        int numero3= scanner.nextInt();

        double suma = numero1+numero2+numero3;
        double promedio = (numero1+numero2+numero3)/3;
        double resultado = (numero1*numero2)/numero3;

        System.out.println("Suma de los tres números: "+suma);
        System.out.println("Promedio: "+promedio);
        System.out.println("Resultado de (número1 * número2) / número3: "+resultado);

        scanner.close();
    }

    /*
    Escribe un programa que pida al usuario la puntuación de tres exámenes.
     Calcula la nota media y usa operadores relacionales para determinar si ha aprobado (>=5),
     si tiene notable (>=7), y si tiene sobresaliente (>=9).
     Muestra todos los resultados.
     */
    public void ej9t2(){
        System.out.println("Introduce la nota del primer examen:");
        double nota1 = scanner.nextDouble();
        System.out.println("Introduce la nota del segundo examen:");
        double nota2 = scanner.nextDouble();
        System.out.println("Introduce la nota del tercer examen:");
        double nota3 = scanner.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        System.out.println("Nota media: "+media);
        boolean aprobado = media>=5;
        boolean notable = media>=7;
        boolean sobresaliente = media>=9;
        System.out.println("¿Has aprobado? "+aprobado);
        System.out.println("¿Tiene notable? "+notable);
        System.out.println("¿Tiene sobresaliente? "+sobresaliente);

        scanner.close();
    }

    /*
    Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
     Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
      Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.
     */
    public void ej10t2(){
        System.out.println("Introduce el salario por hora:");
        int SalHora = scanner.nextInt();
        System.out.println("Introduce las horas trabajadas:");
        int Horas = scanner.nextInt();
        System.out.println("¿Has hecho horas extra?:");
        boolean ExtraJob = scanner.nextBoolean();
        int HorasNormales = Math.min(Horas,40);
        int HorasExtra = Horas-HorasNormales;
        boolean masDe40 = Horas>=40;
        double SalarioNormal = SalHora*HorasNormales;
        double SalarioExtra = (SalHora*2)*HorasExtra;
        double SalarioTotal = SalarioNormal+SalarioExtra;

        System.out.println("Horas normales (máximo 40): "+HorasNormales);
        System.out.println("Horas extra: "+HorasExtra);
        System.out.println("¿Trabajaste más de 40 horas?: "+masDe40);
        System.out.println("¿Tienes derecho a horas extra?: "+ExtraJob);
        System.out.println("¿Se aplican horas extra?: "+(Horas>40 && ExtraJob));
        System.out.println("Salario por horas normales: "+SalarioNormal);
        System.out.println("Salario por horas extra (al doble): "+SalarioExtra);
        System.out.println("Salario total: "+SalarioTotal);

        scanner.close();
    }

}
