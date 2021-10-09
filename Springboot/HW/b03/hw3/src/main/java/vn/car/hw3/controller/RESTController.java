package vn.car.hw3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired CarRepo carRepo;

    @GetMapping("/home")
    public ResponseEntity<List<Car>> gethome() {
        return ResponseEntity.ok().body(carRepo.getAllCar());
    }

      @PostMapping(path = "/home", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void postCar(Car car) {
     carRepo.add(car);
    }

    @PostMapping("/add")
    public String addCar(Car addingRequest,BindingResult bindingResult,Model model) {
        if (!bindingResult.hasErrors()) {
            carRepo.addCar(addingRequest);
        }
    
 
        return gethome(model);
    }

    @GetMapping("/visible")
    public String showMenu(Model model) {
        model.addAttribute("clicked", true);
        return gethome(model);
    }

    @GetMapping("/edit")
    public String showEditor(Model model) {
        model.addAttribute("showEditor", true);
        model.addAttribute("editRequest", new Car());
        model.addAttribute("clicked", true);
        return gethome(model);
    }

    @PostMapping("/edit")
    public String edit(Car editRequest,BindingResult bindingResult,Model model) {
        if (!bindingResult.hasErrors()) {
         
                carRepo.updateCar(editRequest);
           
           
        }
    
 
        return gethome(model);
       
     

    }
    @GetMapping("/delete")
    public String deleteRequest(Model model) {
        model.addAttribute("showDeleteConfirm", true);
        model.addAttribute("clicked", true);
        return gethome(model);
    }

    @PostMapping("/delete")
    public String delete (@ModelAttribute DeleteRequest deleteRequest,BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
         
            carRepo.deleteCar(carRepo.getById(deleteRequest.getId()));
       
       
    }
        return gethome(model);
    }
    @GetMapping("/search")
    public String searchRequest(Model model) {
        model.addAttribute("showSearchBar", true);
        model.addAttribute("searchRequest", new SearchRequest());
        return gethome(model);
    }
    @PostMapping("/search")
    public String searchRequest(@ModelAttribute SearchRequest searchRequest,BindingResult bindingResult,Model model) {
        model.addAttribute("showSearchBar", true);
        model.addAttribute("searchRequest", searchRequest);
        model.addAttribute("cars", carRepo.searchList(searchRequest.getKeyword()));
        return "index";
    }
}
