/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import domain.EvaluatieMoment;
import domain.Leerling;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Matthias
 */
@Provider
@Produces(value = MediaType.APPLICATION_JSON)
public class EvaluatiemomentWriter implements MessageBodyWriter<EvaluatieMoment>{

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return (EvaluatieMoment.class.isAssignableFrom(type));
    } 

    @Override
    public long getSize(EvaluatieMoment t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(EvaluatieMoment lln, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        
            JsonObjectBuilder b = Json.createObjectBuilder();
            b.add("naam", lln.getNaam());
            b.add("grafiek", lln.getGrafiek());
            b.add("inschrijvingsnr", lln.getInschrijvingsnr());
            b.add("lastSelectedEva", lln.getLastSelectedEva());
            b.add("type", lln.getType());
            DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            b.add("verval", fmt.format(lln.getVerval()));
            b.add("instructeur", lln.getInstructeur());
            
        try(JsonWriter out = Json.createWriter(entityStream)){
            out.writeObject(b.build());
        }
    }
    
}
