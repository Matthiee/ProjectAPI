/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
    public domain.Leerling getLeerling(@PathParam("inschrijvingsNr") String nr){
        domain.Leerling l = em.find(domain.Leerling.class, nr);
        
        if (l == null)
            throw new NotFoundException("Inschrijvingsnr bestaat niet!");
        
        return l;
    }
    
}
