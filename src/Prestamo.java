public class Prestamo {
    private Socio socio;
    private Libro libro;
    private int diasPrestamo;

    public Prestamo(Socio socio, Libro libro, int diasPrestamo) {
        this.socio = socio;
        this.libro = libro;
        this.diasPrestamo = diasPrestamo;
    }
}
