package stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

public class torreControlAlmacen {
     
     public static void main(String[] args) {
    	 
    	 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	 
    	 gestionAlmacen gestorTorre = (gestionAlmacen) context.getBean("control");
    	 
    	 System.out.println(gestorTorre.ListarProductos1().get(0).getNombre());
    	 //System.out.println(gestor.ListarProductos2().get(0).getNombre());
    	 
    	 //ApplicationContext context2 = new ClassPathXmlApplicationContext("Control");
    	 
    	 
    	 
     }
}
