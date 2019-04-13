/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;

/**
 *
 * @author Domenica Cañizares
 * @since 12-April-2019
 * @version IDE 8.0.2 
 * Clase hija 2
 */
public final class Ballena extends Mamifero implements Interface{
    
    private double peso;
    private String tamaño;
    private String nomCientifico;
    private double velocidad;

    public Ballena() {
    }

    //constructor

    public Ballena(double peso, String tamaño, String nomCientifico, double velocidad, int numHueso, boolean pelo, String comida, String habitat, int codigo, String nombre, String sexo, String color) {
        super(numHueso, pelo, comida, habitat, codigo, nombre, sexo, color);
        this.peso = peso;
        this.tamaño = tamaño;
        this.nomCientifico = nomCientifico;
        this.velocidad = velocidad;
    }
  

    //set
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setNomCientifico(String nomCientifico) {
        this.nomCientifico = nomCientifico;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    //get
    public double getPeso() {
        return peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getNomCientifico() {
        return nomCientifico;
    }

    public double getVelocidad() {
        return velocidad;
    }

    //metodos Abstractos
    @Override
    public double calcularEdad() {
        String fechaInicio = "28/12/2010";
        String fechaActual = "12/04/2019";
        String[] aFechaIng = fechaInicio.split("/");
        Integer diaInicio = Integer.parseInt(aFechaIng[0]);
        Integer mesInicio = Integer.parseInt(aFechaIng[1]);
        Integer anioInicio = Integer.parseInt(aFechaIng[2]);

        String[] aFecha = fechaActual.split("/");
        Integer diaActual = Integer.parseInt(aFecha[0]);
        Integer mesActual = Integer.parseInt(aFecha[1]);
        Integer anioActual = Integer.parseInt(aFecha[2]);

        int b = 0;
        int dias = 0;
        int mes = 0;
        int anios = 0;
        int meses = 0;
        mes = mesInicio - 1;
        if (mes == 2) {
            if ((anioActual % 4 == 0) && ((anioActual % 100 != 0) || (anioActual % 400 == 0))) {
                b = 29;
            } else {
                b = 28;
            }
        } else if (mes <= 7) {
            if (mes == 0) {
                b = 31;
            } else if (mes % 2 == 0) {
                b = 30;
            } else {
                b = 31;
            }
        } else if (mes > 7) {
            if (mes % 2 == 0) {
                b = 31;
            } else {
                b = 30;
            }
        }
        if ((anioInicio > anioActual) || (anioInicio == anioActual && mesInicio > mesActual)
                || (anioInicio == anioActual && mesInicio == mesActual && diaInicio > diaActual)) {
        } else {
            if (mesInicio <= mesActual) {
                anios = anioActual - anioInicio;
                if (diaInicio <= diaActual) {
                    meses = mesActual - mesInicio;
                    //dias = b - (diaInicio - diaActual);
                } else {
                    if (mesActual == mesInicio) {
                        anios = anios - 1;
                    }
                    meses = (mesActual - mesInicio - 1 + 12) % 12;
                    //dias = b - (diaInicio - diaActual);
                }
            } else {
                anios = anioActual - anioInicio - 1;
                if (diaInicio > diaActual) {
                    meses = mesActual - mesInicio - 1 + 12;
                    //dias = b - (diaInicio - diaActual);
                } else {
                    meses = mesActual - mesInicio + 12;
                    //dias = diaActual - diaInicio;
                }
            }
        }
        System.out.println("La ballena "+this.getNombre()+" tiene: " + anios+" años "+ meses+" meses y "+ dias+" días \n");
        return 0;
    }

    @Override
    public void comer() {
        System.out.println("La ballena "+this.getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("La ballena "+this.getNombre()+" esta durmiendo");
    }

    //toString

    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "peso=" + peso + ", tama\u00f1o=" + tamaño + ", nomCientifico=" + nomCientifico + ", velocidad=" + velocidad + '}';
    }
}
