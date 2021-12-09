package ru.den.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "cars", schema = "public", catalog = "postgresCar")//
public class CarsEntity {
    @Id
    @Column(name = "id_car", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCar;
    @Column(name = "car_model")
    private String carModel;
    @Column(name = "car_tape")
    private String carTape;

    @OneToMany(mappedBy = "car")
    private Set<ColorCarEntity> listColor = new HashSet<>();



    public Set<ColorCarEntity> getListColor() {
        return listColor;
    }

    public CarsEntity() {
    }

    public CarsEntity(String carModel, String carTape) {
        this.carModel = carModel;
        this.carTape = carTape;

    }

    //public void setListColor(List<ColorCarEntity> listColor) {
    //    this.listColor = listColor;
    //}


    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }



    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }



    public String getCarTape() {
        return carTape;
    }

    public void setCarTape(String carTape) {
        this.carTape = carTape;
    }
    public void setListColor(Set<ColorCarEntity> listColor) {
        this.listColor = listColor;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarsEntity that = (CarsEntity) o;

        if (idCar != that.idCar) return false;
        if (carModel != null ? !carModel.equals(that.carModel) : that.carModel != null) return false;
        if (carTape != null ? !carTape.equals(that.carTape) : that.carTape != null) return false;

        return true;
    }




    @Override
    public int hashCode() {
        int result = idCar;
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        result = 31 * result + (carTape != null ? carTape.hashCode() : 0);
        return result;
    }*/

    @Override
    public String toString() {
        return "CarsEntity{" +
                "idCar=" + idCar +
                ", carModel='" + carModel + '\'' +
                ", carTape='" + carTape + '\'' +
                "Color Cars"  +
                '}';
    }
    public void printListColor(){
        listColor.forEach(x -> System.out.println(x.toString()));
    }
}
