package company.Herne;

public class Pantalon extends Producto{
    int talle;
    
    public Pantalon(String desc, double precio, int talle){
        super(desc, precio);
        this.talle = talle;
    }

    public double getPrecio() {
        return precio;
    }
    public String toString(){
        String mostrar = this.desc + this.talle + this.precio + this.codigo;
        return mostrar;
    }
}
