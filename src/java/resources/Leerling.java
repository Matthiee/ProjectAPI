/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Matthias
 */
@RequestScoped
@Transactional(dontRollbackOn = {BadRequestException.class})
@Path("leerling")
public class Leerling {

    @PersistenceContext
    private EntityManager em;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{inschrijvingsNr}")
    public domain.Leerling getLeerling(@PathParam("inschrijvingsNr") String nr) {
        domain.Leerling l = em.find(domain.Leerling.class, nr);

        if (l == null) {
            throw new NotFoundException("Inschrijvingsnr bestaat niet!");
        }

        return l;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{inschrijvingsNr}")
    public void updateLeerling(@PathParam("inschrijvingsNr") String nr, InputStream in) {
        domain.Leerling lln = em.find(domain.Leerling.class, nr);
        if (lln == null) {
            throw new NotFoundException("Inschrijvingsnr bestaat niet!");
        }

        try (JsonReader json = Json.createReader(in)) {
            JsonObject diff = json.readObject();

            if (diff.containsKey("naam")) {
                lln.setNaam(diff.getString("naam"));
            }

            if (diff.containsKey("grafiek")) {
                lln.setGrafiek(diff.getInt("grafiek"));
            }

            if (diff.containsKey("inschrijvingsnr")) {
                lln.setInschrijvingsnr(diff.getString("inschrijvingsnr"));
            }

            if (diff.containsKey("lastSelectedEva")) {
                lln.setLastSelectedEva(diff.getInt("lastSelectedEva"));
            }

            if (diff.containsKey("type")) {
                lln.setType(diff.getString("type"));
            }

            if (diff.containsKey("naam")) {
                lln.setNaam(diff.getString("naam"));
            }

            if (diff.containsKey("verval")) {
                DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
                lln.setVerval(fmt.parse(diff.getString("verval")));
            }

            if (diff.containsKey("instructeur")) {
                lln.setNaam(diff.getString("instructeur"));
            }
        } catch(ParseException e){
            throw new BadRequestException("invalid json");
        }
    }
    
    @DELETE
    @Path("/{inschrijvingsNr}")
    public void verwijderLeerling(@PathParam("inschrijvingsNr") String nr){
        domain.Leerling lln = em.find(domain.Leerling.class, nr);
        if (lln == null)
            throw new BadRequestException("inschrijvngsnr bestaat niet!");
        
        em.remove(lln);
    }
}
