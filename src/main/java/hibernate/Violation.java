package hibernate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "violations")
public class Violation {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "intruder")
    private int intruder;


    public boolean setType(String newType) { return true; }
    public String getType() {
        return type;
    }
    public boolean setDate(LocalDate newDate) { return true; }
    public LocalDate getDate() {
        return date;
    }
    public boolean setIntruder(String newIntruder) { return true; }
    public int getIntruder() {
        return intruder;
    }

}
