package company.Herne;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class ejecutable {
    public static void main(String[] args){
        Scanner t = new Scanner (System.in);
        int cant = 0;
        Venta v=new Venta(LocalDate.now(), cargarCliente());
        crearProductos(v);
        v.imprimirFactura();
    }
    public static Cliente cargarCliente(){
        Scanner t = new Scanner(System.in);
        String nombre;
        String apellido;
        int dni;
        System.out.println("Ingrese un nombre: ");
        nombre = t.next();
        System.out.println("Ingrese un apellido: ");
        apellido = t.next();
        System.out.println("Ingrese un DNI: ");
        dni = t.nextInt();
        Cliente c = new Cliente(nombre, dni);
        return c;
    }
    public static void crearProductos(Venta v){
        Scanner t = new Scanner(System.in);
        String desc = "";
        
        int rta = 0;
        double precio = 0;
         Producto p =null;
        
            System.out.println("Ingrese si va a llevar 1- remera, 2-pantalón o 3-accesorio: ");
            rta=t.nextInt();
              System.out.println("Ingrese una descripción: ");
              desc = t.next();
              System.out.println("Ingrese un talle: ");
              String talle=t.next();
              System.out.println("Ingrese el precio: ");
              precio=t.nextDouble();
              p = new Remera(desc, precio);
              v.cargarProducto(p);
        
    }
    
}

