package company.Herne;

public class Cliente {
    int dni;
    String nombre;
    String apellido;
    int codigo;
    public Cliente(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCodigo() {
        return codigo;
    }
    public String mostrarCliente(){
        String mostrar = this.dni + this.nombre + this.apellido + this.codigo;
        return mostrar;
    }
}
