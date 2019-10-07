package leernombre15;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File directorio = new File(".\\bin");
	    ProcessBuilder pb = new ProcessBuilder("java","paquete.paquete","");
	    pb.directory(directorio);
	    System.out.printf("Directorio de trabajo: %s%n",pb.directory());
	    //se ejecuta el proceso    
	    Process p = pb.start();
	    try{
	        InputStream is = p.getErrorStream();
	        int c;
	        int exitvalue;
	        while((c=is.read())!=-1)
	            System.out.print((char) c);
	            is.close();
	            exitvalue = p.waitFor();
	            System.out.println("Salida: "+exitvalue);
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	}

}
