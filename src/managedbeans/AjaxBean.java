package managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;



@ManagedBean
@ViewScoped
public class AjaxBean implements Serializable{

	private static Map<String,List<String>> m=new HashMap<String,List<String>>();
	private List<String> villes=new ArrayList<String>();
	private List<String> countries=new ArrayList<String>(){{add("France");add("Morocco");}};
	private String pays;
	private String ville;
	
	static{
		
		m.put("Morocco",new ArrayList<String>(){{add("Rabat");add("Casablanca");}});
		m.put("France",new ArrayList<String>(){{add("Paris");add("Lyon");}});
	}
	
	public List<String> getCountries() {
		return countries;
	}
	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


	private int size;

	public List<String> getVilles() {
		return villes;
	}
	public void setVilles(List<String> villes) {
		this.villes = villes;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	public void update(AjaxBehaviorEvent evt)
	{
		this.villes=m.get(pays);
		
	}
	
}
