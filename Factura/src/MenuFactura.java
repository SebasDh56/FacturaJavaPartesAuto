import java.util.Scanner;
public class MenuFactura {
    int producto;
    int volver;

    public void productos() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Listado de productos ");
        System.out.println("1.Llantas");
        System.out.println("2.Kit Pastillas de freno");
        System.out.println("3.Kit de embrague");
        System.out.println("4.Faro");
        System.out.println("5.Radiador");
        producto = sn.nextInt();

        switch (producto) {
            case 1:
                Llantas descuentoLlantas = new Llantas();
                descuentoLlantas.descuentoLlantas();
                System.out.println("Facturar mas productos ");
                System.out.println("1. Si ");
                System.out.println("2. NO ");
                volver = sn.nextInt();
                switch (volver) {
                    case 1:
                        MenuFactura producto = new MenuFactura();
                        producto.productos();

                    case 2:
                        Menu opciones = new Menu();
                        opciones.opciones();

                }
            case 2: //kit de pastillas etc
        }
    }
}



