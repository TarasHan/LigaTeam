package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kerol on 21.05.2016.
 */
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String lastName;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = true)
    private String password;
    @Column(nullable = true, unique = true)
    private String email;
   // @Column
   //private int points=0;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable (name = "betBet",joinColumns = @JoinColumn(name = "id_user"),inverseJoinColumns = @JoinColumn(name = "id_bet"))
    private List<Bet>betList;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 //   public int getPoints() {
  //      return points;
 //   }

   // public void setPoints(int points) {
  //      this.points = points;
   // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Users(String name, String email, String password, String nickName, String lastName) {

        this.name = name;
       // this.points = points;
        this.email = email;
        this.password = password;
        this.nickName = nickName;
        this.lastName = lastName;
    }

    public Users() {

    }


}
