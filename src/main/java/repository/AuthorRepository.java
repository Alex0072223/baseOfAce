package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorRepository {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public AuthorRepository() {
        this.entityManagerFactory= Persistence.createEntityManagerFactory("CatalogOfMusic");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

    public void close(){
        entityManager.close();
        entityManagerFactory.close();
    }
}
