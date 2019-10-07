package actividad16;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File directorio = new File(".\\bin");
	    ProcessBuilder pb = new ProcessBuilder("java","actividad16.Suma");
	    pb.directory(directorio);
	    System.out.printf("Directorio de trabajo: %s%n",pb.directory());
	        
	    Process p = pb.start();
	    
	    OutputStream os = p.getOutputStream();
	    os.write("1\n9\n".getBytes());
	    os.flush();
	    
	  //lectura -- obtiene la salida de DATE
		InputStream is=p.getInputStream();
		int c;
		while((c=is.read())!=-1)
			System.out.print((char)c);
		is.close();
	    
	  // OMPROBACION DE ERROR - 0 bien - 1 mal
	    int exitVal;
	    try {
			exitVal = p.waitFor();
			System.out.println("Valor de salida: " + exitVal);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
