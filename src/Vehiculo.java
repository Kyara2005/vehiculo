public class Vehiculo {
    //Atributos
    String color;
    String nombre;
    String marca;

    //Constructores
    public Vehiculo(String nombre, String color, String marca) {
        this.color = color;
        this.nombre = nombre;
        this.marca = marca;
    }

    //Métodos
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
    }
}
//hola
