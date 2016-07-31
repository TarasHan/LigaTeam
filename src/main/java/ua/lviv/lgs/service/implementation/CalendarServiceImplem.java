package ua.lviv.lgs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.CalendarDao;
import ua.lviv.lgs.entity.Calendar;
import ua.lviv.lgs.service.CalendarService;

import java.util.Date;
import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Service
public class CalendarServiceImplem implements CalendarService {
    @Autowired
    private CalendarDao calendarDao;

    public void addCalendar(String teamOne, String teamTwo, Date dateMatch) {
        Calendar calendar = new Calendar(teamOne, teamTwo, dateMatch);
        calendarDao.addCalendar(calendar);
    }

    public void editCalendar(int id, String teamOne, String teamTwo, Date dateMatch) {
        Calendar calendar = calendarDao.findCalendarById(id);
        if (teamOne != null) {
            calendar.setTeamOne(teamOne);

        }
        if (teamTwo != null) {
            calendar.setTeamTwo(teamTwo);
        }
        if (dateMatch != null) {
            calendar.setDateMatch(dateMatch);
        }
    }

    public void deleteCalendar(int id) {
        Calendar calendar = calendarDao.findCalendarById(id);
        calendarDao.deleteCalendar(calendar);
    }

    public List<Calendar> findCalendarByDate(Date dateMatch) {
        return calendarDao.findCalendarByDate(dateMatch);
    }

    public List<Calendar> findAllCalendar() {
        return calendarDao.findAllCalendar();
    }

    public Calendar findCalendarById(int id) {
        return calendarDao.findCalendarById(id);
    }
}
