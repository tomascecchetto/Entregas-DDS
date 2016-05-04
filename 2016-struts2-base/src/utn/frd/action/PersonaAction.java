package utn.frd.action;

import utn.frd.bean.Persona;
import utn.frd.db.PersistentManager;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class PersonaAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	public long id;
	private String name;
    private String age;
    private String gender;
    private ArrayList<Persona> personas;
    
    
    public String execute(){
        personas = (ArrayList<Persona>) PersistentManager.getInstance();
        return SUCCESS;
    }	

    public String save(){
        ArrayList<Persona> personas = (ArrayList<Persona>) PersistentManager.getInstance();
        int edad = 0;

        try{
            edad = Integer.parseInt(age);
        }
        catch(Exception e){
            addActionError("Ocurrió un error con la edad");
            return ERROR;
        }
        
        Persona p2 = new Persona(PersistentManager.getContador(), name, edad, gender);
        PersistentManager.setContador();
        personas.add(p2);
        return SUCCESS;
    }
    
    public String baja() {
    	ArrayList<Persona> personas = (ArrayList<Persona>) PersistentManager.getInstance();
    	for (Persona p:personas) {
    		if (p.getID()==id) {
    			personas.remove(p);
    			return SUCCESS;
    		}
    	};
    	addActionError("El ID no existe");
    	return ERROR;
    }
    
    public String modificar() {
    	ArrayList<Persona> personas = (ArrayList<Persona>) PersistentManager.getInstance();
    	for (Persona p1:personas) {
    		if ((p1.getID()==id)) {
    			personas.remove(p1);
    			int edad = 0;
    	        try{
    	            edad = Integer.parseInt(age);
    	        }
    	        catch(Exception e){
    	            addActionError("Ocurrió un error con la edad");
    	            return ERROR;
    	        }
    			Persona p2 = new Persona(id, name, edad, gender);
    			personas.add(p2);
    			return SUCCESS;
    		}
    	}
    	addActionError("Persona inexistente, el ID es incorrecto");
    	return ERROR;
    }
    
    public long getID() {
		return id;
	}
	public void setID(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ArrayList<Persona> getPersonas() {
		personas = (ArrayList<Persona>) PersistentManager.getInstance();
		return personas;
	}
	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
}

