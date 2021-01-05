import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	private static final int MesEmDias = 30;
	private static final int AnoEmDias = 365;

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idadeEmDias = sc.nextInt();		
		sc.close();
		
		int emAnos = CalcularEmAno(idadeEmDias);
		idadeEmDias -= emAnos * AnoEmDias;
		int emMeses = CalcularEmMes(idadeEmDias);
		idadeEmDias -= (emMeses * MesEmDias);
		
		System.out.println(emAnos + " ano(s)");
		System.out.println(emMeses + " mes(es)");
		System.out.println(idadeEmDias + " dia(s)");
		
	}

	private static int CalcularEmMes(int idadeEmDias) {
		return idadeEmDias / MesEmDias;		
	}

	private static int CalcularEmAno(int idadeEmDias) {
		return idadeEmDias / AnoEmDias;	
	}

}
