import java.util.Scanner;
public class Menu {
    public void opciones() {


        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int producto;
        int volver;

        while (!salir) {

            System.out.println("1. Facturar producto");
            System.out.println("2. Imprimir factura");
            System.out.println("3. Salir");
            System.out.println("4. Salir");

            System.out.println("Elija su opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    MenuFactura productos = new MenuFactura();
                    productos.productos();

                case 2:
                    System.out.println("El valor total de los productos es de ");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
    }
}

