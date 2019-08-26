/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre.controller;

import gestionlivre.Categorie;
import gestionlivre.Langue;
import gestionlivre.Livre;
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

    @RequestMapping(value = "/formLivre", method = RequestMethod.GET)
    public ModelAndView livre() {
        Livre l = new Livre();
        l.setTitre("Spring");
        ModelAndView mav = new ModelAndView("livre", "command", l);
        List<Categorie> listeCategorie = new ArrayList<Categorie>();
        Categorie categorie = new Categorie();
        categorie.setCategorieId(1);
        categorie.setCategorieNom("Roman");
        listeCategorie.add(categorie);
        mav.getModelMap().addAttribute("categorieList",listeCategorie);
        List<Langue> listeLangue = new ArrayList<Langue>();
        Langue langue = new Langue();
        langue.setLangueId(1);
        langue.setLangueNom("Français");
        listeLangue.add(langue);
        mav.getModelMap().addAttribute("langueList", listeLangue);
        return mav;
    }

    @RequestMapping(value = "/ajoutLivre", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Livre livre, ModelMap model) {
        return "livreajoute";
    }

}
