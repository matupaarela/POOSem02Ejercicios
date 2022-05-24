package ejercicio001;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Alumno> alumnos;

    public Curso() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void getMayorNota() {
        String nombre = null;
        double mayor = 0;
        for(Alumno alumno : alumnos) {
            if (alumno.calcPromedioFinal() > mayor) {
                nombre = alumno.getNombre();
                mayor = alumno.calcPromedioFinal();
            }
        }
        System.out.println("nombre: " + nombre + " nota: " + mayor);
    }

    public void listarAlumnos() {
        for(Alumno alumnno : alumnos) {
            System.out.println(alumnno);
        }
    }
}
