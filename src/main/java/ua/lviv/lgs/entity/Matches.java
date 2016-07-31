package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kerol on 21.05.2016.
 */
@Entity

public class Matches {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column

    private int id;

    public Matches(String teamOne, String teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    @Column
    private String teamOne;
    @Column
    private String teamTwo;
    @Column
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "matches")
    private List<Score> scoreList;
    @ManyToOne(fetch = FetchType.LAZY)
    private Calendar calendar;
    @ManyToOne(fetch = FetchType.LAZY)
    private Team teamMatches;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable (name = "matchBet",joinColumns = @JoinColumn(name = "id_match"),inverseJoinColumns = @JoinColumn(name = "id_bet"))
    private List<Bet>betListMatch;

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Matches(String teamOne, String teamTwo, List<Score> scoreList, Calendar calendar) {

        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.scoreList = scoreList;
        this.calendar = calendar;
    }

    public Matches(Calendar calendar) {

        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "Matches{" +
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

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public Matches(String teamOne, List<Score> scoreList, String teamTwo) {

        this.teamOne = teamOne;
        this.scoreList = scoreList;
        this.teamTwo = teamTwo;
    }

    public Matches() {

    }
}
