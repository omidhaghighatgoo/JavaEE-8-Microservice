package dao.entity;

import javax.persistence.*;

/**
 * Created by OmiD.HaghighatgoO on 05/28/2018.
 */

@Entity
@Table(name = "APPUSER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private long userId;

    @Column(name="USERNAME" , nullable = false , unique = true)
    private String userName ;

    @Column(name="NAME" , nullable = false )
    private String name ;

    @Column(name="FAMILY" , nullable = false )
    private String family ;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
