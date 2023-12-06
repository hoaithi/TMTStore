import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.*;
import utils.JpaUtil;

public class Main {

    public static void main(String[] agrs) {
        
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();

        CategoryEntity category = new CategoryEntity();
        category.setName("laptop");
        em.persist(category);
        em.getTransaction().commit();
        em.close();
    }
}