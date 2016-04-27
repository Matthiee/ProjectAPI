/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import domain.Leerling;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Matthias
 */
@RequestScoped
@Transactional(dontRollbackOn = {BadRequestException.class})
@Path("leerlingen")
public class Leerlingen {
    
    @PersistenceContext
    private EntityManager em;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Leerling> getAllLeerlingen() {
//        Leerling l = new Leerling();
//        l.setNaam("Matthias");
//        l.setInschrijvingsnr("2016-04-27-1");
//        l.setGrafiek(0);
//        l.setInstructeur("Paul");
//        l.setVerval(new Date());
//        l.setType("Rijbewijs B");
//        l.setLastSelectedEva(1);
//        addLeerling(l);
        return em.createNamedQuery("Leerling.findAll", Leerling.class).getResultList();
    }
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addLeerling(Leerling lln){
        
        if (em.find(Leerling.class, lln.getInschrijvingsnr())!=null)
            throw new BadRequestException("inschrijvingsnr bestaat al!");
        
        em.persist(lln);
        
        return Response.created(URI.create("/" +lln.getInschrijvingsnr())).build();
    }
            
    
}
