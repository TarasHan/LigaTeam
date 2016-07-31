package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Score;

/**
 * Created by Kerol on 22.05.2016.
 */
public interface ScoreDao {
    public void addScore (Score score);

    public void  editScore (Score score);

    public void  deleteScore (Score score);

    public  Score findScoreById (int id);
}
