import java.util.Scanner;

public class Pantalla {

    public static void main(String[] args) {
        primerMenu();

        int option = Scanner.getInt("Que operacion desea realizar? ");
        switch (option) {
            case 1: crearAdministrador();
                break;
            case 2: crearCliente();
                break;
            default: System.out.println("Invalid.");
                break;
        }




    }

    private static void crearCliente() {
        String nombre = Scanner.getString("Nombre?");
        int telefono = Scanner.getInt("Telefono?");
        new Cliente(nombre, telefono);
    }

    private static void crearAdministrador() {
    }

    public static void primerMenu(){
            System.out.println("Bienvenido a MoovMe" + "/n" + "Operaciones" + "/n" + "1-Crear Administrador" + "/n" +
                    "2-Crear Cliente");
        }
    }
    //todo lo que ve el usuario
    //cada vez que se ingresa una ocpion se blanquea la pantalla --> clear screen (buscar)
    //prolijidad en pantalla es clave
    //reportar que alguine esta robando --> bloquear, multar y devolver activo a terminal original
//para cliente mostrar: realizar viaje, mirar descuentos, elegir descuentos, mirar puntos



}
