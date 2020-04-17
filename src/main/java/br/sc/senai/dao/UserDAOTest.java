package br.sc.senai.dao;

import br.sc.senai.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserDAOTest {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        User newUser = new User();
        newUser.setEmail("billfoy@gmail.com");
        newUser.setFullname("roberto carlos santos");
        newUser.setPassword("bili");

        entityManager.persist(newUser);
        entityManager.getTransaction().commit();

        entityManager.close();

        factory.close();
    }
}
