package ejercicio001;

public class Alumno {
    private String codigo;
    private String nombre;
    private String apellido;
    private double práctica1;
    private double práctica2;
    private double parcial;
    private double efinal;

    public Alumno(String codigo, String nombre, String apellido, double práctica1, double práctica2, double parcial, double efinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.práctica1 = práctica1;
        this.práctica2 = práctica2;
        this.parcial = parcial;
        this.efinal = efinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPráctica1() {
        return práctica1;
    }

    public void setPráctica1(double práctica1) {
        this.práctica1 = práctica1;
    }

    public double getPráctica2() {
        return práctica2;
    }

    public void setPráctica2(double práctica2) {
        this.práctica2 = práctica2;
    }

    public double getParcial() {
        return parcial;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }

    public double getEfinal() {
        return efinal;
    }

    public void setEfinal(double efinal) {
        this.efinal = efinal;
    }

    public double calcPromedioFinal() {
        double promedioPracticas = (práctica1 + práctica2) / 2;
        return promedioPracticas * 0.2 + parcial * 0.3 + efinal * 0.5;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", práctica1=" + práctica1 +
                ", práctica2=" + práctica2 +
                ", parcial=" + parcial +
                ", efinal=" + efinal +
                ", promedioFinal=" + calcPromedioFinal() +
                '}';
    }
}
