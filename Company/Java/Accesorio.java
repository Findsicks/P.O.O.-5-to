package company.Herne;

public class Accesorio extends Producto{
    double peso;
    String metal;
    public Accesorio(String desc, double precio, double peso, String metal){
        super(desc, precio);
        this.peso = peso;
        this.metal = metal;
    }

    public double getPrecio() {
        return precio;
    }
     public String toString(){
        String mostrar = this.desc + this.metal + this.precio + this.codigo + this.peso;
        return mostrar;
}
}
