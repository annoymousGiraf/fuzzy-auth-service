package local.auth.service.mockauthservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String uname;
    private boolean isActive;


    public User() {
    }

    public User(long id, String firstName, String lastName, String uname, boolean isActive) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uname = uname;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUname() {
        return uname;
    }

    public boolean isActive() {
        return isActive;
    }
}
