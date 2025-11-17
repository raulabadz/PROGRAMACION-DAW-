import controller.GestorUsuarios; // como podemos ver, generalmente al intentar acceder a ella, ya se importa sola la clase.

// si yo necesito irme a algun paquete, o a algun sitio que quiera coger funcionalidad:
// import nombrepaquete.NombreClase
// o se puede también import nombrepaquete.* y así importa todas las clases que haya dentro del paquete.
// si la clase que estas definiendo, no está en src, sino en algún sitio tendremos que poner package nombrePaquete
public class Main {

    public static void main(String[] args) {

        System.out.println("Iniciando la clase ");
        GestorUsuarios gestorusuarios = new GestorUsuarios();
        gestorusuarios.validarUsuario("Borja",41, "raulabad.z2308@gmail.com");

    }

}
