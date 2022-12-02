package proyectocolas;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Cajeros {

    //ffer, poli
    String nombre = " ";
    int mayor, menor = 0;

    LinkedList<String> cajero1 = new LinkedList();
    LinkedList<String> cajero2 = new LinkedList();
    LinkedList<String> cajero3 = new LinkedList();
    LinkedList<String> cajero4 = new LinkedList();

    public void cajero() {
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        if (cajero1.size() == cajero2.size() && cajero2.size() == cajero3.size() && cajero3.size() == cajero4.size()) {
            int selecCola = Integer.parseInt(JOptionPane.showInputDialog(nombre + ", en que caja desea hacer fila? 1-2-3-4"));
            switch (selecCola) {
                case 1:
                    cajero1.offer(nombre);
                    break;
                case 2:
                    cajero2.offer(nombre);
                    break;
                case 3:
                    cajero3.offer(nombre);
                    break;
                case 4:
                    cajero4.offer(nombre);
                    break;
                default:
            }
        } else if (cajero1.size() > cajero2.size()) {
            cajero2.offer(nombre);
            JOptionPane.showMessageDialog(null, nombre+" esta haciendo fila en el cajero 2. ");
        } else if (cajero2.size() > cajero3.size()) {
            cajero3.offer(nombre);
                        JOptionPane.showMessageDialog(null, nombre+" esta haciendo fila en el cajero 3. ");
        } else if (cajero4.size() < cajero3.size()) {
            cajero4.offer(nombre);
                        JOptionPane.showMessageDialog(null, nombre+" esta haciendo fila en el cajero 4. ");
        } else if (cajero1.size() <= cajero2.size() && cajero2.size() <= cajero3.size() && cajero3.size() <= cajero4.size()) {
            cajero1.offer(nombre);
                        JOptionPane.showMessageDialog(null, nombre+" esta haciendo fila en el cajero 1. ");
        } else if (cajero1.size() < cajero2.size() && cajero2.size() > cajero3.size() && cajero3.size() <= cajero4.size()) {
            cajero1.offer(nombre);
                        JOptionPane.showMessageDialog(null, nombre+" esta haciendo fila en el cajero 1. ");
        } else if (cajero1.size() <= cajero2.size() && cajero2.size() <= cajero3.size() && cajero3.size() > cajero4.size()) {
            cajero1.offer(nombre);
                        JOptionPane.showMessageDialog(null,nombre+" esta haciendo fila en el cajero 1. ");
        } else if (cajero1.size() >= cajero2.size() && cajero2.size() >= cajero3.size() && cajero3.size() > cajero4.size()) {
            cajero4.offer(nombre);
                        JOptionPane.showMessageDialog(null,nombre+" esta haciendo fila en el cajero 1. ");
        }

    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "En el cajero 1 hay " + cajero1.size() + " personas\n "
                + "En el cajero 2 hay " + cajero2.size() + " personas\n "
                + "En el cajero 3 hay " + cajero3.size() + " personas\n "
                + "En el cajero 4 hay " + cajero4.size() + " personas\n ");
    }

    public void atender() {
        int selec = Integer.parseInt(JOptionPane.showInputDialog("Cual cajero va atender en este momento?\n"+
                "En el cajero 1 hay " + cajero1.size() + " personas\n "+
                "En el cajero 2 hay " + cajero2.size() + " personas\n "+
                "En el cajero 3 hay " + cajero3.size() + " personas\n "+
                "En el cajero 4 hay " + cajero4.size() + " personas\n "));
        switch (selec) {
            case 1:
                cajero1.remove();
                break;
            case 2:
                cajero2.remove();
                break;
            case 3:
                cajero3.remove();
                break;
            case 4:
                cajero4.remove();
                break;

            default:
        }
    }

}
