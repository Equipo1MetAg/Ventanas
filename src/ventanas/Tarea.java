/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Edson Antonio
 */
public class Tarea {
    private String nombreTarea;
    private String descripcionTarea;

    public Tarea() {
        this.nombreTarea = null;
        this.descripcionTarea = null;
    }

    public Tarea(String nombreTarea, String descripcionTarea) {
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }
    
    
    
}
