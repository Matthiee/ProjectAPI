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
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
public class EvaluatieMoment {

    @PersistenceContext
    private EntityManager em;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{inschrijvingsNr}/eva{evaId}")
    public domain.EvaluatieMoment getLeerling(@PathParam("inschrijvingsNr") String nr, @PathParam("evaId") int id) {
        domain.Leerling l = em.find(domain.Leerling.class, nr);

        if (l == null) {
            throw new NotFoundException("Inschrijvingsnr bestaat niet!");
        }

        domain.EvaluatieMoment eva = null;
        switch (id) {
            case 1:
                eva = l.getEva1();
                break;
            case 2:
                eva = l.getEva2();
                break;
            case 3:
                eva = l.getEva3();
                break;
        }

        //eva = new domain.EvaluatieMoment();
        
        if (eva == null) {
            throw new NotFoundException("evaluatie bestaat niet!");
        }

        return eva;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{inschrijvingsNr}/eva{evaId}")
    public void addEva(@PathParam("inschrijvingsNr") String nr, @PathParam("evaId") int id, domain.EvaluatieMoment eva) {
        domain.Leerling l = em.find(domain.Leerling.class, nr);

        if (l == null) {
            throw new NotFoundException("Inschrijvingsnr bestaat niet!");
        }

        switch (id) {
            case 1:
                l.setEva1(eva);
                break;
            case 2:
                l.setEva2(eva);
                break;
            case 3:
                l.setEva3(eva);
                break;
        }
        
        em.persist(l);

    }

}
