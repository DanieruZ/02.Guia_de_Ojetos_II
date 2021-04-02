package guia_02;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static PrintStream show = (System.out);
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int selected;

        do {
            selected = menu();
            switch(selected) {
                case 1:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 01.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

                    Autor[] autores = new Autor[3];
                    autores[0] = autor;

                    show.print(autor);
                    show.println("\n");

                    Libro libro = new Libro("Effective Java", 450, 150, autores);

                    show.println(libro);
                    show.println("\n");

                    libro.setPrecio(500);
                    libro.setStock(libro.getStock() + 50);

                    show.println(Arrays.toString(libro.getAutor()));
                    show.println("\n");

                    show.println(libro.mostrarMensaje());

                    Autor autor1 = new Autor("Pepe", "Argento", "pepe@gmail.com", 'M');
                    Autor autor2 = new Autor("Sancho", "Panza", "panza@hotmail.com", 'M');

                    autores[1] = autor1;
                    autores[2] = autor2;

                    Libro libro1 = new Libro("Effective Java", 500, 200, autores);
                    show.println(libro1);

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 02.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Cliente cliente = new Cliente("Bruno", "bruno@gmail.com", 25);
                    ItemVenta[] items = new ItemVenta[3];
                    show.println(cliente.toString());

                    show.println("-------------------------------------------");

                    ItemVenta item = new ItemVenta("Medialunas", "Facturas dulces", 40, 12);
                    ItemVenta item1 = new ItemVenta("Medialunas", "Facturas saladas", 45, 12);
                    ItemVenta item2 = new ItemVenta("Churros", "Churros con dulce de leche", 50, 12);

                    items[0] = item;
                    items[1] = item1;
                    items[2] = item2;

                    Factura factura = new Factura(cliente, items);
                    show.println(factura);

                    System.out.println("Monto Total de compra: " + factura.calcularMontoTotal());
                    System.out.println("Monto Total de compra con 25% Descuento: " + factura.calcularDescuentoTotal());

                    show.println("-------------------------------------------");

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 03.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Titular titular = new Titular("King Kong", 'M' );
                    show.println(titular);

                    show.println("\n-------------------------------");

                    Cuenta cuenta = new Cuenta(10000, titular);
                    show.println(cuenta);

                    show.println("Extracciones & Depositos: \n");
                    show.println("Extraccion valor:... $2300" + " --- " + "Balance actual: $" + cuenta.extraerDinero(2300));
                    show.println("Extraccion valor:... $855.7" + " -- " + "Balance actual: $" + cuenta.extraerDinero(855.7));
                    show.println("Extraccion valor:... $547.3" + " -- " + "Balance actual: $" + cuenta.extraerDinero(547.3));
                    show.println("Deposito valor:..... $1500" + " --- " + "Balance actual: $" + cuenta.depositarDinero(1500));
                    show.println("Deposito valor:..... $1000" + " --- " + "Balance actual: $" + cuenta.depositarDinero(1000));

                    show.println("\nTotal operaciones realizadas: \n");
                    for(String i : cuenta.getOperaciones()) {
                        if(i != null) show.println(i);
                    }

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 0:
                    show.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    limpiarPantalla();
                    limpiarPantalla();
                    show.println("¡¡¡Ejercicio incorrecto.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        }while(selected !=0);
    }

    public static int menu() {
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    GUIA 02: OBJETOS II.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    MENU");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [1].Ejercicio 01.");
        show.println("\t   [2].Ejercicio 02.");
        show.println("\t   [3].Ejercicio 03.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [0].Salir del programa.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n\n\t  Elija una opcion: ");
        show.println("\n");
        return scan.nextInt();
    }

    public static void limpiarPantalla() {
        for(int i=0;i<20;i++) {
            show.println("\n");
        }
    }

    public static class Pausa {
        public static void pausar() {
            show.println("\n");
            show.println(" ----------------------------------------");
            show.println("|Presionar la tecla ENTER para continuar.|");
            show.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            show.println("\n");
            aceptar.nextLine();
        }
    }
}
