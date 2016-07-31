package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kerol on 21.05.2016.
 */
@Entity
//@NamedQueries({
 //       @NamedQuery(name = "Liga.findLigaByName",query ="SELECT a from Liga a where a.liga like : liga" )
//})
public class Liga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private  int id;
    @Column
    private String ligaName;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "liga")
    private List<Team>teamListLiga;

    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", liga='" + ligaName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Team> getTeamListLiga() {
        return teamListLiga;
    }

    public void setTeamListLiga(List<Team> teamListLiga) {
        this.teamListLiga = teamListLiga;
    }

    public String getLiga() {
        return ligaName;
    }

    public void setLiga(String liga) {
        this.ligaName = liga;
    }

    public Liga(String ligaName) {
        this.ligaName = ligaName;
    }

    public Liga(String liga, List<Team> teamListLiga) {

        this.ligaName = liga;
        this.teamListLiga = teamListLiga;
    }

    public Liga() {

    }
}
