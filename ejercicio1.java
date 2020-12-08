import java.io.File;

class Archivos2{
  public static void main(String[] args) {
    File f1,f2,f3;
    f1 = new File("\%CURRENTUSER\%/Desktop/archivo.txt");
    f1 = new File("archivo2.txt");
    f1 = new File("archivo3.txt");

    if (f1.renameTo(f2))
      System.out.println("Archivo Renombrado");
    else
      System.out.println("El archivo no pudo ser renombrado");
    if (f3.delete())
      System.out.println("El archivo ha sido borrado");
    else
      System.out.println("El archivo no ha podido ser borrado");
  }
}
