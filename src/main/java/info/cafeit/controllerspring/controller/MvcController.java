package info.cafeit.controllerspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {

    @GetMapping(value = "/controller1")
    public String model(Model model) {
        model.addAttribute("modeType", "Model");
        model.addAttribute("variable", "Happy leaning =))");
        //return view resolver name
        return "index";
    }

    @GetMapping(value = "/controller2")
    public ModelAndView modelAndView() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("modeType", "ModelAndView");
        mv.addObject("variable", "Happy leaning =))");
        //return ModelAndView
        return mv;
    }

    @GetMapping(value = "/controller3")
    public String modelMap(ModelMap model) {
        model.addAttribute("modeType", "ModelMap");
        model.addAttribute("variable", "Happy leaning =))");
        //return view resolver name
        return "index";
    }

    //Khi gắn annotation @ResponseBody thì spring sẽ tự động jackson thành data message
    @GetMapping(value = "/rest-controller5")
    @ResponseBody
    public String restController5() {
        return "{ \"Status\" : \"OK\"}";
    }

}
