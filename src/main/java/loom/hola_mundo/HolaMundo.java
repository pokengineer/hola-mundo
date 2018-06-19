package loom.hola_mundo;

/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Pokengineer
* @version 2.3
* @since   2018-06-19 
*/
public class HolaMundo {

   /**
   * saluda a la persona
   * @param persona es el nombre de la persona
   * @return String devuelve el saludo completo.
   */
    public String saludar(final String persona) {
        return  "¡Hola, " + persona + "!";
    }
}
