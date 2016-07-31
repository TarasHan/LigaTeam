package ua.lviv.lgs.service;

import ua.lviv.lgs.entity.Matches;

/**
 * Created by Kerol on 27.05.2016.
 */
public interface MatchesService {
    public void addMatches( String teamOne, String teamTwo);

    public void deleteMatches( int id);

    public Matches findMatchesById(int id);
}
