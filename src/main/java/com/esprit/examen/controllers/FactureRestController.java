package com.esprit.examen.controllers;

import java.util.Date;
import java.util.List;

import com.esprit.examen.entities.DTOS.FactureDTO;
import com.esprit.examen.entities.DTOS.ProduitDTO;
import com.esprit.examen.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.esprit.examen.entities.Facture;
import com.esprit.examen.services.IFactureService;

import io.swagger.annotations.Api;


@RestController
@Api(tags = "Gestion des factures")
@RequestMapping("/facture")
@CrossOrigin("*")
public class FactureRestController {

    @Autowired
    IFactureService factureService;

    // http://localhost:8089/SpringMVC/facture/retrieve-all-factures
    @GetMapping("/retrieve-all-factures")
    @ResponseBody
    public List<Facture> getFactures() {

        return factureService.retrieveAllFactures();
    }

    // http://localhost:8089/SpringMVC/facture/retrieve-facture/8
    @GetMapping("/retrieve-facture/{facture-id}")
    @ResponseBody
    public Facture retrieveFacture(@PathVariable("facture-id") Long factureId) {
        return factureService.retrieveFacture(factureId);
    }


    @PostMapping("/add-facture")
    @ResponseBody
    public Facture addFacture(@RequestBody FactureDTO f) {
        Facture facture = f.toEntity();
        return factureService.addFacture(facture);
    }
}

