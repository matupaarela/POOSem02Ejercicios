package ejercicio001;

public class Run {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.agregarAlumno(new Alumno("u20201781", "Juan", "Peréz", 16, 15.5, 17, 13));
        curso.agregarAlumno(new Alumno("u20201121", "Pedro", "Ramirez", 12, 15.5, 13, 12));
        curso.agregarAlumno(new Alumno("u20211341", "Jose", "Gonzales", 15, 16, 16, 13));
        curso.agregarAlumno(new Alumno("u20243551", "María", "Del Carmen", 19, 17, 20, 20));
        curso.agregarAlumno(new Alumno("u20355652", "Monica", "Galvez", 13, 16, 16, 16));

        curso.listarAlumnos();

        curso.getMayorNota();
    }
}
