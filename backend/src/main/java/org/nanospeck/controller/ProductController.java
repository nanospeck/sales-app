package org.nanospeck.controller;

import org.nanospeck.common.dto.ProductDTO;
import org.nanospeck.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {

	// @RequestMapping(value="/{name}", method = RequestMethod.GET)
	// public String getMovie(@PathVariable String name, ModelMap model) {
	//
	// model.addAttribute("movie", name);
	// return "list";
	//
	// }
	@Autowired
	ProductService productService;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ModelAndView getMovie(@PathVariable String name, ModelMap model) {
		ProductDTO pd = productService.getProduct(12);
		model.addAttribute("movie", name);
		return new ModelAndView("highScoresView",
				BindingResult.MODEL_KEY_PREFIX + "applications", pd.getName());

	}

	//
	// /**
	// * @return Fetch all registered applications in the highscore database.
	// */
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public ModelAndView getAllApplications() {
	// List<String> allApplications = highScoresService.getAllApplications();
	// return new ModelAndView("highScoresView", BindingResult.MODEL_KEY_PREFIX
	// + "applications", allApplications);
	// }

}