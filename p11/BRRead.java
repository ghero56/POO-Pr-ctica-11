import java.io.*;
class BRRead { 
    public static void main(String args[]) throws IOException { 
        char c; 
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("Escriba caracteres, o presione 'q' para salir.");
        do { 
            c = (char) br.read(); 
            System.out.println(c); 
        } while(c != 'q');
    }
}
