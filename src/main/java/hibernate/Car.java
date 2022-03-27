package hibernate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cars")
public class Car {
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "release")
    private int release;
    @Id
    @Column(name = "number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number;
    @Column(name = "technicalInspection")
    private LocalDate technicalInspection;


    public boolean setBrand(String newBrand) {
        return true;
    }
    public String geBrand() {
        return brand;
    }
    public boolean setModel(String newModel) { return true; }
    public String getModel() {
        return model;
    }
    public boolean setRelease(int newRelease) {
        return true;
    }
    public int getRelease() {
        return release;
    }
    public boolean setNumber(String newNumber) { return true; }
    public String getType() {
        return number;
    }
    public boolean setTechnicalInspection(LocalDate newTechnicalInspection) { return true; }
    public LocalDate getTechnicalInspection() {
        return technicalInspection;
    }
}
