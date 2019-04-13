/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * @author Domenica Cañizares
 * @since 12-April-2019
 * @version IDE 8.0.2 
 * Clase Abuelo
 */
public class Animal {

    private int codigo;
    private String nombre;
    private String sexo;
    private String color;

    //constructor
    public Animal(int codigo, String nombre, String sexo, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
    }

    public Animal() {
    }

    //set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //get
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", nombre=" + nombre + ", sexo=" + sexo + ", color=" + color + '}';
    }

}
