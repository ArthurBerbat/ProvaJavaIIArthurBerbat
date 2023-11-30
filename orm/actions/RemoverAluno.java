package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class RemoverAluno {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
//		tarefa1.setId(1L);
		aluno1 = manager.find(Aluno.class, 1L);
		
		manager.getTransaction().begin(); //inicializar a transação
		manager.remove(aluno1); //linha que faz o hibernate excluir um objeto no banco
		manager.getTransaction().commit(); //Encerramento da transação
		
		manager.close();
		factory.close();
	}

}
