import  java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el crédito aprobado: ");
        double credito = scanner.nextDouble();
        scanner.nextLine();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(credito);

        int salir = 1;
        while(salir != 0) {
            System.out.println("Escriba la descripción de la compra:");
            String descripcion = scanner.next();

            System.out.println("Escriba el valor de la compra:");
            double valor = Double.valueOf(scanner.next());

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.verificarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        for (Compra compra : tarjeta.getListaDeCompras()) {
            System.out.println(compra.getDescripcion() + " - " +compra.getPrecio());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " +tarjeta.getBalance());
    }
}
