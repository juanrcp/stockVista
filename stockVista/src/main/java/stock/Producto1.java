package stock;

public class Producto1 {
	
	//ATRIBUTOS
	private String nombre;
	private int precio;
	
	//PROPIEDADES
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//CONSTRUCTOR
	public Producto1(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto1() {};

}