package company.Herne;

import java.time.LocalDate;

import java.util.ArrayList;

public class Venta {
    ArrayList<Producto> listaProd;
    Cliente cliente;
    static int cantVentas;
    int nroFact;
    LocalDate fecha;
    
    public Venta(LocalDate fecha, Cliente c){
        this.fecha = fecha;    
        this.cliente=c;
        this.listaProd = new ArrayList();
    }
    public void cargarProducto(Producto p){
        listaProd.add(p);
    }
   public double calcularTotalVenta(){
        double cont = 0;
        for (Producto p: this.listaProd) {
            cont += p.getPrecio();
        }
        return cont;
    }
   public void imprimirFactura(){
       String factura = "Factura N°: 1091 - " + this.fecha + "..................$" + p.getPrecio();
   }
}
