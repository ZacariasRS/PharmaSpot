package engine;

import java.util.ArrayList;
import com.pharma.rest.model.Usuario;


public class GestorSesiones {
	private ArrayList<Usuario> users;
	
	public GestorSesiones(){
		users=new ArrayList<Usuario>();
	}
	
	public void addUser(String nom){
		users.add(new Usuario(nom));
	}
	
	public void removeUser(String nom){
		for(int i=0;i<users.size();i++){
			if(users.get(i).getNombre()==nom){
				users.remove(i);
				break;
			}
		}
	}
	
}
