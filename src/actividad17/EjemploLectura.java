package actividad17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjemploLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (in);
		String texto;
		try {
			System.out.println("Introduce una cadena....");
			texto = br.readLine();
			System.out.println("Cadena escrita: " + texto);
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
