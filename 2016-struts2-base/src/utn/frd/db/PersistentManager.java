package utn.frd.db;

import utn.frd.bean.Persona;
import java.util.ArrayList;
import java.util.List;

public class PersistentManager {
	public static long contador;
	private static List<Persona> data = new ArrayList<Persona>();
	public static List<Persona> getInstance(){
        return data;
    }
	public static long getContador(){
		return contador;
	}
	public static void setContador(){
		contador=contador+1;
	}
}
