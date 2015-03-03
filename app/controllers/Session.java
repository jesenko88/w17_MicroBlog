package controllers;

import models.User;
import play.mvc.Http.Context;
import play.mvc.Security;

/*
 * 
 */
public class Session extends Security.Authenticator {
	
	
	public String getUsername(Context ctx){
		Long id = Long.parseLong(ctx.session().get("user_id"));
		User u = User.find(id);
		if ( u != null){
			return u.email;
		}
		return null;
	}

}
