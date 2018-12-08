package br.com.cursojava.aula10.contato;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula10.utils.JPAUtil;

public class RepositorioContato {
	
	public List<Contato> buscarTodos(){
		List<Contato> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("Select c from Contato c",Contato.class);
		lista = query.getResultList();
		return lista;
	}
	
	public static void main(String[] args) {
		
		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> todos = repositorio.buscarTodos();
		for (Contato contato : todos){
			System.out.println(contato.getNome() + ", "+contato.getEmail()+", "+contato.getTelefone());
		}
		
		//Contato contato = new Contato();
		//contato.setNome("Bagrinho");
		//contato.setNome("b@teste.com");
		//contato.setTelefone("96847260");
		
		//EntityManager em = JPAUtil.createEntityManager();
		//Contato contato = em.find(Contato.class, 1);
		//em.close();
		//em =JPAUtil.createEntityManager();
		//Contato = em.merge(contato)
		//em.getTransaction().begin();
		//contato.setNome("Bagrinho da Silva");
		//em.persist(contato);
		//em.getTransaction().commit();
		//em.close();
		//JPAUtil.closeEmf();
		
	}

}
