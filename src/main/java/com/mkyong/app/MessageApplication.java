package com.mkyong.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.mkyong.rest.MessageRestService;
import org.hybernates.common.service.MovieService;

public class MessageApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public MessageApplication() {
		singletons.add(new MovieService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
