package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Calendar;

import java.util.Date;
import java.util.List;

/**
 * Created by Kerol on 22.05.2016.
 */
public interface CalendarDao {
    public void addCalendar(Calendar calendar);

    public void editCalendar(Calendar calendar);

    public void deleteCalendar(Calendar calendar);

    public List<Calendar> findCalendarByDate(Date dateMatch);

    public List<Calendar> findAllCalendar();

    public  Calendar findCalendarById (int id);
}
