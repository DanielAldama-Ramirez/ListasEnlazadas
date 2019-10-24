package listasenlazadasADAR;
import java.util.Scanner;


public class ListasEnlazadasADAR {

    public static int Leer(String linea) {
        Scanner leer = new Scanner(System.in);
        System.out.println(linea);
        int data = leer.nextInt();
        return data;
    }

    
    public static void main(String[] args) {
        Lista coleccion = new Lista();
        int opcion;
        do {
            System.out.println(" Ingresar datos a la lista");
            System.out.println(" Mostrar lista");
            System.out.println(" Suprimir solo los que sobrepasan el limite");
            System.out.println(" Salir");
            opcion = Leer("Seleccionar una opción:");

            switch (opcion) {
                case 1: {
                    int nuevo = Leer("Inserte elementos de la lista: ");
                    coleccion.agregarFin(nuevo);
                    break;
                }
                case 2: {
                    System.out.println("La lista es: ");
                    coleccion.imprimir();
                    break;
                }
                case 3: {
                    int valor = Leer("Ingrese el valor que sirva de limite: ");
                    coleccion.eliminar(valor);
                    break;
                }
                case 4: {
                    System.out.println("Aqui termina el programa ¡¡¡Gracias!!!");
                    break;
                }
            }
        } while (opcion != 4);
    }
}