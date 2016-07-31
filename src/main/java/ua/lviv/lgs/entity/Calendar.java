package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Kerol on 21.05.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Calendar.findCalendarByDate", query = "select a from Calendar a where a.dateMatch=:dateMatch")
})
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String teamOne;
    @Column
    private  String teamTwo;

    public Calendar(String teamOne, String teamTwo, Date dateMatch) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.dateMatch = dateMatch;
    }

    @Column
    private Date dateMatch;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "calendar")
    private List<Matches>matchesListCalendar;

    @Override
    public String toString() {
        return "Calendar{" +
                "id=" + id +
                ", teamOne='" + teamOne + '\'' +
                ", teamTwo='" + teamTwo + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Matches> getMatchesListCalendar() {
        return matchesListCalendar;
    }

    public void setMatchesListCalendar(List<Matches> matchesListCalendar) {
        this.matchesListCalendar = matchesListCalendar;
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public Calendar(Date dateMatch, List<Matches> matchesListCalendar, String teamTwo, String teamOne) {

        this.dateMatch = dateMatch;
        this.matchesListCalendar = matchesListCalendar;
        this.teamTwo = teamTwo;
        this.teamOne = teamOne;
    }

    public Calendar() {

    }
}
