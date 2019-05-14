package sv.edu.uesocc2019.listviewpersonalizado;

public class Alumno {
    private String Apellido;
    private String Carrera;
    private int AnnioIngreso;
    private String CicloActual;
    private String Nombre;


    public Alumno(String nombre,String apellido, String carrera, int annioIngreso,
                  String cicloActual) {

        Apellido = apellido;
        Carrera = carrera;
        AnnioIngreso = annioIngreso;
        CicloActual = cicloActual;
        Nombre = nombre;
    }




    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getCarrera() {
        return Carrera;
    }
    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
    public int getAnnioIngreso() {
        return AnnioIngreso;
    }
    public void setAnnioIngreso(int annioIngreso) {
        AnnioIngreso = annioIngreso;
    }
    public String getCicloActual() {
        return CicloActual;
    }
    public void setCicloActual(String cicloActual) {
        CicloActual = cicloActual;
    }
}
