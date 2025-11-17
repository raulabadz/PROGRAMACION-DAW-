package controller;

public class GestorUsuarios {

    /* esta clase, como es controladora, por eso su nombre de paquete controller,
    se encarga de controlar como funciona la aplicación. Por tanto, lo unico que necesito,
    es que dentro del metodo Main, yo tenga un acceso a lo que tengo aqui dentro.

     */


    public void validarUsuario (String nombre, int edad, String correo) {

    }

    public void obtenerInformacion (String nombre, String correo){
        // voy a buscar un documento, y para eso necesito la clase GestorDocumentos, pues la puedo importar.
        // puedo importar otra clase, y como está al mismo nivel, no necesito importar ningún paquete, ya que están en el mismo, controller.

        GestorDocumentos gestorDocumentos = new GestorDocumentos();


    }


}
