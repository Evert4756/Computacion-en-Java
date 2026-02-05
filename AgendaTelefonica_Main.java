/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica_main;

/**
 *
 * @author ebert
 */
import java.util.Scanner;

public class AgendaTelefonica_Main {

    public static void main(String[] args) {

        AdminAgenda agenda = new AdminAgenda();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n-Agenda Telefonica-");
            System.out.println("1. Lista de contactos");
            System.out.println("2. Crear contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    agenda.list();
                    break;

                case 2:
                    System.out.print("Ingrese numero telefonico: ");
                    String number = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String name = scanner.nextLine();
                    agenda.create(number, name);
                    break;

                case 3:
                    System.out.print("Ingrese el numero a eliminar: ");
                    String deleteNumber = scanner.nextLine();
                    agenda.delete(deleteNumber);
                    break;

                case 4:
                    System.out.println("Game Over");
                    break;

                default:
                    System.out.println("Opción no valida.");
            }

        } while (option != 4);

        scanner.close();
    }
}


