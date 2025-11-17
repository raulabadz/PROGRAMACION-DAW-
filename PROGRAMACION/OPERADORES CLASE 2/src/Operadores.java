import java.util.Scanner;

public class Operadores {

    public void operadoresAritmeticos(){

        System.out.println("Explicación de los operadores aritmeticos");


        //unarios --> solo necesitan un operando

        int operandoUno = 7;

        operandoUno++;// es lo mismo que poner operandoUno = operandoUno + 1
        System.out.println("Después de incrementar "+operandoUno);

        operandoUno--; // operandoUno = operandoUno - 1
        System.out.println("Después de decrementar "+operandoUno);

        //operandoUno = -operandoUno. Esto significa que --> 7 = -7

        //Binarios

        int operandoDos = 6;

        int suma = operandoUno+operandoDos;
        System.out.println("El resultado de la suma es: "+suma); // Si solo voy a usar una variable, mejor sumarlo directamente-->
        //System.out.println("El resultado de la suma es: "+(operandoUno+operandoDos)); Si no le ponemos los parentesis, los concatena, siendo el caso de 7+0, pone 70.

        int resta = operandoUno-operandoDos;
        System.out.println("El resultado de la resta es: "+resta);

        int multiplicacion = operandoUno*operandoDos;
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);

        double division = (double)operandoUno/operandoDos; // --> TODO se le pone double entre parentesis antes de la variable.
        // System.out.println("El resultado de la división es: "+division);// si divides dos int, el resultado siempre es un int. En este caso (5/2) daba 2.5, pero pone 2.0 por eso.
        System.out.printf("El resultado de la división es %.2f",division); //si solo quiero dos decimales, se pone el printf (formato por consola formateada, YO te digo el formato) en este caso se le ponen banderas, que es el porcentaje.2f, y la f hace referencia al float que queremos como formato.

        /*De esta manera, para hacer una división REAL entre dos enteros
        hay que cambiar una de las variables, generalmente la primera, temporalmente
        a double. Esto se llama TODO casteo.-->
         */
         int modulo = operandoUno%operandoDos; //el residuo de la división, y sirve para saber si un número es par o no es par.
        System.out.println(modulo); //en el caso para saber si un número es par, debe ser operandoUno%2 y el módulo debe dar 0.





    }

    public void operadoresAsignacion(){
        //Asignación: asigna un valor determinado a una variable. El signo = asigna el valor.

        int operandoUno = 6;
        operandoUno += 6; //esto significa, a lo que ya tenías (operandoUno) le sumas 6, y lo guardas en el mismo operando. SE AHORRA CÓDIGO ASI.
        // Es lo mismo también poner: operandoUno = operandoUnO + 6; Da 12 obvio en los dos casos.
        operandoUno -=3; // esto significa a 12, le quitas 3, y me lo guardas en el mismo operando. Da 9.
        operandoUno*=2; // esto significa a 9, lo multiplicas por dos, y me lo guardas en el mismo operando. Da 18.
        operandoUno/=2; // esto significa a 18, lo divides entre dos, y me lo guardas en el mismo operando. Da 9.
        operandoUno%=3; // esto da 0. Que es el modulo, y es el residuo el que da 0.



    }

    public void operadoresComparacion(){
        /*Relacional o comparativos: Comparan dos valores (pueden ser dos variables (el valor de cada variable)).

        El resultado de toda comparación es un booleano (true or false). SOLO NÚMEROS.

        OP1 > OP2 -> me da como resultado true si el op1 es más grande que el op2. --> gt (grander than)
        OP1 >= OP2 -> me da como resultado true si el op1 es más grande o igual que el op2. --> gte (grander than equal)
        OP1 <O P2 -> me da como resultado true si el op1 es más pequeño que el op2. --> lt (less than)
        OP1 <= OP2 -> me da como resultado true si el op1 es más pequeño o igual que el op2. --> lte (less than equal)
        OP1 == OP2 -> me da como resultado true si el op1 es igual que el op2. --> eq (equal)
        OP1 != OP2 -> me da como resultado true si el op1 es diferente que el op2. --> ne (no equal)
       */

        int numeroUno = 4;
        int numeroDos = 7;
        boolean resultado = numeroUno>numeroDos; // false
        resultado = numeroUno>=numeroDos; // false
        resultado = numeroUno<=numeroDos; // true
        resultado = numeroUno<=numeroDos; //true
        resultado = numeroUno==numeroDos; // false
        resultado = numeroUno!=numeroDos; // true
    }

    public void operadoresLogicos(){
        /*Logicos: AND OR NOT--> Da como resultado un booleano,
        teniendo en cuenta varias comparaciones.

        AND --> El resultado de una comparación compuesta por 2 o más condiciones
        será true si todas las condiciones son true. && (shif+tecla6)

        OP1    OP2    RESULTADO
        True   True   True
        True   False  False
        False  True   Resultado
        False  False  False

        OR--> El resultado de una comparación compuesta por 2 o más condiciones
        será true si una de las comparaciones es true. Solo será false si todas son false. ||

        OP1    OP2    RESULTADO
        True   True   True
        True   False  True
        False  True   True
        False  False  False
         */

        int numeroUno=4;
        int numeroDos=10;
        int numeroTres=17;

        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos!=numeroTres && numeroTres%2!=0;
                               // true && true && true && true --> true

        System.out.println("El resultado lógico del AND es: "+resultadoLogicoAND);

        boolean resultadoLogicoOR = numeroUno!=10 || numeroDos>10 || numeroTres<numeroDos || numeroDos%2!=0;
                               // true || false || false || false --> true
        System.out.println("El resultado lógico del OR es: "+resultadoLogicoOR);

        boolean resultadoCom = (numeroUno>0 || numeroTres<0) && (numeroDos!=9 && numeroUno<0);
                               // (true || false) && (true && false)
                               // true && false
                               // false

        System.out.println("El resultado lógico del OR y AND es: "+resultadoCom);

        numeroTres = 20;
        numeroDos = 10;
        numeroUno = 0;

        boolean resultadoTotal = numeroUno>=0 && numeroDos<20&&false; // Aqui ya es false directamente si vemos el AND && false. Porque ya que con una de las condiciones no sea verdad, ya es falsa la comparativa.
        System.out.println("El resultado total es: "+resultadoTotal);
        boolean resultadoTotalInv = !resultadoTotal; // una exclamación delante de una variable le cambio el valor de la variable. En este caso iría a True.
        System.out.println("El resultado total inverso es: "+resultadoTotalInv);




    }

    public void evaluarCandidato(){
        //Si queremos que el usuario rellene los datos que estamos preguntando, y no el programador. TODO creamos una variable tipo scanner.
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombreApellido = lectorTeclado.nextLine(); //Si quisiera poner solo el nombre, sería next a secas. AQUI SE GUARDA LA VARIABLE DEL USUARIO UNA VEZ ESTE LE DE AL ENTER. Next.line es cuando quiero que leaa con espacios. 
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Que salario quieres cobrar?");
        double salario = lectorTeclado.nextDouble();
        System.out.println("Tienes experiencia?");
        boolean experiencia = lectorTeclado.nextBoolean();

        //edad inferior a 40 y sueldo <40000 y experiencia
        boolean resultadoEvaluacion = edad<40 && salario<40000 && experiencia;
        System.out.println("El resultado de la evaluación es que el candidato es: "+resultadoEvaluacion);

        lectorTeclado.close();//todo flujo de datos debería cerrarlo con esto. Así se quedan guardados los datos. Es como cerrar un fichero.

    }

    public void cambiosTipo(){
        /*
        CLASE 23-10 min 20.

        CASTEO: Cambiar un tipo de dato momentaneamente. Solo se puede aplicar a tipos que entran
        dentro de otros. Cuando el destino está incluido en el origen. Por ejemplo lo de la división.

        int -> double. 7 -> 7.0. Yo tengo un número entero y lo quiero expresar como double.
        Puedo hacerlo porque el entero entra de forma natural dentro del double.

        double -> int 7.5 -> 7
        char -> int A-> 75. Un char se puede pasar a int y viceversa.
        double division = (double)6/7

        Ejemplo: tengo int numero = 7.
        sout ((double) numero). La variable sigue siendo un int, pero temporalmente pasa a un double.

        PARSEO: Cambio de tipo de dato MOMENTANEAMENTE. Tanto si el origen está incluido en el destino como si no. ME LA JUEGO PORQUE PUEDE QUE DE FALLO.
        String -> int. Solo se puede hacer en determinadas ocasiones.

        Aqui es donde entran las clases envolventes, que es la variable compleja asociada a la primitiva.
        Como char --> Charger. Y así con las otras.

        TODO el coger una variable y accederla a una clase más compleja y accesible, se llama Autoboxing.
        Es decir, int numero = 20;
                  Integer numero = 20; --> aquí se está haciendo autoboxing.

        TODO. Por el contrario, coger una clase envolvente o variable compleja, y hacerla otra vez primitiva. Se le llama Unboxing.
        Es decir, Integer numero1 = 20;
                  int numeroBase = numero1; --> Aquí ya hemos cambiado la variable, que antes era Integer, y ahora es int, primitiva de nuevo.

        //aqui se ve como cambiamos tipos de datos. Puede ser momentaneamente. Lo de ASCII es como un modelo que cada letra significa un número. Por eso en char se puede.

        Estos parseos solo pueden ser.

        String-> int
        String-> char
        String-> float
        String-> boolean

        En el caso contrario, todos si podrá pasarlos porque sería simplemente:

        int -> String 7 -> "7"
        char -> String 8.90 -> "8.90"
        boolean -> String true -> "true"

        En este caso contrario sería:
        TODO String.valueOf(int); Aquí se pasa de un int a un String.


        Y se pone la clase envolvente a la que se quiere pasar. De esta manera:
        TODO Integer.parseInt(string) -> esto en caso porque se pasa de un String a un int
        si fuese de un String a un char. Sería Charger.parseChar;
         */

       // int letraASCII = 75;
        //System.out.println((char) letraASCII);

        //char letra = 'W';
        //System.out.println((int) letra);

        //String palabra = "Hola";
        //System.out.println(Integer.parseInt(palabra)); En este caso no dejará. Pero si es un número si deja. Ya que un número si es un int.

        //Si queremos pasar de un String a un double, ese String debe ser decimal, de String a un número ese String debe ser un número. Y así con todos.

        // String palabra = "7";
        //System.out.println(Integer.parseInt(palabra)+10); //Incluso si pones +10 lo suma directamente.

        //En este caso de abajo del boolean,pasará a true solo si la palabra String es true, y a false, si la palabra String es false, o si no lo puede pasar a boolean también pondrá false.

        //String palabra = "Si";
        //System.out.println(Boolean.parseBoolean(palabra)); En este caso pondrá false. porque al ser la palabra String un si, y no puede pasarla, pone un false.

        //String palabra = "True";
        //System.out.println(Boolean.parseBoolean(palabra));Aqui pondrá true. Porque si puede.

        //int numero = 123;
        //System.out.println(String.valueOf(123)+1); Aqui pondria en consola 1231 porque el 123 se convierte en String y se le concatena la palabra 1.










    }
}
