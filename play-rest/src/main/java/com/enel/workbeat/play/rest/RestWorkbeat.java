package com.enel.workbeat.play.rest;


import com.enel.wokrbeat.play.dto.RequestDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


/**
 * The Interface RestWorkbeat.
 */
@Path("/v1")
public interface RestWorkbeat {


    @POST
    @Path("/canc/play-canc-request-2")
    @Produces("application/json")
    @Consumes("application/json")
    Response elaboraRichiestaAnnullamento(RequestDTO request);

}	

