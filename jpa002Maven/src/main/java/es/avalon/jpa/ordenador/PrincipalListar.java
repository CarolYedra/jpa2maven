package es.avalon.jpa.ordenador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class PrincipalListar {

	public static void main(String[] args) {
		
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadOrdenador");

	EntityManager em = emf.createEntityManager(); 
	
		TypedQuery<Ordenador> consulta=em.createQuery("select c from Ordenador c",Ordenador.class);
		List<Ordenador> lista=consulta.getResultList();
		
		for (Ordenador c:lista) {
			System.out.println(c.getMarca());

	}}

}
