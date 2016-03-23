/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import domain.Leerling;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Matthias
 */
@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class LeerlingReader implements MessageBodyReader<Leerling> {

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return Leerling.class.isAssignableFrom(type);
    }

    @Override
    public Leerling readFrom(Class<Leerling> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
        try (JsonReader in = Json.createReader(entityStream)) {
            JsonObject j = in.readObject();
            Leerling lln = new Leerling();
            lln.setNaam(j.getString("naam", null));
            lln.setGrafiek(j.getInt("grafiek", -1));
            lln.setInschrijvingsnr(j.getString("inschrijvingsnr", null));
            lln.setLastSelectedEva(j.getInt("lastSelectedEva", -1));
            lln.setType(j.getString("type", null));
            DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            lln.setVerval(fmt.parse(j.getString("verval", "2000-01-01")));
            lln.setInstructeur(j.getString("instructeur", null));
            
            

            return lln;
        } catch (JsonException | ClassCastException | ParseException e) {
            throw new BadRequestException("invalid json");
        }
    }

}
