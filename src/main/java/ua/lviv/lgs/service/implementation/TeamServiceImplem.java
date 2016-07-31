package ua.lviv.lgs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.LigaDao;
import ua.lviv.lgs.dao.NationDao;
import ua.lviv.lgs.dao.TeamDao;
import ua.lviv.lgs.entity.Liga;
import ua.lviv.lgs.entity.Nation;
import ua.lviv.lgs.entity.Team;
import ua.lviv.lgs.service.TeamService;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Service
public class TeamServiceImplem implements TeamService{

    @Autowired
    private TeamDao teamDao;
    @Autowired
    private NationDao nationDao;

    @Autowired
    private LigaDao ligaDao;

    @Transactional
    public void addTeam(String name, Integer win, Integer draw, Integer lose,int nationId, int ligaId){
        Team team= new Team(name,win,draw,lose);
        Nation nation=nationDao.findNationById(nationId);
        Liga liga= ligaDao.findLigaById(ligaId);
        team.setLiga(liga);
        team.setNation(nation);
        teamDao.addTeam(team);
    }
@Transactional
    public void editTeam(int id,String name, Integer win, Integer draw, Integer lose){
    Team team = teamDao.findById(id);
    if (name!=null){
        team.setName(name);
    }
    if(win!=null){
        team.setWin(win);
    }
    if(draw!=null){
      team.setDraw(draw);
    }
    if(lose!=null){
      team.setLose(lose);
    }
    teamDao.editTeam(team);
}
@Transactional
    public void deleteTeam(int id){
Team team= teamDao.findById(id);
    teamDao.deleteTeam(team);
}
@Transactional
    public List<Team> findAllTeam(){
return teamDao.findAllTeam();
}
@Transactional
    public List<Team> findAllTeamByNationId(int id){
return  teamDao.findAllTeamByNationId(id);
}
@Transactional
    public void findByName(String name){

    Team team = teamDao.findByName(name);
}

}
