import java.util.Scanner;
import PreparacionProgramacion.Excepciones_Ejercicio1.*;
public class MainExcepciones1 {
    public static Scanner in=new Scanner(System.in);
    public static int[][] arrayBidimensional=new int[2][4];
    public static int[] arrayFilas=new int[2];
    public static int[] arrayColumnas=new int[4];
    public static int[] resultadoColumnas= pedirColumnas.pedirColumnas(in, arrayColumnas);
    public static int[] resultadoFilas=pedirFilas.pedirFilas(in, arrayFilas); 
    public static void main(String[] args) {
        System.out.println("Vamos creando el array ");
        menu();

    }
    public static void menu(){
        String respuesta="no";
        int opcion=0;
        do{
        System.out.println("Elige una opcion");
        System.out.println("1) Mostrar array");
        System.out.println("2) ordenar array");
        System.out.println("3) pedir columnas");
        System.out.println("4) pedir filas");
        System.out.println("5) Salir");
        opcion=in.nextInt();
            switch(opcion){
                case 1:
                mostrarArray.mostrarArray(in,arrayBidimensional);
                break;
                case 2:
                ordenarArray.ordenarArray(in);
                break;
                case 3:
                resultadoColumnas= pedirColumnas.pedirColumnas(in, arrayColumnas);
                break;
                case 4:
                resultadoFilas=pedirFilas.pedirFilas(in, arrayFilas); 
                break;
                case 5:
                System.out.println("Gracias por utilizar el programa :)");
                break;
                default:
                System.out.println("Opcion no valida");
            }
        if (opcion==5){
            respuesta="no";
        }else{
        System.out.println("Quieres Seguir");
        respuesta=in.nextLine();
        }
        }while (respuesta.equalsIgnoreCase("Si"));
    }
}
