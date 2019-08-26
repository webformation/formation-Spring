/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre.service;

import gestionlivre.Categorie;
import gestionlivre.Langue;
import gestionlivre.Livre;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrateur
 */

public class ServiceLivreImpl implements ServiceLivre {

    @Override
    public List<Langue> getLangues() {
       List<Langue> listeLangue = new ArrayList<Langue>();
        Langue langue = new Langue();
        langue.setLangueId(1);
        langue.setLangueNom("Français");
        listeLangue.add(langue);
        Langue langue1 = new Langue();
        langue1.setLangueId(2);
        langue1.setLangueNom("Anglais"); 
        listeLangue.add(langue1);
        return listeLangue;
   }

    @Override
    public List<Categorie> getCategories() {
                List<Categorie> listeCategorie = new ArrayList<Categorie>();
        Categorie categorie = new Categorie();
        categorie.setCategorieId(1);
        categorie.setCategorieNom("Roman");
        listeCategorie.add(categorie);
        Categorie categorie1 = new Categorie();
        categorie1.setCategorieId(2);
        categorie1.setCategorieNom("Histoire");
        listeCategorie.add(categorie1);
        return listeCategorie;
    }

    @Override
    public boolean addLivre(Livre l) {
        return true;
    }

    @Override
    public boolean delLivre(Livre l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Livre> getLivres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Langue getLangue(int index) {
        Langue langue = new Langue();
        langue.setLangueId(1);
        langue.setLangueNom("Français");
        return langue;
    }

    @Override
    public Categorie getCategorie(int index) {
                Categorie categorie = new Categorie();
        categorie.setCategorieId(1);
        categorie.setCategorieNom("Roman");
        return categorie;
    }
    
}
