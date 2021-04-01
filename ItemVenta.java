/****************************************************************
 *
 * 2. Nos contratan para hacer un programa que lleve el control de las ventas de un
 *    local. Para esto es necesario modelar la clase Cliente, que posee un atributo id
 *    como identificador del cliente, el mismo debe ser un valor compuesto por letras y
 *    números aleatorios que se generan automáticamente al crear un Cliente. El Cliente
 *    también posee un nombre, un email y un porcentaje de descuento.
 *    Por otro lado vamos a tener el objeto Factura que representa una venta del
 *    local, cada Factura posee un identificador de las mismas características que el
 *    usado en Cliente. A su vez cada factura posee un monto total, una fecha y el Cliente
 *    que generó la compra. Para la fecha de la venta se le va a asignar la fecha y hora al
 *    momento de creación del objeto Factura. El tipo Factura debe contar con un
 *    método que calcule el monto final luego de aplicarle el descuento que posee el
 *    cliente.
 *      a. Investigue la clase UUID y sus métodos estáticos para la generación de los
 *         ids. Investigue la clase LocalDate y sus métodos estáticos para la generación
 *         de la fecha.
 *      b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto
 *         haga uso de un método que facilite la impresión del mismo.
 *      Cliente[id=?, nombre=?, email=?, descuento=?]
 *      c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
 *         Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
 *         monto total luego de aplicarle el descuento.
 *      d. Cree un método que facilite la impresión del objeto de tipo Factura y que
 *         siga el siguiente formato.
 *      Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
 *      email=?, descuento=?]]
 *      e. Analizar de agregar el tipo ItemVenta, que representa un producto que
 *         forma parte de la venta. El mismo contiene un id, un nombre, descripción y
 *         precio unitario. Considere las modificaciones necesarias en el tipo Factura
 *         para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
 *         calcular los montos totales con y sin el descuento aplicado.
 *
 ***************************************************************/

package guia_02;

import java.util.UUID;

public class ItemVenta {

    private UUID id;
    private String nombre;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;

    public ItemVenta(String nombre, String descripcion, double precioUnitario, int cantidad) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public double montoTotal() {
        return precioUnitario * cantidad;
    }

    @Override
    public String toString() {
        return  "\nID:............. " + this.id +
                "\nNombre:......... " + this.nombre +
                "\nDescripcion:.... " + this.descripcion +
                "\nCantidad:....... " + this.cantidad + "\n";

    }
}
