/****************************************************************
 *
 * 1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
 *    precio, stock y Autor, este último posee las características de nombre, apellido,
 *    email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
 *    único autor. Ejecute las siguientes instrucciones:
 *      a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
 *      b. Imprima por pantalla al autor previamente instanciado.
 *      c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
 *         pesos con una cantidad de 150 copias.
 *      d. Imprima por pantalla el libro instanciado.
 *      e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
 *         cantidad en 50 copias.
 *      f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
 *         Libro “Effective Java”.
 *      g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
 *         siguiente mensaje:
 *         “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
 *      h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
 *         cambios necesarios en el método del punto g, para imprimir un nuevo
 *         mensaje que liste los autores que contribuyeron a ese libro.
 *
 ***************************************************************/

package guia_02;

public class Autor {

    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return  "\nAutor: " +
                "\nNombre:...... " + this.nombre +
                "\nApellido:.... " + this.apellido +
                "\nEmail:....... " + this.email +
                "\nGenero:...... " + this.genero;
    }
}

