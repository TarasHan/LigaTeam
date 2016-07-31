package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kerol on 21.05.2016.
 */
@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(nullable = true)
    private int scoreTeamOne;
    @Column(nullable = true)
    private int scoreTeamTwo;

    public Score(int scoreTeamOne, int scoreTeamTwo) {
        this.scoreTeamOne = scoreTeamOne;
        this.scoreTeamTwo = scoreTeamTwo;
    }

    @ManyToOne(fetch = FetchType.LAZY)

    private  Matches matches;

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", scoreTeamOne=" + scoreTeamOne +
                ", scoreTeamTwo=" + scoreTeamTwo +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Matches getMatches() {
        return matches;
    }

    public void setMatches(Matches matches) {
        this.matches = matches;
    }

    public int getScoreTeamTwo() {
        return scoreTeamTwo;
    }

    public void setScoreTeamTwo(int scoreTeamTwo) {
        this.scoreTeamTwo = scoreTeamTwo;
    }

    public int getScoreTeamOne() {
        return scoreTeamOne;
    }

    public void setScoreTeamOne(int scoreTeamOne) {
        this.scoreTeamOne = scoreTeamOne;
    }

    public Score(int scoreTeamOne, Matches matches, int scoreTeamTwo) {

        this.scoreTeamOne = scoreTeamOne;
        this.matches = matches;
        this.scoreTeamTwo = scoreTeamTwo;
    }



    public Score() {
    }

}
