import java.io.*;
class DemoConsole { 
    public static void main(String args[]) { 
        String str; 
        Console con;

        con = System.console();
        if(con == null) return;
        str = con.readLine("Escribe una cadena: "); 
        con.printf("Tu cadena es: %s\n", str);
        //Ejercicio de practica: Describir que se esta haciendo en esta línea
        String s = new String(con.readPassword("Escribe una contraseña: "));
        System.out.println(s);
    }
}
        