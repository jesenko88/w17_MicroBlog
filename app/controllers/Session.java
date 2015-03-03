package controllers;

import play.mvc.Http.Context;
import play.mvc.Security;

/*
 * 
 */
public class Session extends Security.Authenticator {
	
	
	public String getUsername(Context ctx){
		Long id = Long.parseLong(ctx.session().get("user_id"));
		return null;
	}

}
