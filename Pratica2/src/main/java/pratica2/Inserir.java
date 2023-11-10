package pratica2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Inserir {
	public static void inserirr() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do novo veículo:");

        System.out.print("Chassi: ");
        int chassi = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Fabricante: ");
        String fabricante = sc.nextLine();

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        System.out.print("Versão: ");
        String versao = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ano: ");
        String ano = sc.nextLine();

        System.out.print("Quantidade: ");
        int qtde = sc.nextInt();

        Veiculo novoVeiculo = new Veiculo(chassi, fabricante, descricao, versao, modelo, ano, qtde);

        em.getTransaction().begin();
        em.persist(novoVeiculo);
        em.getTransaction().commit();

        System.out.println("Veículo inserido com sucesso!");

        em.close();
        emf.close();
    }
}
