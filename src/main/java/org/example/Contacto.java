package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto
 */

public class Contacto {

    private String name;

    private List<String> phones;

    /**
     * Constructor que inicializa los atributos de la clase
     * @param name Nombre del contacto
     * @param phone Telefono del contacto
     */
    public Contacto(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.phones.add(phone);
    }

    /**
     * Metodo para obtener el nombre del contacto
     * @return Nombre del contacto
     */

    public String getName() {
        return this.name;
    }

    /**
     * Metodo para obtener el o los numeros del contacto
     * @return Numero o numeros del contacto
     */

    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * Metodo para ponerle nombre al contacto
     * @param name Nombre del contacto
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para ponerle el  o los telefonos al contacto
     * @param phones Numero o numeros de telefono
     */

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}