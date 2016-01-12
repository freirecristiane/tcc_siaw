package br.com.scrumtaskboard.control.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import br.com.scrumtaskboard.model.bean.Profile;
import br.com.scrumtaskboard.model.dao.DAO;

@ViewScoped
@ManagedBean
public class ProfileBean {
	
	private Profile profile = new Profile();
	private List<Profile> profiles;
	
	public Profile getProfile() {
		return profile;
	}
	
	public void save(){
		DAO<Profile> dao = new DAO<Profile>(Profile.class);
		
		if (profile.getId() == null) {
			dao.add(profile);
		} else {
			dao.update(profile);
		}
		
		this.profile = new Profile();
		this.profiles = dao.listAll();
	}
	
	@PostConstruct
	public void loadProfiles(){
		profiles = new DAO<Profile>(Profile.class).listAll();
	}
	
	public List<Profile> getProfiles(){
		return profiles;
	}
	
	public void delete(){
		DAO<Profile> dao = new DAO<Profile>(Profile.class);
		dao.delete(this.profile);
		
		this.profile = new Profile();
		this.profiles = dao.listAll();
	}
	
	public void setProfile(Profile profile){
		this.profile = profile;
	}
	
	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Profile Edited", ((Profile) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
        DAO<Profile> dao = new DAO<Profile>(Profile.class);
		dao.update(((Profile) event.getObject()));
		
		this.profile = new Profile();
		this.profiles = dao.listAll();
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Profile) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
