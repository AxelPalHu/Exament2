/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;

/**
 *
 * @author Axel
 */
import java.util.ArrayList;
public class MantenimientoLogin {
     private ArrayList<Usuario> listaUsuarios;

    public MantenimientoLogin(ArrayList<Usuario> usuarios) {
        this.listaUsuarios = usuarios;
    }

    public Usuario validarLogin(String dni, String contraseña) {
        for (Usuario u : listaUsuarios) {
            if (u.getDni().equals(dni) && u.getContraseña().equals(contraseña)) {
                return u;
            }
        }
        return null;
    }
    
}