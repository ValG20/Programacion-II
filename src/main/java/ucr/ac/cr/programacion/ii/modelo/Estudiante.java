/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.programacion.ii.modelo;

/**
 *
 * @author Sharon Valeria
 */
public class Estudiante {
    private String carnet;
    private String nombre;
    
    public Estudiante(){
        setCarnet("");
        setNombre("");
    }
    
    public Estudiante(String nombre, String carnet){
        setCarnet(carnet);
        setNombre(nombre);
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
