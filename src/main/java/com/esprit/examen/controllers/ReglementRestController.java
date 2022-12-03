package com.esprit.examen.controllers;

import java.util.Date;
import java.util.List;


import com.esprit.examen.entities.DTOS.ReglementDTO;
import com.esprit.examen.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.esprit.examen.entities.Reglement;
import com.esprit.examen.services.IReglementService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = "Gestion des reglements")
@RequestMapping("/reglement")
@CrossOrigin("*")
public class ReglementRestController {

    @Autowired
    IReglementService reglementService;


    // http://localhost:8089/SpringMVC/reglement/add-reglement
    @PostMapping("/add-reglement")
    @ResponseBody
<<<<<<< HEAD
    public Reglement addReglement(@RequestBody ReglementDTO r) {

        Reglement reglement=r.toEntity();

        return reglementService.addReglement(reglement);
=======
    public Reglement addReglement(@RequestBody Reglement r) {

        return reglementService.addReglement(r);
>>>>>>> cbcfd6bc0d6f692138386e9adff9452576442cd3
    }
    @GetMapping("/retrieve-all-reglements")
    @ResponseBody
    public List<Reglement> getReglement() {

        return reglementService.retrieveAllReglements();
    }

    @GetMapping("/retrieve-reglement/{reglement-id}")
    @ResponseBody
    public Reglement retrieveReglement(@PathVariable("reglement-id") Long reglementId) {
        return reglementService.retrieveReglement(reglementId);
    }

    // http://localhost:8089/SpringMVC/reglement/retrieveReglementByFacture/8
    @GetMapping("/retrieveReglementByFacture/{facture-id}")
    @ResponseBody
    public List<Reglement> retrieveReglementByFacture(@PathVariable("facture-id") Long factureId) {
        return reglementService.retrieveReglementByFacture(factureId);
    }

<<<<<<< HEAD

=======
>>>>>>> cbcfd6bc0d6f692138386e9adff9452576442cd3
    @GetMapping(value = "/getChiffreAffaireEntreDeuxDate/{startDate}/{endDate}")
    public float getChiffreAffaireEntreDeuxDate(
            @PathVariable(name = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
            @PathVariable(name = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        try {
            return reglementService.getChiffreAffaireEntreDeuxDate(startDate, endDate);
        } catch (Exception e) {
            return 0;
        }
    }
}
