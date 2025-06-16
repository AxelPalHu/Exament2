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
public class MantenimientoRegistro {
    private ArrayList<Usuario> listaUsuarios;

    public MantenimientoRegistro() {
        listaUsuarios = new ArrayList<>();
    }

    public boolean agregarUsuario(Usuario usuario) {
        for (Usuario u : listaUsuarios) {
            if (u.getDni().equals(usuario.getDni())) {
                return false; 
            }
        }
        listaUsuarios.add(usuario);
        return true;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
}


