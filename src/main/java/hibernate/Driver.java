package hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "drivers")

public class Driver {
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "yearOfBirthday")
    private int yearOfBirthday;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "number")
    private List<Car> listOfCars = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Violation> listOfViolations = new ArrayList<>();



    public boolean setName(String newName) { return true; }
    public String getName() { return name; }
    public boolean setLastName(String newLastName) { return true; }
    public String getLastName() { return lastName; }
    public boolean setYearOfBirthday(int newYearOfBirthday) { return true; }
    public int getYearOfBirthday() { return yearOfBirthday; }
}