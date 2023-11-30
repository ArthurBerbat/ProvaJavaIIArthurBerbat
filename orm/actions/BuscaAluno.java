package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Aluno;

public class BuscaAluno {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		//Query em JPQL que é traduzida para o SQL do banco definido persistence.xml
		Query query = manager.createQuery("select * from alunos");
		query.setParameter("paramFinalizado", true);
		
		List<Aluno> lista = query.getResultList();
		/*
		for (Aluno t : lista) {
			System.out.println(t.getDescricao());
		}
		*/
		manager.close();
		factory.close();
		
	}

}
