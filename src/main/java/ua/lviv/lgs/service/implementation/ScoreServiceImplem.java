package ua.lviv.lgs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.MatchesDao;
import ua.lviv.lgs.dao.ScoreDao;
import ua.lviv.lgs.entity.Matches;
import ua.lviv.lgs.entity.Score;
import ua.lviv.lgs.service.ScoreService;

/**
 * Created by Kerol on 27.05.2016.
 */
@Service
public class ScoreServiceImplem implements ScoreService{
    @Autowired
    private ScoreDao scoreDao;
    @Autowired
    private MatchesDao matchesDao;
@Transactional
    public void addScore (int scoreTeamOne, int scoreTeamTwo ){
    Score score= new Score(scoreTeamOne,scoreTeamTwo);
    scoreDao.addScore(score);
}
@Transactional
    public void  editScore (int id,Integer scoreTeamOne, Integer scoreTeamTwo){
    Score score = scoreDao.findScoreById(id);
    if(scoreTeamOne!=null){
        score.setScoreTeamOne(scoreTeamOne);
    }
    if(scoreTeamTwo!=null){
        score.setScoreTeamTwo(scoreTeamTwo);
    }
}
@Transactional
    public void  deleteScore (int id){
    Score score= scoreDao.findScoreById(id);
    scoreDao.deleteScore(score);
}
}
