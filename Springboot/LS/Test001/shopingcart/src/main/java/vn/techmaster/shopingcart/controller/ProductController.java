package vn.techmaster.shopingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import vn.techmaster.shopingcart.model.ProductRequest;
import vn.techmaster.shopingcart.repository.ProductRepository;
import vn.techmaster.shopingcart.service.CartService;
import vn.techmaster.shopingcart.service.ProductService;

@Controller
public class ProductController {
  @Autowired private ProductRepository productRepository;
  @Autowired private CartService cartService;
  @Autowired private ProductService prodService;

  @GetMapping("/")
  public String showHomePage(HttpSession session, Model model) {
    model.addAttribute("products", productRepository.findAll());
    model.addAttribute("cartCount", cartService.countItemInCart(session));
    return "index";
  }

  @GetMapping("/buy/{id}")
  public String buy(@PathVariable(name = "id") Long id, HttpSession session, Model model) {
    cartService.addToCart(id, session);
    return "redirect:/";
  }

  @GetMapping("/checkout")
  public String checkout(HttpSession session, Model model) {
    model.addAttribute("cart", cartService.getCart(session));
    return "checkout";
  }

  @GetMapping("/add")
  public String upload(HttpSession session, Model model) {
    model.addAttribute("newProduct", new ProductRequest());
    model.addAttribute("cart", cartService.getCart(session));
    return "upload";
  } 

  @PostMapping("/add")
  public String addProduct( @ModelAttribute(name="newProduct") ProductRequest newProduct,BindingResult bindingResult, HttpSession session, Model model) {
    productRepository.save(prodService.saveProduct(newProduct));
   return showHomePage(session, model);
  } 
}
