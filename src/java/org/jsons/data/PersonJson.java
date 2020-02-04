/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jsons.data;

import java.io.StringWriter;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

import entities.Person;

/**
 *
 * @author Mobile Apps
 */

@Named
@RequestScoped
public class PersonJson {

    public String jsonString() {

        Person person = new Person("Kwame", "Yellow", "yekkki@gotmail.com");

        JsonObjectBuilder builder = Json.createObjectBuilder();
        JsonObject object = builder.add("FirstName", person.getFname()).add("LastName", person.getLname()).add("email", person.getEmail()).build();

        StringWriter sw = new StringWriter();
        JsonWriter writer = null;
        try {
            writer = Json.createWriter(sw);
            writer.writeObject(object);
        } catch (Exception e) {

        }
        return sw.toString();
    }
}
