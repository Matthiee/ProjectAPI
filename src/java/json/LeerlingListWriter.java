/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import domain.Leerling;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
public class LeerlingListWriter implements MessageBodyWriter<List<Leerling>>{

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        if (!List.class.isAssignableFrom(type))
            return false;
        
        if (genericType instanceof ParameterizedType){
            Type[] args = ((ParameterizedType)genericType).getActualTypeArguments();
            return args.length==1&&args[0].equals(Leerling.class);
        } else{
            return false;
        }
            
            
    }

    @Override
    public long getSize(List<Leerling> t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(List<Leerling> t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        JsonArrayBuilder llnen  = Json.createArrayBuilder();
        for(Leerling lln : t){
            JsonObjectBuilder b = Json.createObjectBuilder();
            b.add("naam", lln.getNaam());
            b.add("grafiek", lln.getGrafiek());
            b.add("inschrijvingsnr", lln.getInschrijvingsnr());
            b.add("lastSelectedEva", lln.getLastSelectedEva());
            b.add("type", lln.getType());
            b.add("verval", lln.getVerval().toGMTString());
            b.add("instructeur", lln.getInstructeur());
        }
        
        try(JsonWriter out = Json.createWriter(entityStream)){
            out.writeArray(llnen.build());
        }
            
    }
    
}
