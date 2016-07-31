package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Team;

import java.util.List;

/**
 * Created by Kerol on 22.05.2016.
 */
public interface TeamDao {
    public void addTeam(Team team);

    public void editTeam(Team team);

    public void deleteTeam(Team team);

    public List<Team> findAllTeam();

    public List<Team> findAllTeamByNationId(int id);

    public Team findByName(String name);

    public Team findById(int id);
}
