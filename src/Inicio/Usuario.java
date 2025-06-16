
package Inicio;

public class Usuario {
    private String dni;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String tipoUsuario;

    public Usuario(String dni, String contraseña, String nombre, String apellido, String tipoUsuario) {
        this.dni = dni;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoUsuario = tipoUsuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
