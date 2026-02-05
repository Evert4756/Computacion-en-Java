/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica_main;

/**
 *
 * @author ebert
 */
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AdminAgenda {

    private HashMap<String, String> contacts;

    private final String inputFile = "input.csv";
    private final String outputFile = "output.csv";

    public AdminAgenda() {
        contacts = new HashMap<>();
        load();
    }

    public void load() {
        File file = new File(inputFile);
        if (!file.exists()) {
            System.out.println("El archivo input.csv no existe.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    contacts.put(data[0], data[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer input.csv.");
        }
    }

    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir output.csv.");
        }
    }

    public void list() {
        if (contacts.isEmpty()) {
            System.out.println("La agenda esta vacia.");
            return;
        }

        System.out.println("\nContactos:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void create(String number, String name) {
        contacts.put(number, name);
        save();
        System.out.println("Contacto agregado y guardado en output.csv.");
    }

    public void delete(String number) {
        if (contacts.remove(number) != null) {
            save();
            System.out.println("Contacto eliminado y cambios guardados en output.csv.");
        } else {
            System.out.println("El número no existe.");
        }
    }
}


