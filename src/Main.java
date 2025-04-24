//Clase vehiculo, objeto frenar, mostrar información
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo("hola", true);
        v1.mostrar();


        Vehiculo carro = new Vehiculo("bmw","5.0");

    }
}