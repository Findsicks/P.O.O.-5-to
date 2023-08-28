 package company.Herne;



public abstract class Producto {
    String desc;
    int codigo;
    double precio;
    
    public Producto(String desc, double precio){
        this.desc = desc;
        this.precio = precio;
    }
    public String toString(){
        String mostrar = this.desc + this.precio + this.codigo;
        return mostrar;
    }

    public abstract double getPrecio() ;
    
}
