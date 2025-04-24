//Clase vehiculo, objeto frenar, mostrar información
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo("Julia", "Azul", "Nissan");
        System.out.println();
        //Segundo
        System.out.println("Ingrese datos nuevos: ");
        System.out.println("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.println("Color: ");
        String color1 = sc.nextLine();
        System.out.println("Marca: ");
        String marca1 = sc.nextLine();
        Vehiculo v2 = new Vehiculo(nombre1, color1, marca1);


        v1.mostrar();
        v2.mostrar();

    }
}
//Nuevo
