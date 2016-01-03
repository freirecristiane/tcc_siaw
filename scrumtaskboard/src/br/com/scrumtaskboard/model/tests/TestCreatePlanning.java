package br.com.scrumtaskboard.model.tests;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Meeting;
import br.com.scrumtaskboard.model.bean.MeetingType;
import br.com.scrumtaskboard.model.bean.Planning;
import br.com.scrumtaskboard.model.dao.JPAUtil;
import br.com.scrumtaskboard.model.dao.MeetingDAO;

public class TestCreatePlanning {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();

		MeetingDAO dao = new MeetingDAO(em);
		
		Meeting meeting = new Planning();
//		meeting.setAttendants(attendants);
		meeting.setComment("Meeting comments");
		meeting.setDate(Calendar.getInstance());
		meeting.setMeetingType(MeetingType.PLANNING);
//		meeting.setSprint(sprint);
		
		em.getTransaction().begin();
		dao.add(meeting);
		em.getTransaction().commit();
			
		
//	    System.out.println("Generated ID: " + meeting.getId());
	    
	    em.close();
	}

}
