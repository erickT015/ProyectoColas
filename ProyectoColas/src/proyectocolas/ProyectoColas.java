package proyectocolas;

import javax.swing.JOptionPane;

public class ProyectoColas {

    public static void main(String[] args) {
        Cajeros cajeros = new Cajeros();

        String[] arreglo = {"Ingresar", "Mostrar", "Atender","Salir"};
        String selector = "s";
        int seleccion;
        do {
            seleccion = JOptionPane.showOptionDialog(null, "seleccione una opcion ", "MENU", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Ingresar");
            switch (seleccion) {
                case 0:
                    cajeros.cajero();
                    break;
                case 1:
                    cajeros.mostrar();
                    break;
                case 2:
                    cajeros.atender();
                    break;
                case 3:
                    System.out.println("TERMINADO");
                    break;
                default:
            }
        } while (seleccion != 3);

    }

}
