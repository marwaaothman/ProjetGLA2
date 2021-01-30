package tn.essat.controller;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tn.essat.dao.ILivreDao;
import tn.essat.model.Livre;



 

@Controller
public class AppController {
    
    @Autowired
    private ILivreDao daol;
    
   
    
    public void setDaop(ILivreDao daop) {
        this.daol = daol;
    }
    
    @GetMapping("/")
    public String get1(Model m) {
        List<Livre> liste= daol.findAll();
        m.addAttribute("liste", liste);
        return "accueil";
    }
 
    
    @GetMapping("/ajoutLivre")
    public String get3(Model m) {
        Livre l= new Livre();
        m.addAttribute("l",l);
        return "FormAdd";
    }
    @PostMapping("/saveProduit")
    public String get4(Model m, @ModelAttribute("l") Livre l) {
        daol.save(l);
        return "redirect:/";
    }
    
    
    }