import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el color de la figura");
    String colorFigura = scanner.nextLine();

    System.out.println("Ingrese el radio del circulo:");
    int radioCirculo = scanner.nextInt();
    scanner.nextLine();

    Circulo circulo1 = new Circulo(colorFigura, radioCirculo);
    circulo1.mostrarInfo();

    scanner.close();
}
}