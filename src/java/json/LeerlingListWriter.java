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
            DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            b.add("verval", fmt.format(lln.getVerval()));
            b.add("instructeur", lln.getInstructeur());
             b.add("aandachtspunten", getArr(lln.getAandachtsPuntenLijst()));
            
            llnen.add(b.build());
        }
        
//        JsonObjectBuilder b = Json.createObjectBuilder();
//            b.add("naam", "Matthias Beerens");
//            b.add("grafiek", 0);
//            b.add("inschrijvingsnr", "2016-03-01-1");
//            b.add("lastSelectedEva", 1);
//            b.add("type", "Rijbewijs B");
//            b.add("verval", "2018-03-01");
//            b.add("instructeur", "Johan");
//        llnen.add(b.build());
        
        try(JsonWriter out = Json.createWriter(entityStream)){
            out.writeArray(llnen.build());
        }
            
    }
    
    private JsonArrayBuilder getArr(List<String> o){
        JsonArrayBuilder b = Json.createArrayBuilder();
        
        for(String s : o){
            b.add(s);
        }
        
        return  b;
    }
    
}
