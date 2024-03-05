package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una persona
 */

public class Personas {

    private String name;

    private List<String> phones;

    /**
     * Constructor que inicializa los atributos de la clase
     * @param name Nombre de la persona
     * @param phone Telefono de la persona
     */
    public Personas(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.phones.add(phone);
    }

    /**
     * Metodo para obtener el nombre de la persona
     * @return Nombre de la persona
     */

    public String getName() {
        return this.name;
    }

    /**
     * Metodo para obtener el o los numeros de la persona
     * @return Numero o numeros de la persona
     */

    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * Metodo para ponerle nombre a la persona
     * @param name Nombre de la persona
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para ponerle el o los telefonos a la persona
     * @param phones Numero o numeros de telefono de la persona
     */

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}