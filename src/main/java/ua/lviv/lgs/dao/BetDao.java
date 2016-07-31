package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Bet;

import java.util.List;

/**
 * Created by Kerol on 25.05.2016.
 */
public interface BetDao {
    public void addBet(Bet bet);

    public void deleteBet(Bet bet);

    public List<Bet> findAllBet();

    public  Bet findById(int id);

  //  public List<Bet> findAllBetByUserId(int id);
}
