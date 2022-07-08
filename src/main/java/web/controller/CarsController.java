package web.controller;

import DAO.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/cars")
@ComponentScan("DAO")
public class CarsController {

    private CarDAO carDAO;

    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String showAll(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", carDAO.showAll(count));
        return "cars";

    }


}