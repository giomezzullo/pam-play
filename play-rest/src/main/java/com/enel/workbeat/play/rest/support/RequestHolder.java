package com.enel.workbeat.play.rest.support;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RequestHolder {
	private String requestSystem;

	public String getRequestSystem() {
		return requestSystem;
	}

	public void setRequestSystem(String requestSystem) {
		this.requestSystem = requestSystem;
	}
	
	

}
