package PreparacionProgramacion.Excepciones_Ejercicio1;
import java.lang.reflect.Array;
import java.util.Scanner;

public class pedirFilas {
    public static int[] pedirFilas(Scanner in,int[] arrayFilas){
        System.out.println("Has elegido la opcion 'Pedir Filas'," 
        +"en esta opcion solo se te pedirá introducir los numeros de las filas, "
        +"pero para introducir esos numeros, "
        +"necesitaras mas tarde seleccionar la opcion 'Cargar array'");
        System.out.println("Introduce los numeros de para las filas");
        int entradaDatos;
        int filas=0;
        int contador=0;
        if (filas==1 && contador==0){
        for(int i=0;i<arrayFilas.length;i++){
          entradaDatos=in.nextInt();
          arrayFilas[i]=entradaDatos;
          contador++;
        }
        if (filas==2 && contador==0){
          for(int i=0;i<arrayFilas.length;i++){
            entradaDatos=in.nextInt();
            arrayFilas[i]=entradaDatos;
            contador++;
          }
      }
    }
    System.out.println("Si no puedes acceder a una fila, reinicia el programa");
    return arrayFilas;
  }
}
