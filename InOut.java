import java.util.Scanner;

public class InOut {

	public static void main(int args) {

		int num, x1, x2, x3, x4;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero de 4 digitos");
		num = entrada.nextInt();

		x1 = num / 10000;
		x2 = (num / 1000) % 10;
		x3 = (num / 100) % 10;
		x4 = (num / 10) % 10;

		System.out.println(x1 + "   " + x2 + "   " + x3 + "   " + x4);
	}

}