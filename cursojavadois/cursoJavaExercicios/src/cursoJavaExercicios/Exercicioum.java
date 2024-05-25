package cursoJavaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicioum {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		double soma = A * B - C * D;

		System.out.printf("DIFERENÇA: %.0f", soma);

		sc.close();
	}
}