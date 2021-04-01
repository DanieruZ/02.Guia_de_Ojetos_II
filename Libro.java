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

import java.util.Arrays;

public class Libro {

    private String titulo;
    private double precio;
    private int stock;
    private Autor[] autores;

    public Libro(String titulo, double precio, int stock, Autor[] autores) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor[] getAutor() {
        return autores;
    }

    @Override
    public String toString() {
        return  "\nLibro: " +
                "\nTitulo:...... " + this.titulo +
                "\nPrecio:...... " + this.precio +
                "\nStock:....... " + this.stock +
                "\n" + Arrays.toString(this.autores);
    }

    public String mostrarMensaje() {
        StringBuilder nombreApellido = new StringBuilder();
        for(Autor  i : autores) {
            if(i != null) {
                nombreApellido.append(i.getNombre());
                nombreApellido.append(" ");
                nombreApellido.append(i.getApellido());
            }
        }
        return "El libro, " + "'" + this.titulo + "'" + " de " + "'" + nombreApellido + "'" + "." + " Se vende a " + "'$" + this.precio + "'" + " pesos.";
    }
}
