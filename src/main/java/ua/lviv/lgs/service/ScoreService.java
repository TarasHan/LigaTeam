package ua.lviv.lgs.service;

import ua.lviv.lgs.entity.Score;

/**
 * Created by Kerol on 27.05.2016.
 */
public interface ScoreService {
    public void addScore (int scoreTeamOne, int scoreTeamTwo);

    public void  editScore (int id,Integer scoreTeamOne, Integer scoreTeamTwo);

    public void  deleteScore (int id);

}
