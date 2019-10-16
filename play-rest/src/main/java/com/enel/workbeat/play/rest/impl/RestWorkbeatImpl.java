package com.enel.workbeat.play.rest.impl;


import com.enel.wokrbeat.play.dto.RequestDTO;
import com.enel.workbeat.play.rest.RestWorkbeat;

import javax.ejb.Stateful;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * The Class RestWorkbeatImpl.
 */
@Stateful
public class RestWorkbeatImpl implements RestWorkbeat {


    @Override
    public Response elaboraRichiestaAnnullamento(RequestDTO request) {
        return Response.ok(request.getSurname()).type(MediaType.APPLICATION_JSON_TYPE).build();
    }

}

