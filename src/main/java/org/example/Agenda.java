package org.example;

import java.util.*;

/**
 * Clase Agenda, representa un lista de contactos
 * @see Contacto
 */

public class Agenda {

    /**
     * Variable que contiene los contactos
     */

    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor por defecto que inicializa la lista
     */

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Metodo para añadir contactos a la lista
     * @param name Nombre del contacto
     * @param phone Numero del contacto
     */

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo para eliminar contactos de la lista
     * @param name Nombre del contacto
     */

    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Metodo para modificar el numero de telefono del contacto
     * @param name Nombre del contacto
     * @param oldPhone Antiguo telefono del contacto
     * @param newPhone Nuevo telefono del contacto
     */

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
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
     * Metodo que devuelve los contactos de la lista
     * @return Lista de contactos
     */

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}