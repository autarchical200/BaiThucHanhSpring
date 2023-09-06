package vn.edu.pxu.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import vn.edu.pxu.model.Product;
import vn.edu.pxu.services.ProductService;

@Controller
public class ProductController {
   
	public ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/ProductsList")
	public String productList(Model model) {
		List<Product> products = this.productService.getAllProducts();
		model.addAttribute("products", products);
		return "ProductsList";
	}

	@GetMapping("/Add")
	public String addProductForm(Model model) {
		model.addAttribute("product", new Product());
		return "Add";
	}

	@PostMapping("/Add")
	public String addProduct(@ModelAttribute("product") Product product) {
		productService.addProduct(product);
		return "redirect:/ProductsList";
	}

	@RequestMapping(value = "/Detail/{id}", method = RequestMethod.GET)
	public String productDetail(@PathVariable Integer id, Model model) {
	    Product product = productService.getProductById(id);
	    model.addAttribute("product", product);
	    return "Detail";
	}


}
