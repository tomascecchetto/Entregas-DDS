package utn.frd.bean;

public class Persona {
	private long id;
    private String name;
    private int age;
    private String gender;
    
    public Persona(int tamaño,String nombre,int edad,String genero) {
    	setID(tamaño);
    	setName(nombre);
    	setAge(edad);
    	setGender(genero);
    }
    private void setID(int t) {
    	id=t;
    }
    private void setName(String n) {
    	name=n;
    }    
    private void setAge(int e) {
    	age=e;
    }
    private void setGender(String g) {
    	gender=g;
    }
}
