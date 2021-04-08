import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("\n\nDigite um número e veja se ele faz parte da SEQUENCIA FIBONACCI:");
			int numero = scn.nextInt();

			int fb1 = 1;
			int fb2 = 1;

			while (fb1 <= numero || fb2 <= numero) {

				if (fb1 >= fb2) {

					fb2 = fb2 + fb1;

					if (numero == fb2) {

						System.out.println(numero + " é Fibonacci! O próximo da sequência é: " + (fb2 + fb1));
						break;
					}
				} else {

					fb1 = fb1 + fb2;

					if (numero == fb1) {

						System.out.println(numero + " é Fibonacci! O próximo da sequência é: " + (fb1 + fb2));
						break;
					}
				}

				if (numero < fb1 || numero < fb2) {

					System.out.println(numero + " não faz parte da sequência FIBONACCI!!!");

					System.out.println("Os mais próximos são: " + fb1 + " e " + fb2);

					break;
				}
			}
			continue;
		}
	}
}
