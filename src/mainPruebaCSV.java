import programacion.ArchivosCSV.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainPruebaCSV {
  public static void main(String[] args) throws IOException {
    crearCabecerasCSV.crearCabeceras();
    try {
      FileReader leer = new FileReader("prueba.csv");
      int caracteres = leer.read();
      while (caracteres != -1) {
        System.out.println((char) caracteres);
        caracteres = leer.read();
      }
      leer.close();
    } catch (FileNotFoundException Excepcion) {
      Excepcion.printStackTrace();
    }
  }
}