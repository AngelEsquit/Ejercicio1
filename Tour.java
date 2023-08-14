/*
Universidad del Valle de Guatemala
Angel Esteban Esquit Hernández - 23221
Ejercicio 1 - Eras Tour
*/

import java.util.Scanner;
import java.util.Random;

/**
 * Esta clase representa un programa para la compra de boletos del Eras Tour.
 */

public class Tour {

    public static void main(String[] args) {
        // Creación de instancias de objetos
        Comprador comprador1 = new Comprador();
        Localidad localidad1 = new Localidad();
        Localidad localidad5 = new Localidad();
        Localidad localidad10 = new Localidad();
        Ticket ticket = new Ticket();
        Ticket vTicket1 = new Ticket();
        Ticket vTicket2 = new Ticket();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Configuración de localidades
        localidad1.setNumLoc(20);
        localidad5.setNumLoc(20);
        localidad10.setNumLoc(20);
        localidad1.setNombreLoc("Localidad 1");
        localidad5.setNombreLoc("Localidad 5");
        localidad10.setNombreLoc("Localidad 10");
        localidad1.setPrecioLoc(100);
        localidad5.setPrecioLoc(500);
        localidad10.setPrecioLoc(1000);

        // Número random para la sacar la localidad de compra
        int randomNumLoc;

        while (true) {
            // Interfaz de usuario
            System.out.println("");
            System.out.println("***************************************");
            System.out.println("              Eras Tour");
            System.out.println("***************************************");
            System.out.println("Ingrese la opción que desee. \n 1: Comprar boletos \n 2: Salir");
            System.out.println("");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                // Proceso de obtención de datos
                System.out.println("\nIngrese su nombre");
                comprador1.setNombre(scanner.nextLine());
                System.out.println("\nIngrese su email");
                comprador1.setEmail(scanner.nextLine());
                System.out.println("\nIngrese el número de boletos que desea");
                comprador1.setNumBoletos(scanner.nextInt());
                scanner.nextLine();
                System.out.println("\nIngrese su presupuesto máximo para la compra");
                comprador1.setPresupuesto(scanner.nextInt());
                scanner.nextLine();
                ticket.setNum();
                vTicket1.setNum();
                vTicket2.setNum();
                System.out.println("Su Ticket es: " + ticket.getNum());

                // Verificación de Ticket
                if (vTicket1.getNum() < vTicket2.getNum()) {
                    if (vTicket1.getNum() <= ticket.getNum() && ticket.getNum() <= vTicket2.getNum()) {
                        System.out.println("Su ticket es válido.");
                        System.out.println("");
                        randomNumLoc = random.nextInt(3) + 1;
                        if (randomNumLoc == 1) {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad1.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad1.getNumLoc() + " boletos de la Localidad 1.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad1.getPrecioLoc() * localidad1.getNumLoc())) {
                                    localidad1.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()) + " boletos de la Localidad 1.");
                                }
                                else {
                                    localidad1.compraNumLoc(localidad1.getNumLoc());
                                    System.out.println("Has comprado " + localidad1.getNumLoc() + " boletos de la Localidad 1.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad1.getPrecioLoc() * localidad1.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad1.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()) + " boletos de la Localidad 1.");
                                }
                                else {
                                    localidad1.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 1.");
                                }
                            }
                        }
                        else if (randomNumLoc == 2) {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad5.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad5.getNumLoc() + " boletos de la Localidad 5.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad5.getPrecioLoc() * localidad5.getNumLoc())) {
                                    localidad5.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()) + " boletos de la Localidad 5.");
                                }
                                else {
                                    localidad5.compraNumLoc(localidad5.getNumLoc());
                                    System.out.println("Has comprado " + localidad5.getNumLoc() + " boletos de la Localidad 5.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad5.getPrecioLoc() * localidad5.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad5.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()) + " boletos de la Localidad 5.");
                                }
                                else {
                                    localidad5.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 5.");
                                }
                            }
                        }
                        else {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad10.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad10.getNumLoc() + " boletos de la Localidad 10.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad10.getPrecioLoc() * localidad10.getNumLoc())) {
                                    localidad10.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()) + " boletos de la Localidad 10.");
                                }
                                else {
                                    localidad10.compraNumLoc(localidad10.getNumLoc());
                                    System.out.println("Has comprado " + localidad10.getNumLoc() + " boletos de la Localidad 10.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad10.getPrecioLoc() * localidad10.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad10.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()) + " boletos de la Localidad 10.");
                                }
                                else {
                                    localidad10.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 10.");
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Tu ticket no es válido.");
                    }
                }
                // Verificación de Ticket
                else if (vTicket1.getNum() > vTicket2.getNum()) {
                    if (vTicket1.getNum() >= ticket.getNum() && ticket.getNum() >= vTicket2.getNum()) {
                        System.out.println("Su ticket es válido.");
                        System.out.println("");
                        randomNumLoc = random.nextInt(3) + 1;
                        if (randomNumLoc == 1) {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad1.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad1.getNumLoc() + " boletos de la Localidad 1.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad1.getPrecioLoc() * localidad1.getNumLoc())) {
                                    localidad1.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()) + " boletos de la Localidad 1.");
                                }
                                else {
                                    localidad1.compraNumLoc(localidad1.getNumLoc());
                                    System.out.println("Has comprado " + localidad1.getNumLoc() + " boletos de la Localidad 1.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad1.getPrecioLoc() * localidad1.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad1.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()) + " boletos de la Localidad 1.");
                                }
                                else {
                                    localidad1.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 1.");
                                }
                            }
                        }
                        else if (randomNumLoc == 2) {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad5.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad5.getNumLoc() + " boletos de la Localidad 5.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad5.getPrecioLoc() * localidad5.getNumLoc())) {
                                    localidad5.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()) + " boletos de la Localidad 5.");
                                }
                                else {
                                    localidad5.compraNumLoc(localidad5.getNumLoc());
                                    System.out.println("Has comprado " + localidad5.getNumLoc() + " boletos de la Localidad 5.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad5.getPrecioLoc() * localidad5.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad5.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()) + " boletos de la Localidad 5.");
                                }
                                else {
                                    localidad5.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 5.");
                                }
                            }
                        }
                        else {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad10.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad10.getNumLoc() + " boletos de la Localidad 10.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad10.getPrecioLoc() * localidad10.getNumLoc())) {
                                    localidad10.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()) + " boletos de la Localidad 10.");
                                }
                                else {
                                    localidad10.compraNumLoc(localidad10.getNumLoc());
                                    System.out.println("Has comprado " + localidad10.getNumLoc() + " boletos de la Localidad 10.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad10.getPrecioLoc() * localidad10.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad10.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()) + " boletos de la Localidad 10.");
                                }
                                else {
                                    localidad10.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 10.");
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Tu ticket no es válido.");
                    }
                }

                // Verificación de Ticket
                else if (vTicket1.getNum() == vTicket2.getNum()) {
                    if (ticket.getNum() == vTicket1.getNum()) {
                        System.out.println("Su ticket es válido.");
                        System.out.println("");
                        randomNumLoc = random.nextInt(3) + 1;
                        if (randomNumLoc == 1) {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad1.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad1.getNumLoc() + " boletos de la Localidad 1.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad1.getPrecioLoc() * localidad1.getNumLoc())) {
                                    localidad1.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()) + " boletos de la Localidad 1.");
                                }
                                else {
                                    localidad1.compraNumLoc(localidad1.getNumLoc());
                                    System.out.println("Has comprado " + localidad1.getNumLoc() + " boletos de la Localidad 1.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad1.getPrecioLoc() * localidad1.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad1.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad1.getPrecioLoc()) + " boletos de la Localidad 1.");
                                }
                                else {
                                    localidad1.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 1.");
                                }
                            }
                        }
                        else if (randomNumLoc == 2) {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad5.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad5.getNumLoc() + " boletos de la Localidad 5.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad5.getPrecioLoc() * localidad5.getNumLoc())) {
                                    localidad5.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()) + " boletos de la Localidad 5.");
                                }
                                else {
                                    localidad5.compraNumLoc(localidad5.getNumLoc());
                                    System.out.println("Has comprado " + localidad5.getNumLoc() + " boletos de la Localidad 5.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad5.getPrecioLoc() * localidad5.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad5.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad5.getPrecioLoc()) + " boletos de la Localidad 5.");
                                }
                                else {
                                    localidad5.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 5.");
                                }
                            }
                        }
                        else {
                            // Verificación de número de boletos
                            if (comprador1.getNumBoletos() > localidad10.getNumLoc()) {
                                System.out.println("Has intentado comprar " + comprador1.getNumBoletos() + " boletos, pero solamente quedaban " + localidad10.getNumLoc() + " boletos de la Localidad 10.");
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad10.getPrecioLoc() * localidad10.getNumLoc())) {
                                    localidad10.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()));
                                    System.out.println("Además tu presupuesto no es suficiente para comprar el máximo de boletos disponibles, entonces has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()) + " boletos de la Localidad 10.");
                                }
                                else {
                                    localidad10.compraNumLoc(localidad10.getNumLoc());
                                    System.out.println("Has comprado " + localidad10.getNumLoc() + " boletos de la Localidad 10.");
                                }
                            }
                            else {
                                // Verificación de presupuesto
                                if (comprador1.getPresupuesto() < (localidad10.getPrecioLoc() * localidad10.getNumLoc())) {
                                    System.out.println("Tu presupuesto no es suficiente para comprar los boletos solicitados, entonces comprarás el límite permitido por tu presupuesto.");
                                    localidad10.compraNumLoc((int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()));
                                    System.out.println("Has comprado " + (int) Math.floor(comprador1.getPresupuesto()/localidad10.getPrecioLoc()) + " boletos de la Localidad 10.");
                                }
                                else {
                                    localidad10.compraNumLoc(comprador1.getNumBoletos());
                                    System.out.println("Has comprado " + comprador1.getNumBoletos() + " boletos de la Localidad 10.");
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Tu ticket no es válido.");
                    }
                }
            }
            else if (opcion == 2) {
                break;
            }
            else {
                System.out.println("----------------------------\nIngrese una opción válida. \n----------------------------");
            }
        }
    }
}
