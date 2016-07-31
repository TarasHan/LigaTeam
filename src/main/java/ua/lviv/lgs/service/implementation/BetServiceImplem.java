package ua.lviv.lgs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.BetDao;
import ua.lviv.lgs.entity.Bet;
import ua.lviv.lgs.service.BetService;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Service
public class BetServiceImplem implements BetService{
    @Autowired
    private BetDao betDao;
    public void addBet(Integer teamOneWin,Integer teamDraw,Integer teamTwoWin){
        Bet bet = new Bet(teamOneWin,teamDraw,teamTwoWin);
        betDao.addBet(bet);
    }

    public void deleteBet(int id){
        Bet bet = betDao.findById(id);
    }

    public List<Bet> findAllBet(){
        return betDao.findAllBet();
    }
    public Bet findById(int id){
        return betDao.findById(id);
    }
}
