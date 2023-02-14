package com.example.escaperoom;
import com.example.escaperoom.model.AlumnoEntity;
import com.example.escaperoom.model.ExamenEntity;
import com.example.escaperoom.model.ModuloEntity;
import com.example.escaperoom.model.ProfesorEntity;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.io.File;


public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    // Código estático. Sólo se ejecuta una vez, como un Singleton
    static {
        try {
            // Creamos es SessionFactory desde el fichero hibernate.cfg.xml
            sessionFactory = new AnnotationConfiguration()
                    .configure(new File("hibernate.cfg.xml"))
                    .addAnnotatedClass(AlumnoEntity.class)
                    .addAnnotatedClass(ExamenEntity.class)
                    .addAnnotatedClass(ModuloEntity.class)
                    .addAnnotatedClass(ProfesorEntity.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Error en la inicialización.  " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
