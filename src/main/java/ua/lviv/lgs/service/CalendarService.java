package ua.lviv.lgs.service;

import org.springframework.stereotype.Service;
import ua.lviv.lgs.entity.Calendar;

import java.util.Date;
import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */

public interface CalendarService  {

    public void addCalendar(String teamOne,String teamTwo,Date dateMatch);

    public void editCalendar(int id ,String teamOne,String teamTwo,Date dateMatch);

    public void deleteCalendar(int id);

    public List<Calendar> findCalendarByDate(Date dateMatch);

    public List<Calendar> findAllCalendar();

    public  Calendar findCalendarById (int id);
}
