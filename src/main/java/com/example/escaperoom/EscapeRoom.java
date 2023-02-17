package com.example.escaperoom;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EscapeRoom {
    public static Session session1 = HibernateUtil.getSessionFactory().getCurrentSession();

    public static void main(String[] args) {
        int x=codigo1();
        int y=codigo2();
        int z=codigo3();
        int w=codigo4();

        System.out.println("Hola desde Hibernate");
//        Query query1 = session1.createQuery("SELECT COUNT(m.idModulo) from ModuloEntity m");
//        x = query1.executeUpdate();
        System.out.println("El código descubierto es :" +x+y+z+w);
        session1.getTransaction().commit();
        session1.close();
    }
    public static int codigo1() {
        //TO-DO
        Transaction transaction = session1.getTransaction();
        transaction.begin();
        Query q1 = session1.createQuery("select count(m) from ModuloEntity m");
        long result = (long)q1.uniqueResult();

        return (int) result;
    }
    public static int codigo2() {
        //TO-DO
        return 0;
    }
    public static int codigo3() {
        //TO-DO
        return 0;
    }
    public static int codigo4() {
        //TO-DO
        return 0;
    }
}
