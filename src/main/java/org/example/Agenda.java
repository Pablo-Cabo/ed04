package org.example;

import java.util.*;

/**
 * Representa un lista de personas
 * @see Personas
 */

public class Agenda {

    /**
     * Variable que contiene los contactos
     */

    private List<Personas> contacts; // Lista de Contacto

    /**
     * Constructor por defecto que inicializa la lista de contactos
     */

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Metodo para añadir personas a la lista de contactos
     * @param name Nombre de la persona
     * @param phone Numero de la persona
     */

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Personas c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Personas newContact = new Personas(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo para eliminar personas de la lista de contactos
     * @param name Nombre de la persona
     */

    public void removeContact(String name) {
        Iterator<Personas> it = contacts.iterator();

        while (it.hasNext()) {
            Personas c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Metodo para modificar el numero de telefono de las personas de lista de contactos
     * @param name Nombre de de la persona
     * @param oldPhone Antiguo telefono de la persona
     * @param newPhone Nuevo telefono de la persona
     */

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Personas c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Metodo que devuelve las personas de la lista de contactos
     * @return Lista de contactos
     */

    public List<Personas> getContacts() {
        return this.contacts;
    }
}