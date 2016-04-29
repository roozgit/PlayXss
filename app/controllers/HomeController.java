package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result index() {
        return ok(index.render("Welcome to test XSS app!"));
    }

    public Result testCase1(String ui) {
	response().setHeader("X-XSS-Protection", "0");
	return ok(testCase1.render(ui));
    }

    public Result testCase2(String ui) {
	response().setHeader("X-XSS-Protection", "0");
	return ok(testCase2.render(ui));
    }
    
    public Result testCase3(String ui) {
	response().setHeader("X-XSS-Protection", "0");
	return ok(testCase3.render(ui));
    }
    
    public Result testCase4(String ui) {
	response().setHeader("X-XSS-Protection", "0");
	return ok(testCase4.render(ui));
    }

    public Result testCase5(String ui) {
	response().setHeader("X-XSS-Protection", "0");
	return ok(testCase5.render(ui));
    }

    public Result fragmentXss() {
	response().setHeader("X-XSS-Protection", "0");
	return ok(fragment.render());
    }

     public Result hrefXss(String ui) {
	response().setHeader("X-XSS-Protection", "0");
	return ok(href.render(ui));
    }

     public Result imageOnLoadXss(String ui) {
	response().setHeader("X-XSS-Protection", "0");
	return ok(imageOnLoad.render(ui));
    }

}
