package ua.lviv.lgs.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Kerol on 21.05.2016.
 */
public class Main {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Main");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();



        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
    /*
        int a=3;
        int b;
        int c;
        if (a ==1) {
            System.out.println("Team one win");
        }
        if(a==2){
            System.out.println("Team draw");

        }
        if (a==3){
            System.out.println("Team two win");
        }

    }
*/
}