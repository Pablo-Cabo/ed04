package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto
 */

public class Contacto {

    /**
     * Variable que almacena el nombre del contacto
     */

    private String name;

    /**
     * Variable que almacena el o los telefonos del contacto
     */

    private List<String> phones;

    /**
     * Constructor que inicializa los atributos de la clase
     * @param name Nombre del contacto
     * @param phone Telefono del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
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
}