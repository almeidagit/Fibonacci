import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("\n\nDigite um n�mero e veja se ele faz parte da SEQUENCIA FIBONACCI:");
			int numero = scn.nextInt();

			int fb1 = 1;
			int fb2 = 1;

			while (fb1 <= numero || fb2 <= numero) {

				if (fb1 >= fb2) {

					fb2 = fb2 + fb1;

					if (numero == fb2) {

						System.out.println(numero + " � Fibonacci! O pr�ximo da sequ�ncia �: " + (fb2 + fb1));
						break;
					}
				} else {

					fb1 = fb1 + fb2;

					if (numero == fb1) {

						System.out.println(numero + " � Fibonacci! O pr�ximo da sequ�ncia �: " + (fb1 + fb2));
						break;
					}
				}

				if (numero < fb1 || numero < fb2) {

					System.out.println(numero + " n�o faz parte da sequ�ncia FIBONACCI!!!");

					System.out.println("Os mais pr�ximos s�o: " + fb1 + " e " + fb2);

					break;
				}
			}
			continue;
		}
	}
}
