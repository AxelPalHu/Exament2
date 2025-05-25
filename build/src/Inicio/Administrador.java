
package Inicio;

public class  Administrador extends Usuario {
    private String Apellido;
    private int tipoUsuario;
    private int Nombre;

    public Administrador(String Apellido, int tipoUsuario, int Nombre, int DNI, double Contraseña) {
        super(DNI, Contraseña);
        this.Apellido = Apellido;
        this.tipoUsuario = tipoUsuario;
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int Nombre) {
        this.Nombre = Nombre;
    }
    
}
