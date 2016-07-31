package ua.lviv.lgs.service;

import ua.lviv.lgs.entity.Team;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */

public interface TeamService {

    public void addTeam(String name, Integer win, Integer draw, Integer lose,int nationId, int ligaId);

    public void editTeam(int id,String name, Integer win, Integer draw, Integer lose);

    public void deleteTeam(int id);

    public List<Team> findAllTeam();

    public List<Team> findAllTeamByNationId(int id);

    public void findByName(String name);

}
