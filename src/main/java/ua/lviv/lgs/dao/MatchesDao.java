package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Matches;

/**
 * Created by Kerol on 22.05.2016.
 */
public interface MatchesDao {
    public void addMatches(Matches matches);

    public void deleteMatches(Matches matches);

    public Matches findMatchesById(int id);
}
