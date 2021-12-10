package com.OB.demoSpringRest.controllers;

import com.OB.demoSpringRest.models.Bootcamper;
import com.OB.demoSpringRest.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
   private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Uno", Math.random()));
        this.bootcamperService.add(new Bootcamper("Dos", Math.random()));
        this.bootcamperService.add(new Bootcamper("Tres", Math.random()));
        this.bootcamperService.add(new Bootcamper("Cuatro", Math.random()));
        this.bootcamperService.add(new Bootcamper("Cinco", Math.random()));
    }


    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")//Indica en que formato va a devolver los datos
    public Bootcamper listarUno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json") //Indica en que formato va a devolver los datos
    public List<Bootcamper> listarTodos(){
     return bootcamperService.getAll();
    }



    @POST
    @Path("/bootcampers")
    @Produces("application/json")//Indica en que formato va a devolver los datos
    @Consumes("application/json")//Indica en que formato va a consumir u obtener los datos
    public Response meterBootcamper(Bootcamper bootcamper){
      bootcamperService.add(bootcamper);
      return Response.created(
              URI.create("/bootcampers/" + bootcamper.getNombre()))
              .build();
    }




}
