import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Principal{

	public static void main(String []args){
	String[] lineas = {"Esto es una prueba"};
	FileWriter fichero = null;
	try {
		fichero = new FileWriter("fichero.txt");
	for(String linea : lineas){
		fichero.write(linea);
		}
	fichero.close();
	
	} catch (Exception ex) {
		System.out.println(":(");
		}
	leerFichero();
	}
	 public static void leerFichero(){
                        File fichero = new File("fichero.txt");
                        Scanner sc = null;
                        try{

                               sc = new Scanner(fichero);
                                String cadena = sc.nextLine();
                                System.out.print(cadena);

                }catch (Exception ex1){
                        System.out.println(" ;( " + ex1.getMessage());



               }
        }
}



