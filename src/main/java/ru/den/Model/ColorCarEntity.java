package ru.den.Model;

import javax.persistence.*;

@Entity
@Table(name = "color_car", schema = "public", catalog = "postgresCar")
public class ColorCarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "color_id", nullable = false)
    private int colorId;
    @Column(name = "color_name")
    private String colorName;

    @ManyToOne
    @JoinColumn(name = "fk_car_id") //,,referencedColumnName = "id_car"
    private CarsEntity car;

    public ColorCarEntity() {
    }

    public ColorCarEntity(String colorName, CarsEntity car) {
        this.colorName = colorName;
        this.car = car;
    }

    public ColorCarEntity(String colorName) {
        this.colorName = colorName;
    }


    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }



    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ColorCarEntity that = (ColorCarEntity) o;

        if (colorId != that.colorId) return false;
        if (colorName != null ? !colorName.equals(that.colorName) : that.colorName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = colorId;
        result = 31 * result + (colorName != null ? colorName.hashCode() : 0);
        return result;
    }*/

    @Override
    public String toString() {
        return "ColorCarEntity{" +
                "colorId=" + colorId +
                ", colorName='" + colorName + '\'' +
                '}';
    }
}
