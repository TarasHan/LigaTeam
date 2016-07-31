package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kerol on 21.05.2016.
 */
@Entity
@Table
@NamedQueries({

        @NamedQuery(name = "Nation.findNationByName",query = "SELECT a from Nation a where a.nameNation like :nation"),
        @NamedQuery(name = "Nation.findAllTeamByNationId",query = "SELECT  b from Nation b where b.id=id")

})

public class Nation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String nameNation;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nation")
    private List<Team> teamListNation;

    @Override
    public String toString() {
        return "Nation{" +
                "id=" + id +
                ", nameNation='" + nameNation + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameNation() {
        return nameNation;
    }

    public void setNameNation(String nameNation) {
        this.nameNation = nameNation;
    }

    public List<Team> getTeamListNation() {
        return teamListNation;
    }

    public void setTeamListNation(List<Team> teamListNation) {
        this.teamListNation = teamListNation;
    }

    public Nation(String nameNation, List<Team> teamListNation) {

        this.nameNation = nameNation;
        this.teamListNation = teamListNation;
    }

    public Nation(String nameNation) {

        this.nameNation = nameNation;
    }

    public Nation() {

    }
}
