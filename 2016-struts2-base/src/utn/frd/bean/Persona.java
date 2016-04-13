package utn.frd.bean;

public class Persona {
	private long id;
    private String name;
    private int age;
    private String gender;
    
    public Persona(long tamaño,String nombre,int edad,String genero) {
    	setID(tamaño);
    	setName(nombre);
    	setAge(edad);
    	setGender(genero);
    }
    private void setID(long t) {
    	id=t;
    }
    public long getID() {
    	return id;
    }
    private void setName(String n) {
    	name=n;
    }    
    public String getName(){
    	return name;
    }
    private void setAge(int e) {
    	age=e;
    }
    public int getAge(){
    	return age;
    }
    private void setGender(String g) {
    	gender=g;
    }
    public String getGender(){
    	return gender;
    }
}
