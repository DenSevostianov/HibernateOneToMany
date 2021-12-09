package ru.den.DAO;

import org.hibernate.Session;
import ru.den.Model.CarsEntity;
import ru.den.Model.ColorCarEntity;
import ru.den.util.HibernateSession;

import java.util.List;


public class CarDAO {

    //final static Session session = HibernateSession.getSessionFactory().openSession();
    static final Session session = HibernateSession.getSessionFactory().openSession();

    public void save(CarsEntity car){
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
        System.out.println("Record saved car");
    }
    public void save(ColorCarEntity color){
        session.beginTransaction();
        session.save(color);
        session.getTransaction().commit();
        System.out.println("Record saved color");
    }
    public CarsEntity getCar(int id){
        return session.get(CarsEntity.class, id);
    }
    public ColorCarEntity getColor(int id){
        return session.get(ColorCarEntity.class, id);
    }
    public List<CarsEntity> getAllCars(){
        List<CarsEntity> carsList = session.createQuery("from CarsEntity ").list();
        return carsList;
    }
    public List<ColorCarEntity> getAllColor(){
        List<ColorCarEntity> colorList = session.createQuery("from ColorCarEntity ").list();
        return colorList;
    }
    public void editCar(CarsEntity car){
        session.beginTransaction();
        session.saveOrUpdate(car);
        session.getTransaction().commit();
    }
    public void editColor(ColorCarEntity color){
        session.beginTransaction();
        session.saveOrUpdate(color);
        session.getTransaction().commit();
    }
}
