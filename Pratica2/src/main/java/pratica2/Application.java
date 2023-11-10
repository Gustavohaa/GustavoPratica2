package pratica2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;

		do {
			System.out.println("Escolha a funcionalidade:");
			System.out.println("1. Inserir");
			System.out.println("2. Consultar");
			System.out.println("3. Deletar");
			System.out.println("4. Atualizar");
			System.out.println("0. Sair");

			escolha = sc.nextInt();
			sc.nextLine(); 

			switch (escolha) {
			case 1:
				Inserir.inserirr();
				break;
			case 2:
				Consulta.consultar();
				break;
			case 3:
				Deleta.deletar();
				break;
			case 4:
				Atualiza.atualizar();
				break;
			case 0:
				System.out.println("Saindo do programa. Até mais!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (escolha != 0);
	}
}
