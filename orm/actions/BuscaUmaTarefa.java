package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class BuscaUmaTarefa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Aluno t1 = manager.find(Aluno.class, 2L);
		System.out.println(t1.getDescricao());
		
		manager.close();
		factory.close();
	}

}
