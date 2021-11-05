package Lab4P2_DessireOchoa_22111211;

import java.util.ArrayList;
import java.util.Scanner;

public class CallOfDuty {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<Zonas> zonas = new ArrayList();
        ArrayList<Escuadrones> Escuadron = new ArrayList();

        int opcion = 1;
        String nombre = "";
        int tamaño = 0;
        int coordenadaX = 0;
        int coordenadaY = 0;
        int posicion = 0;
        int edad = 0;
        int tiempoEjercito = 0;
        String rango = "";
        int vida = 0;

        Escuadron.add(new Escuadrones("Escuadron 1"));
        Escuadron.add(new Escuadrones("Escuadron 2"));
        Escuadron.get(0).addZonaConquistada("Zona Cero", 250, 90, 80);
        Escuadron.get(1).addZonaConquistada("Frost Bite", 100, 50, 30);
        zonas.add(new Zonas("Zona Cero", 250, 90, 80));
        zonas.add(new Zonas ("Frost Bite", 100, 50, 30));

        while (opcion > 0 && opcion < 12) {
            System.out.println("\n0. Salir\n"
                    + "1. Crear zona\n"
                    + "2. Listar zonas\n"
                    + "3. Crear escuadron\n"
                    + "4. Listar escuadrones\n"
                    + "5. Listar escuadron\n"
                    + "6. Eliminar escuadron\n"
                    + "7. Añadir soldado a escuadron\n"
                    + "8. Listar soldados de escuadron\n"
                    + "9. Listar soldados de escuadron por tipo\n"
                    + "10. Eliminar soldados de escuadron\n"
                    + "11. Pelear\n");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nCrear Zonas\n");

                    System.out.println("\nIngrese el nombre de la zona");
                    nombre = leer.next();
                    System.out.println("\nIngrese el tamaño de la zona");
                    tamaño = leer.nextInt();
                    System.out.println("\nIngrese la coordenada X");
                    coordenadaX = leer.nextInt();
                    System.out.println("\nIngrese la coordenada Y");
                    coordenadaY = leer.nextInt();

                    zonas.add(new Zonas(nombre, tamaño, coordenadaX, coordenadaY));

                    break;
                case 2:
                    System.out.println("\nListar zonas\n");
                    String listaZonas = "";
                    for (Zonas listar : zonas) {
                        listaZonas += listar + "\n";
                    }

                    System.out.println(listaZonas);
                    break;
                case 3:
                    System.out.println("\nCrear Escuadron\n");
                    System.out.println("\nIngrese el nombre del escuadron");
                    nombre = leer.next();
                    Escuadron.add(new Escuadrones(nombre));
                    break;
                case 4:

                    System.out.println("\nListar Escuadrones\n");
                    String listaEscua = "";
                    for (Escuadrones listar : Escuadron) {
                        listaEscua += Escuadron.indexOf(listar) + "-" + listar + "\n";
                    }

                    System.out.println(listaEscua);

                    break;
                case 5:
                    System.out.println("\nListar Escuadrones\n");
                    System.out.println("Ingrese la posicion del escuadron");
                    posicion = leer.nextInt();

                    System.out.println(Escuadron.get(posicion));
                    break;
                case 6:
                    System.out.println("\nEliminar Escuadron\n");
                    System.out.println("Ingrese la posicion del escuadron");
                    posicion = leer.nextInt();

                    Escuadron.remove(posicion);

                    System.out.println("Escuadron eliminado");
                    break;
                case 7:
                    System.out.println("\nAñadir Soldado al Escuadron\n");
                    System.out.println("Ingrese la posicion del escuadron");
                    posicion = leer.nextInt();

                    System.out.println("\nIngrese que tipo de Soldado es:\n"
                            + "1. Infantería ligera\n"
                            + "2. Infantería pesada\n"
                            + "3. Sargento\n"
                            + "4. Capitán\n"
                            + "5. SuperSoldado\n");
                    opcion = leer.nextInt();

                    if (opcion == 1) {
                        System.out.println("Ingrese el nombre");
                        nombre = leer.next();
                        System.out.println("Ingrese la edad");
                        edad = leer.nextInt();
                        System.out.println("Ingrese el tiempo en el Ejercito");
                        tiempoEjercito = leer.nextInt();
                        System.out.println("Ingrese el rango");
                        rango = leer.next();
                        System.out.println("Ingrese la vida");
                        vida = leer.nextInt();
                        Escuadron.get(posicion).addInfanteríaLigera(nombre, edad, tiempoEjercito, rango, vida);
                    }

                    if (opcion == 2) {
                        System.out.println("Ingrese el nombre");
                        nombre = leer.next();
                        System.out.println("Ingrese la edad");
                        edad = leer.nextInt();
                        System.out.println("Ingrese el tiempo en el Ejercito");
                        tiempoEjercito = leer.nextInt();
                        System.out.println("Ingrese el rango");
                        rango = leer.next();
                        System.out.println("Ingrese la vida");
                        vida = leer.nextInt();
                        Escuadron.get(posicion).addInfanteriaPesada(nombre, edad, tiempoEjercito, rango, vida);
                    }

                    if (opcion == 3) {
                        System.out.println("Ingrese el nombre");
                        nombre = leer.next();
                        System.out.println("Ingrese la edad");
                        edad = leer.nextInt();
                        System.out.println("Ingrese el tiempo en el Ejercito");
                        tiempoEjercito = leer.nextInt();
                        System.out.println("Ingrese el rango");
                        rango = leer.next();
                        System.out.println("Ingrese la vida");
                        vida = leer.nextInt();
                        Escuadron.get(posicion).addSargento(nombre, edad, tiempoEjercito, rango, vida);
                    }

                    if (opcion == 4) {
                        System.out.println("Ingrese el nombre");
                        nombre = leer.next();
                        System.out.println("Ingrese la edad");
                        edad = leer.nextInt();
                        System.out.println("Ingrese el tiempo en el Ejercito");
                        tiempoEjercito = leer.nextInt();
                        System.out.println("Ingrese el rango");
                        rango = leer.next();
                        System.out.println("Ingrese la vida");
                        vida = leer.nextInt();
                        Escuadron.get(posicion).addCapitan(nombre, edad, tiempoEjercito, rango, vida);

                    }

                    if (opcion == 5) {
                        System.out.println("Ingrese el nombre");
                        nombre = leer.next();
                        System.out.println("Ingrese la edad");
                        edad = leer.nextInt();
                        System.out.println("Ingrese el tiempo en el Ejercito");
                        tiempoEjercito = leer.nextInt();
                        System.out.println("Ingrese el rango");
                        rango = leer.next();
                        System.out.println("Ingrese la vida");
                        vida = leer.nextInt();
                        Escuadron.get(posicion).addSuperSoldado(nombre, edad, tiempoEjercito, rango, vida);
                    }

                    break;
                case 8:
                    System.out.println("\nListar Soldados del Escuadron\n");
                    System.out.println("Ingrese la posicion del escuadron");
                    posicion = leer.nextInt();

                    System.out.println(Escuadron.get(posicion).getListaSoldados());

                    break;
                case 9:
                    System.out.println("\nListar Soldados del Escuadron por tipo\n");
                    System.out.println("Ingrese la posicion del escuadron");
                    posicion = leer.nextInt();
                    
                    String salida = "";
                    for (Soldados sold : Escuadron.get(posicion).getListaSoldados()) {
                        if (sold instanceof InfanteríaLigera) {
                            System.out.println("\nSoldados Infanteria Ligera:");
                            salida += sold+ "\n";
                            System.out.println(salida);
                        }
                    }
                    
                    String salida2 = "";
                    for (Soldados sold : Escuadron.get(posicion).getListaSoldados()) {
                        if (sold instanceof InfanteriaPesada) {
                            System.out.println("\nSoldados Infanteria Pesada:");
                            salida2 += sold+ "\n";
                            System.out.println(salida2);
                        }
                    }
                    
                    String salida3 = "";
                    for (Soldados sold : Escuadron.get(posicion).getListaSoldados()) {
                        if (sold instanceof Sargento) {
                            System.out.println("\nSoldados Sargento:");
                            salida3 += sold+ "\n";
                            System.out.println(salida3);
                        }
                    }
                    
                    String salida4 = "";
                    for (Soldados sold : Escuadron.get(posicion).getListaSoldados()) {
                        if (sold instanceof Capitan) {
                            System.out.println("\nSoldados Capitan:");
                            salida4 += sold+ "\n";
                            System.out.println(salida4);
                        }
                    }
                    
                    String salida5 = "";
                    for (Soldados sold : Escuadron.get(posicion).getListaSoldados()) {
                        if (sold instanceof SuperSoldado) {
                            System.out.println("\nSuper Soldados:");
                            salida5 += sold+ "\n";
                            System.out.println(salida5);
                        }
                    }

                    break;
                case 10:
                    System.out.println("\nEliminar Soldados del Escuadron\n");
                    System.out.println("Ingrese la posicion del escuadron");
                    posicion = leer.nextInt();
                    System.out.println("Ingrese la posicion del Soldado");
                    int posicion2 = leer.nextInt();

                    Escuadron.get(posicion).getListaSoldados().remove(posicion2);

                    break;
                case 11:
                    break;

            } //Fin Switch

        }//Fin While
    }

}
