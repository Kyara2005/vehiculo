public class Vehiculo {

    //Atributos
    Float frenar;
    String nombre;


    //Constructor
    public Vehiculo(String nombre, Float frenar) {
        this.frenar = frenar;
        this.nombre = nombre;
    }

    //Método
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Frenar: " + frenar);
    }
}
