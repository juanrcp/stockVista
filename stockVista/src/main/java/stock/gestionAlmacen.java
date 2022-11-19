package stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

//@Service("gestionA")
//Ponemos etiqueta del controlador y le damos un nombre para luego llamarlo en el bean
@Controller("control")
public class gestionAlmacen {
	
	//Aqui se realiza la inyeccion de dpendencias 
	@Autowired
	repoProducto1 repo1;
	@Autowired
	repoProducto2 repo2;
	
	public void insertarProducto1(Producto1 producto1) {
		repo1.insertar(producto1);
	}
	
	public void insertarProducto2(Producto2 producto2) {
		repo2.insertar(producto2);
	}
	
	public List<Producto1> ListarProductos1() {
		return repo1.listarTodos();
	}
	
	public List<Producto2> ListarProductos2() {
		return repo2.listarTodos();
	}
	
	
	//Creamos la inyeccion de instancia 
	@Autowired 
	private gestionAlmacen gestorTorre;
			     
	//Establecemos ruta junto con el metodo que se ejecutara al axceder a ella.
	@RequestMapping("/listaproductos1")
	public String listaProductos1(Model modelo) {
			    	 
	modelo.addAttribute("listaproductos1",gestorTorre.ListarProductos1());
		return "listaproductos1"; 
			    	 
	}

}
