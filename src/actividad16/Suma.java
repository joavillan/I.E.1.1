package actividad16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader (in);
		int a, b;
		
		try {
			a = Integer.parseInt(teclado.readLine());
			b = Integer.parseInt(teclado.readLine());
			int suma = 0;
			suma = a+b;
			System.out.println("Suma: "+suma);
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
