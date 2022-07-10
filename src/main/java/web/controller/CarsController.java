package web.controller;
import web.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private Service service;

    @Autowired
    public CarsController(Service service) {
        this.service = service;
    }

    @GetMapping()
    public String showAll(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", service.showAll(count));
        return "cars";

    }


}