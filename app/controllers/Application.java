package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    	//return notFound("<h1>Page not found</h1>").as("application/xml");
    //	return badRequest();
    }
    
    public static Result harsh(String name, int age) {
    	String city = Play.application().configuration().getString("city");
    	return ok("Hello " + name + "! You are " + age + " years old. Living in " + city).as("text/html");
    }

}
