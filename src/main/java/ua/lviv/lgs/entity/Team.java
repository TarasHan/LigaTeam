package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kerol on 18.05.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Team.findAllTeamByNationId",query = "SELECT  b from Team b where b.nation.id=id")
})
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int win;
    @Column
    private int draw;
    @Column
    private int lose;
    @ManyToOne(fetch = FetchType.LAZY)
    private Nation nation;
    @ManyToOne(fetch = FetchType.LAZY)
    private Liga liga;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "teamMatches")
    private List<Matches>matchesList;

    public Team(String name, Liga liga, int win, int draw, int lose, Nation nation) {
        this.name = name;
        this.liga = liga;
        this.win = win;
        this.draw = draw;
        this.lose = lose;
        this.nation = nation;
    }

    public Team(String name, int win, int draw, int lose) {
        this.name = name;
        this.win = win;
        this.draw = draw;
        this.lose = lose;
    }

    public Liga getLiga() {

        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Team(Liga liga) {

        this.liga = liga;
    }



    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", win=" + win +
                ", draw=" + draw +
                ", lose=" + lose +
                ", nation=" + nation +
                ", liga=" + liga +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Team() {
    }
}
