package Entidades;

import java.util.ArrayList;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas.
 *
 * @author MNXC04
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> listaNotas;

    /**
     * Constructores
     */
    public Alumno() {
        this.listaNotas = new ArrayList();
    }

    public Alumno(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    /**
     * Getters Setters
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", listaNotas=" + listaNotas + '}';
    }

    public void agregarNota(Integer nota) {
        this.listaNotas.add(nota);
    }

    public void imprimirNotas() {
        int cont = 1;
        for (Integer unitarioNotas : listaNotas) {
            System.out.println(cont + "° Nota = " + unitarioNotas);
        }

    }

    public int cantidadNotas() {
        return listaNotas.size();
    }

    public int sumaNotas() {
        int suma = 0;
        for (Integer unitarioNotas : listaNotas) {
            suma += unitarioNotas;
        }
        return suma;
    }

}
