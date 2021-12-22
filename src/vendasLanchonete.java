import java.util.Scanner;

public class vendasLanchonete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cod;
		int qtd;

		double subtotal = 0;

		System.out.println("Digite:\n1 para Cachorro Quente \n2 para X-Salada "
				+ "\n3 para X-Bacon \n4 para Torrada simples \n5 para Refrigerante" + "\nOutro valor para sair");
		cod = sc.nextInt();

		while (cod < 6 && cod > 0) {
			System.out.println("Informe a quantidade desejada: ");
			qtd = sc.nextInt();
			if (qtd < 0) {
				System.out.println("Quantidade inválida!");
			} // fim if código inválido
			else {
				if (cod == 1) {
					subtotal = subtotal + 4 * qtd;

				}

				if (cod == 2) {
					subtotal = subtotal + 4.5 * qtd;

				}

				if (cod == 3) {
					subtotal = subtotal + 5 * qtd;

				}

				if (cod == 4) {
					subtotal = subtotal + 2 * qtd;

				}

				if (cod == 5) {
					subtotal = subtotal + 1.5 * qtd;

				}
			} // fim else qtd válida

			System.out.println();
			System.out.println("Digite:\n1 para Cachorro Quente \n2 para X-Salada "
					+ "\n3 para X-Bacon \n4 para Torrada simples \n5 para Refrigerante" + "\nOutro valor para sair");
			cod = sc.nextInt();
		}

		System.out.println();
		System.out.printf("O valor total do pedido é R$ %.2f", subtotal);

		sc.close();
	}

}