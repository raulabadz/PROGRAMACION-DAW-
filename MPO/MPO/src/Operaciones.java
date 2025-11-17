public class Operaciones {

    public void sumar(int op1, int op2){ // el void es lo que retorna, lo que me va a devolver.
        int resultado = op1+op2;
                System.out.println("El resultado de la suma es "+resultado); // esto no es un retorno, sino que simplemente lo imprime por consola



    }
    public void restar (int op1, int op2){
        int resultado = op1-op2;
                System.out.println("El resultado de la resta es "+resultado);
    }

    public int multiplicacion (int op1, int op2){

        int resultado = op1*op2;
        System.out.println("El resultado de la multiplicación es "+resultado);
        return resultado;
        // al final del metodo --> en la ultima linea tengo que decir que retorna
        // return; aquí estaría gris porque no te estoy pidiendo que retornes nada. Esto es por el void, que no pide retorno de nada.
        // basicamente, si pongo algo que no sea void, debo poner un retorno en la ultima linea.
        /* el comportamiento es el mismo que con las anteriores del void, hay un resultado, está imprimiendo algo
        pero además está diciendo toma, te estoy retornando un resultado, que puedes hacer lo que quieras con el.
         */


    }

    public boolean validarNumero(int numero){
        return numero>10;

    }


}
