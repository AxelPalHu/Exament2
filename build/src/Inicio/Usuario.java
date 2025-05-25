
package Inicio;

public class Usuario {
private int DNI;
private double Contraseña;

    public Usuario(int DNI, double Contraseña) {
        this.DNI = DNI;
        this.Contraseña = Contraseña;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getContraseña() {
        return Contraseña;
    }

    public void setContraseña(double Contraseña) {
        this.Contraseña = Contraseña;
    }

   
}
