
public class Usuario {
	private String nombre;
	private Boolean sessionStatus;
	private Cesta carro;
	
	public Usuario(String nom){
		setNombre(nom);
		carro = new Cesta();
	}
	
	public void addToCesta(Producto p){
		carro.addItem(p);
	}
	
	public void removeFromCesta(Producto p){
		carro.removeItem(p);
	}
	
	public void vaciarCarro(){
		carro.clearCart();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}
}
