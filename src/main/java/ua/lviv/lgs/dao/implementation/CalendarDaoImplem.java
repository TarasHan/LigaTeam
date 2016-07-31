package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.CalendarDao;
import ua.lviv.lgs.entity.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Repository
public class CalendarDaoImplem implements CalendarDao {
    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void addCalendar(Calendar calendar) {
        entityManager.persist(calendar);
    }

    @Transactional
    public void editCalendar(Calendar calendar) {
        entityManager.merge(calendar);
    }

    @Transactional
    public void deleteCalendar(Calendar calendar) {
        entityManager.remove(calendar);
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Calendar> findCalendarByDate(Date dateMatch) {
        return entityManager.createNamedQuery("Calendar.findCalendarByDate").setParameter("dateMatch", dateMatch).getResultList();
    }

    @Transactional
    public List<Calendar> findAllCalendar() {
        return entityManager.createQuery("from Calendar ").getResultList();
    }
    @Transactional
    public  Calendar findCalendarById (int id){
        return  entityManager.find(Calendar.class,id);
    }
}
