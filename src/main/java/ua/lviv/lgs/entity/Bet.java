package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kerol on 25.05.2016.
 */
@Entity
//@NamedQueries(
     //   {
   //             @NamedQuery(name = "Bet.findAllBetByUserId",query = "SELECT b from Bet b where b.usersListBet.id")
   //     }
//)
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private  int id;
    @Column
    private int teamOneWin;
    @Column
    private int teamDraw;
    @Column
    private int teamTwoWin;
    @ManyToMany(fetch = FetchType.LAZY)

    @JoinTable(name ="betBet",joinColumns = @JoinColumn(name = "id_bet"),inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<Users> usersListBet;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "matchBet",joinColumns = @JoinColumn(name = "id_bet"),inverseJoinColumns = @JoinColumn(name = "id_match"))
    private List<Matches>matchesListBet;

    public Bet(int teamOneWin, int teamDraw, int teamTwoWin) {
        this.teamOneWin = teamOneWin;
        this.teamDraw = teamDraw;
        this.teamTwoWin = teamTwoWin;
    }






    @Override
    public String toString() {
        return "Bet{" +
                "teamDraw=" + teamDraw +
                ", id=" + id +
                ", teamOneWin=" + teamOneWin +
                ", teamTwoWin=" + teamTwoWin +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamOneWin() {
        return teamOneWin;
    }

    public void setTeamOneWin(int teamOneWin) {
        this.teamOneWin = teamOneWin;
    }

    public int getTeamDraw() {
        return teamDraw;
    }

    public void setTeamDraw(int teamDraw) {
        this.teamDraw = teamDraw;
    }

    public int getTeamTwoWin() {
        return teamTwoWin;
    }

    public void setTeamTwoWin(int teamTwoWin) {
        this.teamTwoWin = teamTwoWin;
    }

    public List<Users> getUsersListBet() {
        return usersListBet;
    }

    public void setUsersListBet(List<Users> usersListBet) {
        this.usersListBet = usersListBet;
    }

    public Bet(int teamOneWin, List<Users> usersListBet, int teamTwoWin, int teamDraw) {

        this.teamOneWin = teamOneWin;
        this.usersListBet = usersListBet;
        this.teamTwoWin = teamTwoWin;
        this.teamDraw = teamDraw;
    }

    public Bet() {

    }



}
