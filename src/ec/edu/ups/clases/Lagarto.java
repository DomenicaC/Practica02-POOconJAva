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
 * Clase hija 4
 */
public class Lagarto extends Reptil implements Interface{

    private String tipoPiel;
    private int añosVida;
    private String modoDefensa;
    private boolean cambiaColor;

    public Lagarto() {
    }

    //constructor
    public Lagarto(String tipoPiel, int añosVida, String modoDefensa, boolean cambiaColor, boolean extremidades, String sangre, int numHuevos, String desplazamiento, int codigo, String nombre, String sexo, String color) {
        super(extremidades, sangre, numHuevos, desplazamiento, codigo, nombre, sexo, color);
        this.tipoPiel = tipoPiel;
        this.añosVida = añosVida;
        this.modoDefensa = modoDefensa;
        this.cambiaColor = cambiaColor;
    }

    //set
    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public void setAñosVida(int añosVida) {
        this.añosVida = añosVida;
    }

    public void setModoDefensa(String modoDefensa) {
        this.modoDefensa = modoDefensa;
    }

    public void setCambiaColor(boolean cambiaColor) {
        this.cambiaColor = cambiaColor;
    }

    //get
    public String getTipoPiel() {
        return tipoPiel;
    }

    public int getAñosVida() {
        return añosVida;
    }

    public String getModoDefensa() {
        return modoDefensa;
    }

    public boolean isCambiaColor() {
        return cambiaColor;
    }

    //metodos abstractos
    @Override
    public double calcularEdad() {
        String fechaInicio = "25/04/2014";
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
        System.out.println("El lagarto tiene: " + anios+" años "+ meses+" meses y "+ dias+" días \n");
        return 0;
    }

    @Override
    public void comer() {
        System.out.println("El lagarto "+this.getNombre()+" esta comiendo"); 
    }

    @Override
    public void dormir() {
       System.out.println("El lagarto "+this.getNombre()+" esta durmiendo ");
    }

    //toString
    @Override
    public String toString() {
        return "Lagarto{" + "tipoPiel=" + tipoPiel + ", a\u00f1osVida=" + añosVida + ", modoDefensa=" + modoDefensa + ", cambiaColor=" + cambiaColor + '}';
    }
}
