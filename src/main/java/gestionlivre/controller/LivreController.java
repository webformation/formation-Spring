/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre.controller;

import gestionlivre.Categorie;
import gestionlivre.Langue;
import gestionlivre.Livre;
import gestionlivre.service.ServiceLivre;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class LivreController {
    private ServiceLivre sl;

    public void setSl(ServiceLivre sl) {
        this.sl = sl;
    }

    public ServiceLivre getSl() {
        return sl;
    }

    @RequestMapping(value = "/formLivre", method = RequestMethod.GET)
    public ModelAndView livre() {
        Livre l = new Livre();
        l.setTitre("Spring");
        ModelAndView mav = new ModelAndView("livre", "command", l);
        mav.getModelMap().addAttribute("categorieList",sl.getCategories());
        mav.getModelMap().addAttribute("langueList", sl.getLangues());
        return mav;
    }

    @RequestMapping(value = "/ajoutLivre", method = RequestMethod.POST)
    public String ajoutLivre(@ModelAttribute("SpringWeb") Livre livre, ModelMap model) {
        model.addAttribute("titre", livre.getTitre());
        model.addAttribute("auteur", livre.getAuteur());

        List<String> l = new ArrayList<String>();
        for (int index: livre.getCategories()) {
            l.add(sl.getCategorie(index).getCategorieNom());
        }
        model.addAttribute("caterories",l );
        
        model.addAttribute("langue", sl.getLangue(livre.getLangue()).getLangueNom());
        sl.addLivre(livre);
        return "livreajoute";
    }

}
