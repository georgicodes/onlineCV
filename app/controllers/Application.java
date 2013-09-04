package controllers;

import models.TechnologyProduct;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Application extends Controller {

    public static Result index() {
        Set<TechnologyProduct> all = TechnologyProduct.findAll();
        List<TechnologyProduct> allAsList = new ArrayList<TechnologyProduct>();
        allAsList.addAll(all);
        return ok(views.html.index.render(allAsList));
    }

    public static Result details(String id) {
//        TechnologyProduct product = TechnologyProduct.findById(id);
//        return ok(views.html.index.render(product));
        return TODO;
    }

}
