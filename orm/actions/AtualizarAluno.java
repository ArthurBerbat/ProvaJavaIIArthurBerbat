package orm.actions;

import java.util.Calendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class AtualizarAluno {
	public static void main(String[] args) {
		Aluno Aluno1 = new Aluno();
		Aluno1.setId(2L);
		
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
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
////		tarefa1.setId(1L);
//		tarefa1 = manager.find(Tarefa.class, 1L);
		
		manager.getTransaction().begin(); //inicializar a transação
		manager.merge(Aluno1); //linha que faz o hibernate excluir um objeto no banco
		manager.getTransaction().commit(); //Encerramento da transação
		
		manager.close();
		factory.close();
	}

}
