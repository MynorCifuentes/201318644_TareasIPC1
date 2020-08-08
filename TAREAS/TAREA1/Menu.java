
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Seleccione una opcion");
            System.out.println("[1] Indicar si un numero es par ");
            System.out.println("[2] Tabla de multiplicar de un numero ");
            System.out.println("[3] Numeros primos entre dos numeros ");
            System.out.println("[4] Calculadora con operaciones basicas ");
            System.out.println("[5] Salir ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero");
                    int numero = entrada.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("El numero: " + numero + " es un numero par");
                    } else {
                        System.out.println("El numero: " + numero + " es un numero impar");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese numero base");
                    int base = entrada.nextInt();
                    System.out.println("Ingrese final");
                    int nfinal = entrada.nextInt();
                    for (int i = 1; i <= nfinal; i++) {

                        System.out.println(base + "x" + i + "=" + i * base);
                    }
                    break;

                case 3:
                    boolean esPrimo;
                    System.out.println("Ingrese numero inicial");
                    int num_inicial = entrada.nextInt();
                    System.out.println("Ingrese numero final");
                    int num_final = entrada.nextInt();
                    System.out.println("----------------------------");
                    for (int i = num_inicial; i <= num_final; i++) {
                        esPrimo=true;
                        for (int j = 2; j < i; j++) {
                            if ((i % j) == 0) {
                                esPrimo = false;
                            }
                        }
                        if (esPrimo == true) {
                            System.out.println("El numero: " + i + " es primo");
                        }

                    }

                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
            }

        } while (opcion < 1 || opcion > 5);
    }
}