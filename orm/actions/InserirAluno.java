package orm.actions;

import java.util.Calendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class InserirAluno {
	public static void main(String[] args) {
		Aluno Aluno1 = new Aluno();

        Scanner sc = new Scanner(System.in);
 
        String name = sc.nextLine();
		Aluno1.setNome(name);
 
		int CPF = sc.nextInt();
		Aluno1.setCPF(CPF);
		
		int date = sc.nextInt();
       	Aluno1.setDataNascimento(date);

        String naturalidade = sc.nextLine();
		Aluno1.setNaturalidade(naturalidade);
		
		String Endereco = sc.nextLine();
		Aluno1.setEndereco(Endereco);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin(); //inicializar a transação
		manager.persist(Aluno1); //linha que faz o hibernate inserir um objeto no banco
		manager.getTransaction().commit(); //Encerramento da transação
		
		manager.close();
		factory.close();
	}

}
