package ua.lviv.lgs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.MatchesDao;
import ua.lviv.lgs.entity.Matches;
import ua.lviv.lgs.service.MatchesService;

/**
 * Created by Kerol on 27.05.2016.
 */
@Service
public class MatchesServiceImplem implements MatchesService {
    @Autowired
    private MatchesDao matchesDao;

    @Transactional
    public void addMatches(String teamOne, String teamTwo) {
        Matches matches = new Matches(teamOne, teamTwo);
    }

    @Transactional
    public void deleteMatches(int id) {
        Matches matches = matchesDao.findMatchesById(id);
        matchesDao.deleteMatches(matches);
    }

    @Transactional
    public Matches findMatchesById(int id) {
        return matchesDao.findMatchesById(id);
    }
}
