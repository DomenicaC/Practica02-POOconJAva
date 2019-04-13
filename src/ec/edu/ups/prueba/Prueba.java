/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Ballena;
import ec.edu.ups.clases.Lagarto;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Serpiente;



/**
 *
 * @author Domenica Cañizares
 */
public class Prueba {
        public static void main(String[] args) {
        //Clase perro
        Perro perro = new Perro();
        
        perro.setCodigo(1);
        perro.setNombre("Pancho");
        perro.setEdad(1);
        perro.setAudicion(1000);
        perro.setSexo("Macho");
        perro.setColor("Blanco");
        perro.setNumHueso(321);
        perro.setPelo(true);
        perro.setTempCorporal("39 ºC");
        perro.setRaza("Shitzu");
        perro.setComida("Croquetas");
        perro.setHabitat("Casa");
        
        perro.comer();
        perro.dormir();
        perro.calcularEdad();
        
        //Clase ballena
        Ballena ballena = new Ballena();
        
        ballena.setCodigo(2);
        ballena.setNombre("Willy");
        ballena.setNomCientifico("Balaenidae");
        ballena.setTamaño("14 mts");
        ballena.setSexo("Macho");
        ballena.setColor("Negro y blanco");
        ballena.setNumHueso(230);
        ballena.setPelo(false);
        ballena.setComida("Peces");
        ballena.setHabitat("Oceano");
        ballena.setVelocidad(30);
        ballena.setPeso(40.000);
        //ballena.setFechaNacimiento(2000/02/03);
        
        ballena.comer();
        ballena.dormir();
        ballena.calcularEdad();
        
        //Clase Serpiente
        Serpiente serpiente = new Serpiente();
        
        serpiente.setCodigo(3);
        serpiente.setNombre("Luci");
        serpiente.setSexo("Hembra");
        serpiente.setColor("Verde");
        serpiente.setDescripcion("Serpiente que vive en zonas calidas");
        serpiente.setAlimentacion("Ratones");
        serpiente.setDesplazamiento("arrastrandose");
        serpiente.setEspecie("Falsa Coral");
        serpiente.setExtremidades(false);
        serpiente.setNumHuevos(50);
        serpiente.setSangre("Fria");
        serpiente.setVenenosa(true);
        
        serpiente.comer();
        serpiente.dormir();
        serpiente.calcularEdad();
        
        //Clase lagarto
        Lagarto lagarto = new Lagarto();
        
        lagarto.setCodigo(1);
        lagarto.setNombre("Vera");
        lagarto.setSexo("Hembra");
        lagarto.setColor("Verde con pintas cafes");
        lagarto.setAñosVida(25);
        lagarto.setCambiaColor(false);
        lagarto.setDesplazamiento("4 patas");
        lagarto.setExtremidades(true);
        lagarto.setModoDefensa("Desprenderse de la cola");
        lagarto.setSangre("Fria");
        lagarto.setTipoPiel("Escamosa");
        lagarto.setNumHuevos(11);
        
        lagarto.comer();
        lagarto.dormir();
        lagarto.calcularEdad();
    }
}

