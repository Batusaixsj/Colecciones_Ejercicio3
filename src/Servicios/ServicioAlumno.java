package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno {

    private ArrayList<Alumno> listaAlumnos;
    private Scanner leer;
    // private Alumno nuevoAlumno1;

    /**
     * Constructores
     */
    public ServicioAlumno() {
        this.listaAlumnos = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public ServicioAlumno(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * Getters & Setters
     *
     * @return
     */
    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "ServicioAlumno{" + "listaAlumnos=" + listaAlumnos + ", input=" + leer + '}';
    }

    /**
     * Funciones & Metodos
     *
     * @param nuevoAlumno
     */
    private void agregarAlumno(Alumno nuevoAlumno) {
        listaAlumnos.add(nuevoAlumno);
    }

    public void crearAlumno() {
        String opcion;
        int contador = 1;
        do {
            Alumno nuevoAlumno1 = new Alumno();

            System.out.println("Datos " + contador + "° alumno");

            System.out.print("Ingrese nombre: ");
            nuevoAlumno1.setNombre(leer.next());

            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese " + (i + 1) + "° nota: ");
                nuevoAlumno1.agregarNota(leer.nextInt());
            }
            agregarAlumno(nuevoAlumno1);
            System.out.print("Desea cargar un " + (contador + 1) + "° alumno? (S/N): ");
            opcion = leer.next();
            contador++;
            System.out.println("");
            System.out.println("---------------------------");

        } while ("S".equalsIgnoreCase(opcion));

    }

    public void imprimirTodo() {
        for (Alumno unitarioAlumno : listaAlumnos) {
            System.out.println(unitarioAlumno.getNombre());
            unitarioAlumno.imprimirNotas();
        }

    }

    /**
     * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota final y se lo busca en la lista de Alumnos. Si está en
     * la lista, se llama al método. Dentro del método se usará la lista notas
     * para calcular el promedio final de alumno. Siendo este promedio final,
     * devuelto por el método y mostrado en el main.
     */
    public void notaFinal() {

        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String buscaAlumno = leer.next();
        for (Alumno unitarioAlumno : listaAlumnos) {
            if(unitarioAlumno.getNombre().equalsIgnoreCase(buscaAlumno)){
                System.out.println("Nota final: "+(float)(unitarioAlumno.sumaNotas()/unitarioAlumno.cantidadNotas()));
            
            }
        }

    }
}
