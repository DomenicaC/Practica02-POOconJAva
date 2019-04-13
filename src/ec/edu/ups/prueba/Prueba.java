/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Ballena;
import ec.edu.ups.clases.Lagarto;
import ec.edu.ups.clases.Mamifero;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Reptil;
import ec.edu.ups.clases.Serpiente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 * @since 12-April-2019
 * @version IDE 8.0.2 Clase prueba
 */
public class Prueba {

    public static void main(String[] args) {
        //Clase perro
        Perro perro = new Perro("Shitzu", 1, "39°C", 1000, 321, true, "Croquetas", "Casa", 1, "Pancho", "Macho", "Blanco");
        System.out.println(perro);
        System.out.println("Metodos Abstractos");
        perro.comer();
        perro.dormir();
        perro.calcularEdad();

        //Clase ballena
        Ballena ballena = new Ballena(40.000, "14 mts", "Balaenidae", 30, 230, false, "Peces", "Ocenano", 2, "Willy", "Macho", "Negro y Blanco");
        System.out.println(ballena);

        //ballena.setFechaNacimiento(2000/02/03);
        ballena.comer();
        ballena.dormir();
        ballena.calcularEdad();

        //Clase Serpiente
        Serpiente serpiente = new Serpiente("Falsa Coral", "Serpiente que vive en zonas caidas", true, "Ratones", false, "Fria", 50, "Arrastrandose", 3, "Lucy", "Hembra", "Amarillo, Rojo, Negro");
        System.out.println(serpiente);

        serpiente.comer();
        serpiente.dormir();
        serpiente.calcularEdad();

        //Clase lagarto
        Lagarto lagarto = new Lagarto("Escamas", 25, "Desprenderse de la cola", false, true, "Fria", 11, "4 Patas", 4, "Vera", "Hemra", "Verde con pintas cafes");
        System.out.println(lagarto);

        lagarto.comer();
        lagarto.dormir();
        lagarto.calcularEdad();

        List<Animal> lista = new ArrayList<>();
        lista.add(ballena);
        lista.add(lagarto);
        lista.add(perro);
        lista.add(serpiente);

        System.out.println("Metodo Instance of:\n");
        for (Animal animal : lista) {
            if (animal instanceof Ballena) {
                Mamifero ba = (Mamifero) animal;
                System.out.println(ba);
            } else if (animal instanceof Perro) {
                Mamifero pe = (Mamifero) animal;
                System.out.println(pe);
            } else if (animal instanceof Lagarto) {
                Reptil la = (Reptil) animal;
                System.out.println(la);
            } else if (animal instanceof Serpiente) {
                Reptil ser = (Reptil) animal;
                System.out.println(ser);
            }
        }

        System.out.println("Clase Anonima");

        Mamifero Caballo = new Mamifero(200, true, "Heno", "Establo", 5, "Duquesa", "Hembra", "Negro") {
            @Override
            public double calcularEdad() {
                String fechaInicio = "01/06/2000";
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

                System.out.println("El Caballo " + this.getNombre() + " tiene: " + anios + " años " + meses + " meses y " + dias + " días");
                return 0;
            }

        };
        System.out.println(Caballo);
        System.out.println(Caballo.calcularEdad());

        Reptil Camaleon = new Reptil(true, "Sangre Fria", 32, "4 Patas", 6, "Extasis", "Macho", "Verde con Amarillo") {
            @Override
            public double calcularEdad() {
                String fechaInicio = "01/06/2000";
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

                System.out.println("El Camaleon " + this.getNombre() + " tiene: " + anios + " años " + meses + " meses y " + dias + " días");
                return 0;
            }
        };
        System.out.println(Camaleon);
        System.out.println(Camaleon.calcularEdad());

    }
}
