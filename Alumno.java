public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3){
            System.out.println("Error, nombre invalido");
        }
        if (numeroMatricula.length() < 4){
            System.out.println("Error, numero invalido");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    
    /**
     * Devuelve el nombre completo del alumno
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String tamañoNombre = nombre;
        String tamañoNumeroMatricula = numeroMatricula;
        if (nombre.length() >= 3) {
            tamañoNombre = tamañoNombre.substring(0, 3);
        }
        if (numeroMatricula.length() >= 4) {
            tamañoNumeroMatricula = tamañoNumeroMatricula.substring(0, 4);
        }
        return tamañoNombre + tamañoNumeroMatricula;
    }
}
