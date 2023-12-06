package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	public static final EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TMTStore");
		EntityManager em =  emf.createEntityManager();
		return em;
	}
}