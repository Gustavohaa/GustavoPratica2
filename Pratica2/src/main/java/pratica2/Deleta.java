package pratica2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Deleta {
	public static void deletar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o chassi do veículo a ser deletado: ");
		int chassi = sc.nextInt();

		Veiculo veiculo = em.find(Veiculo.class, chassi);

		if (veiculo != null) {
			System.out.println("Informações do Veículo:");
			System.out.println(veiculo);

				em.getTransaction().begin();
				em.remove(veiculo);
				em.getTransaction().commit();
				System.out.println("Veículo removido com sucesso!");
		} else {
			System.out.println("Veículo não encontrado.");
		}

		em.close();
		emf.close();
	}
}