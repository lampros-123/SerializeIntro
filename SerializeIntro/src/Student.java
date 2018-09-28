
import java.time.LocalDate;


/**
 *
 * @author Matthias
 */
public class Student {
    private String name;
    private LocalDate birthday;

    public Student(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }
    
    
}
