package ua.lviv.lgs.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.entity.Bet;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
public interface BetService {
    public Bet findById(int id);

    public void addBet(Integer teamOneWin,Integer teamDraw,Integer teamTwoWin);

    public void deleteBet(int id);

    public List<Bet> findAllBet();
}
