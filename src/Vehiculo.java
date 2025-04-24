public class Vehiculo {
    String color;
    String nombre;
    String marca;

    public Vehiculo(String nombre, String color, String marca) {
        this.color = color;
        this.nombre = nombre;
        this.marca = marca;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
    }
}

