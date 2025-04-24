public class Vehiculo {
    Float frenar;
    String nombre;

    public Vehiculo(String nombre, Float frenar) {
        this.frenar = frenar;
        this.nombre = nombre;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Frenar: " + frenar);
    }
}
