import java.util.Scanner;
public class Llantas {
    private int precioNormal=150;
    private int precioAlPorMayor=130;

        public void descuentoLlantas(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("La catidad de llantas ");
            int cantidad = scanner.nextInt();
            System.out.println("Valor por "+cantidad+" Llantas");
            if (cantidad >= 6) {
                int resultado = cantidad * precioAlPorMayor;

                System.out.println(" El costo es de " + resultado+ ",00 $");
            } else {
                int resultado = cantidad * precioNormal;
                System.out.println( " El costo es de " + resultado+ ",00 $");
            }
            try {
                Thread.sleep(1000); // Espera 1 segundo (1000 milisegundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }





        }




    }

