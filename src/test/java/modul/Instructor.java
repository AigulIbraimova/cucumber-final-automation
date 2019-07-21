package modul;

import lombok.Data;

@Data
public class Instructor {
    private int id;
    private String firstName;
    private String lastName;
    private int batch;
    private String subject;
}
