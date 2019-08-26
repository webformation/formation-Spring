/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre.service;

import gestionlivre.Categorie;
import gestionlivre.Langue;
import gestionlivre.Livre;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public interface ServiceLivre {

    List<Langue> getLangues();

    List<Categorie> getCategories();

    boolean addLivre(Livre l);

    boolean delLivre(Livre l);

    List<Livre> getLivres();

    Langue getLangue(int index);

    Categorie getCategorie(int index);

}
