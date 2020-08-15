import java.util.Scanner;
public class crypto {
    public static Scanner lectura = new Scanner(System.in);
    public static void menuPrincipal(){
        int opcion;

        do{


        
        System.out.println("[1]Cifrar");
        System.out.println("[2] Desifrar");
        System.out.println("[3] Gauss-Jordan");
        System.out.println("[4] Salir");
        opcion = lectura.nextInt();

            switch(opcion){

                case 1:

                    menuCifrar();
                    break;

                case 2:

                    menuDescifrar();

                    break;

                case 3:

                    menuGaussJordan();

                    break;

                case 4:

                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida [1-4]");
            }
        }while(opcion <0 || opcion >4);
    }


    public static void menuCifrar(){


    }


    public static void menuDescifrar(){

    }


    public static void menuGaussJordan(){

    }

    public static void main(final String[] args) {
       menuPrincipal();

    }

}
