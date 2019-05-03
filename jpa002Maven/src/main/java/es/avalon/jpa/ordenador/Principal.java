package es.avalon.jpa.ordenador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.avalon.jpa.ordenador.Ordenador;

public class Principal {
	
	public static void main(String[] args) {

		Ordenador ordenador = new Ordenador("c13", "hp", 200);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadOrdenador"); 
		
		EntityManager em = emf.createEntityManager();
		//Ordenador o1 = em.find(Ordenador.class, "c13");
		//o1.setMarca("hp");
		//o1.setPrecio(250);
		
		try {
			em.getTransaction().begin();
			em.persist(ordenador); //merge actualiza // persist añade //remove borrar
			em.getTransaction().commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();

		}

}}
