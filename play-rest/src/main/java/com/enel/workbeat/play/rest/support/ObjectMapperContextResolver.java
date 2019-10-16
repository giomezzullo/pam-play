package com.enel.workbeat.play.rest.support;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;

@Provider
public class ObjectMapperContextResolver implements ContextResolver<ObjectMapper>{

	private final ObjectMapper MAPPER;
	private Logger logger = LoggerFactory.getLogger(ObjectMapperContextResolver.class);

    public ObjectMapperContextResolver() {
    	logger.info("Built ObjectMapperContextResolver");
        MAPPER = new ObjectMapper();
        MAPPER.registerModule(new JSR310Module());
        MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }
	
	@Override
	public ObjectMapper getContext(Class<?> arg0) {
		return MAPPER;
	}

}
