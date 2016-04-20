
public class Producto {
	private String nombre;
	private String marca;
	private float precio;
	private Tipo departamento;
	
	public Producto(String nom, String mar, float pre, Tipo dep){
		setNombre(nom);
		setMarca(mar);
		setPrecio(pre);
		setDepartamento(dep);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String mar) {
		this.marca = mar;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float pre) {
		this.precio = pre;
	}

	public Tipo getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Tipo dep) {
		this.departamento = dep;
	}
}
