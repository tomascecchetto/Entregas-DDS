package utn.frd.action;

import utn.frd.bean.Persona;
import utn.frd.db.PersistentManager;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class PersonaAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

        Persona p2 = new Persona(personas.size(), name, edad, gender);
        for (Persona p1:personas) {
        	if (p1.getName().equals(name)) {
        		addActionError("Persona ya existente");
        		return ERROR;
        	}
        }
        personas.add(p2);
        System.out.println(personas.size());
        
        return SUCCESS;
    }
    
    public String baja() {
    	ArrayList<Persona> personas = (ArrayList<Persona>) PersistentManager.getInstance();
    	for (Persona p:personas) {
    		if ((p.getName()).equals(name)) {
    			personas.remove(p);
    			System.out.println(personas.size());
    			return SUCCESS;
    		}
    	};
    	addActionError("El nombre ingresado no existe");
    	return ERROR;
    }
    
    public String modificar() {
    	ArrayList<Persona> personas = (ArrayList<Persona>) PersistentManager.getInstance();
    	for (Persona p1:personas) {
    		if ((p1.getName().equals(name))) {
    			personas.remove(p1);
    			int edad = 0;
    	        try{
    	            edad = Integer.parseInt(age);
    	        }
    	        catch(Exception e){
    	            addActionError("Ocurrió un error con la edad");
    	            return ERROR;
    	        }
    			Persona p2 = new Persona(p1.getID(), name, edad, gender);
    			personas.add(p2);
    			return SUCCESS;
    		}
    	}
    	addActionError("Persona inexistente, el nombre es incorrecto");
    	return ERROR;
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

