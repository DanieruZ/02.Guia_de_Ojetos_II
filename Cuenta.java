/****************************************************************
 *
 * 3. Necesitamos crear un programa para manejar los datos de una Cuenta bancaria de
 *    un Cliente. Para esto identificamos los atributos id, nombre y género (M o F) para el
 *    Cliente. Por otro lado tenemos el tipo Cuenta que también posee un identificador,
 *    un balance y un Cliente que es el dueño de la cuenta. La Cuenta debe exponer los
 *    métodos depositar y extraer que modifican el balance de la misma. Algo a tener en
 *    cuenta es que el método extraer no puede extraer dinero si el balance total no lo
 *    permite, si esto sucede se debe imprimir un mensaje por pantalla que indique que
 *    la cuenta no posee saldo suficiente.
 *      a. Crear un Cliente e imprimirlo en pantalla.
 *      b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
 *         10000.
 *      c. Realizar operaciones de depósito y extracción para probar esa
 *         funcionalidad.
 *      d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,
 *         de máximo 2000 pesos. Esto significa que la cuenta puede aceptar un
 *         balance negativo con un máximo de - 2000. Realice los cambios y pruebas
 *         necesarias.
 *      e. Analice cómo implementaría con las herramientas conocidas hasta el
 *         momento, llevar un registro de como máximo 10 operaciones de depósito y
 *         extracción que se realizaron en la cuenta. En donde se almacene en
 *         memoria de alguna forma la siguiente cadena de texto:
 *              I. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
 *             II. Extracción: "El {NombreCliente}, retiró {MontoRetirado}"
 *
 ***************************************************************/

package guia_02;

import java.io.PrintStream;
import java.util.UUID;

public class Cuenta {

    PrintStream show = new PrintStream(System.out);

    private UUID id;
    private double balance;
    private Titular titular;
    private int totalOperaciones = 0;
    private String[] operaciones = new String[10];

    public Cuenta(double balance, Titular titular) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.titular = titular;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public double depositarDinero(double dinero) {
        totalDepositos(dinero);
        return this.balance += dinero;
    }

    public double extraerDinero(double dinero) {
        double balance = this.balance - dinero;
        if(balance > (-2000)) this.balance -= dinero;
        totalExtracciones(dinero);
        if(balance < (-2000)) show.println("Fondo insuficiente.");
        return this.balance;
    }

    public void totalDepositos(double dinero) {
        if(this.totalOperaciones == 10) this.totalOperaciones = 0;
        this.operaciones[totalOperaciones] = "El cliente " + titular.getNombre() + " deposito " + "$" + dinero;
        this.totalOperaciones++;
    }

    public void totalExtracciones(double dinero) {
        if(this.totalOperaciones == 10) this.totalOperaciones = 0;
        this.operaciones[totalOperaciones] = "El cliente " + titular.getNombre() + " retiro " + "$" + dinero;
        this.totalOperaciones++;
    }

    @Override
    public String toString() {
        return "\nCuenta: " +
               "\nID:............... " + this.id +
               "\nBalance:.......... " + this.balance +
               "\n"                    + this.titular + "\n";
    }
}
