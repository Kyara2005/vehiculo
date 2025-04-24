//Clase vehiculo, objeto frenar, mostrar información
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo("hola", "rojo");
        v1.mostrar();


        //Creo la instancia
        Vehiculo carro= new Vehiculo("Cross","Gris","Toyota");


        //Lamo al mét odo
        carro.mostrar();
    }
}