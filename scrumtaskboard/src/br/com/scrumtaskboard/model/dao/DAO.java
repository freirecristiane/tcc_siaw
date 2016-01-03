package br.com.scrumtaskboard.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public class DAO<T> {
	
	private final Class<T> classT;
	
	public DAO(Class<T> classT){
		this.classT = classT;
	}
	
	public void add(T t){
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(T t){
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(t));
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(T t){
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<T> listAll(){
		EntityManager em = new JPAUtil().getEntityManager();
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classT);
		query.select(query.from(classT));
		List<T> resultList = em.createQuery(query).getResultList();
		em.close();
		
		return resultList;
	}
	
	public T searchById(int id){
		EntityManager em = new JPAUtil().getEntityManager();
		T instance = em.find(classT, id);
		em.close();
		
		return instance;
	}
	
	
	
	

}
