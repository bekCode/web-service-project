package com.bootcamp.controller;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JFrame;

import com.bootcamp.Ujian.model.Personnel;
import com.bootcamp.Ujian.model.Group;
import com.bootcamp.Ujian.model.Position;
import com.bootcamp.Ujian.model.User;



public class Controller {


	EntityManager em;

	private Controller() {

		em = Service.getInstance().getEntityManager().createEntityManager();

	}

	public static Controller getInstance() {

		return ControllerHolder.INSTANCE;

	}

	public static class ControllerHolder {
		private static final Controller INSTANCE = new Controller();
	}

	public void saveDataGroup() {

		Group group = new Group();
		group.setId(1);
		group.setCode("RGU2 - PJK2 - KLN2 - KCB1 - JN2");
		group.setProjectId(1);
		group.setMinimumPersonnel(5);
		group.setName("Regu 2 (PJK2)");
		group.setDescription("REGU 2 AYE");
		group.setAttendanceQrCode("regudua");
		group.setStatus(1);

		Position position = new Position();
		position.setId(1);
		position.setCode("PROGRAMMER");
		position.setName("programmer");
		position.setDescription("programmer dong");
		position.setStatus(1);
		position.setCreatedByUserId(1);
		position.setCreatedAt("2019-08-26 14:39:20");
	//	position.setUpdatedByUserId(null);
//		position.setUpdatedAt(null);
	//	position.setDeletedByUser(null);
		

		Personnel personnel = new Personnel();
		personnel.setId(1);
		personnel.setCode("PROGRAMMER");
		personnel.setUserId(1);
		personnel.setPhotoUrl(
				"https://img.lovepik.com/original_origin_pic/18/08/23/2fcb3e66ed8479ad9680fdeacb23804e.png_wh860.png");
		personnel.setFirstName("tasya");
		personnel.setMiddleName("kanila");
		personnel.setLastName("toro");
		personnel.setCompleteName("tasya kanila putri");
		personnel.setGender("wanita");
		personnel.setHeight("175cm");
		personnel.setWeight("65kg");
		personnel.setDob("12 juni 1995");
		personnel.setPob("tanggerang");
		personnel.setHp("0865987645764");
		personnel.setAddress("Jl. belimbing");
		personnel.setDeviceId("102901");
		//personnel.setPosition(position);
		//personnel.setGroup(group);

		User user = new User();
		user.setId(1);
		user.setUsername("aldi");
		user.setEmail("tasyakanila1234@gmail.com");
		

		em.getTransaction().begin();
		em.merge(group);
		
		em.merge(position);
		em.merge(user);
		em.merge(personnel);
		em.getTransaction().commit();

	}

	public List<Group> getAllGroup() {

		// "select a from Anggota a where a.username ='"+txtUsername+"' and a.password =
		// '+
		TypedQuery<Group> query = em.createQuery("select g from Group g", Group.class);

		return query.getResultList();

	}

	public List<User> getAllUser() {

		// "select a from Anggota a where a.username ='"+txtUsername+"' and a.password =
		// '+
		TypedQuery<User> query = em.createQuery("select u from User u", User.class);

		return query.getResultList();

	}

}