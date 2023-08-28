package company.Herne;

public class Remera extends Producto{
    char talle;
    public Remera(String desc, double precio, char talle){
        super(desc, precio);
        this.talle = talle;
    }
     public String toString(){
        String mostrar = this.desc + this.talle + this.precio + this.codigo;
        return mostrar;
     }

    public double getPrecio() {
        return precio;
    }
     
}
