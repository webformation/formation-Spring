/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre.controller;

import gestionlivre.Livre;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class LivreController {
  
   
    @RequestMapping(value = "/formLivre", method = RequestMethod.GET)
    public ModelAndView livre() {
        Livre l = new Livre();
        l.setTitre("Spring");
        return new ModelAndView("livre", "command",l);
    }
    @RequestMapping(value = "/ajoutLivre", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Livre livre, ModelMap model) {
        return "livreajoute";
    }

}
