package PreparacionProgramacion.Excepciones_Ejercicio1;
import java.util.Scanner;
public class pedirColumnas {
    public static int[] pedirColumnas(Scanner in, int[] arrayColumnas){
        System.out.println("Has elegido la opcion 'Pedir Filas'," 
        +"en esta opcion solo se te pedirá introducir los numeros de las filas, "
        +"pero para introducir esos numeros, "
        +"necesitaras mas tarde seleccionar la opcion 'Cargar array'");
        System.out.println("Introduce los numeros de para las filas");
        int entradaDatos;
        int columna=1;
        int contador=0;
        System.out.println("Elige una columna del 1-4");
        if (columna==1 && contador==0 ){
            for(int i=0;i<arrayColumnas.length;i++){
            entradaDatos=in.nextInt();
            arrayColumnas[i]=entradaDatos;
            contador++;
            }
        }
        if (columna==2 && contador==0 ){
            for(int i=0;i<arrayColumnas.length;i++){
            entradaDatos=in.nextInt();
            arrayColumnas[i]=entradaDatos;
            contador++;
            }
        }
        if (columna==3 && contador==0 ){
            for(int i=0;i<arrayColumnas.length;i++){
            entradaDatos=in.nextInt();
            arrayColumnas[i]=entradaDatos;
            contador++;
            }
        }
        if (columna==4 && contador==0 ){
            for(int i=0;i<arrayColumnas.length;i++){
            entradaDatos=in.nextInt();
            arrayColumnas[i]=entradaDatos;
            contador++;
            }
        }
        System.out.println("Si no puedes acceder a una columna, reinicia el programa");
        return arrayColumnas;
    }
}
