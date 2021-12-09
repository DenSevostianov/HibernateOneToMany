package ru.den;


import org.hibernate.Session;


import ru.den.DAO.CarDAO;
import ru.den.Model.CarsEntity;
import ru.den.Model.ColorCarEntity;
import ru.den.util.HibernateSession;

import java.util.List;

public class Main {





    public static void main(String[] args)  {
        System.out.println("Hello");
        CarDAO carDAO= new CarDAO();
        //CarsEntity car1 = new CarsEntity("Opel", "MiniVan");
        //ColorCarEntity color1 = new ColorCarEntity("Black", car1);
        //ColorCarEntity color2 = new ColorCarEntity("White", car1);
        //ColorCarEntity color3 = new ColorCarEntity("Green", car1);
//
        //carDAO.save(car1);
        //carDAO.save(color1);
        //carDAO.save(color2);
        //carDAO.save(color3);
        //System.out.println("Record saved car");
        CarsEntity car = carDAO.getCar(23);
        System.out.println(car);

        car.setCarModel("Opel");
        car.setCarTape("MiniVan");
        carDAO.editCar(car);
        ColorCarEntity color = carDAO.getColor(24);
        color.setColorName("Silver");
        carDAO.editColor(color);
        System.out.println(carDAO.getColor(26));
        List<CarsEntity> cars = carDAO.getAllCars();

        cars.forEach(x -> System.out.println(x.toString()));
        List<ColorCarEntity> colorCarEntities = carDAO.getAllColor();
        colorCarEntities.forEach(x -> System.out.println(x.toString()));
        car.printListColor();
    }
}
