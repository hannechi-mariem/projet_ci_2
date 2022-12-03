package com.esprit.examen.controllers;


import java.util.List;

import com.esprit.examen.entities.DTOS.ProduitDTO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import com.esprit.examen.entities.Produit;
import com.esprit.examen.services.IProduitService;

import io.swagger.annotations.Api;


@RestController
@CrossOrigin("*")
@Api(tags = "Gestion des produits")
@RequestMapping("/produit")
public class ProduitRestController {

	@Autowired
	IProduitService produitService;

	// http://localhost:8089/SpringMVC/produit/retrieve-all-produits
	@GetMapping("/retrieve-all-produits")
	@ResponseBody
	public List<Produit> getProduits() {
<<<<<<< HEAD

=======
>>>>>>> cbcfd6bc0d6f692138386e9adff9452576442cd3
		return produitService.retrieveAllProduits();
	}


	@GetMapping("/retrieve-produit/{produit-id}")
	@ResponseBody
	public Produit retrieveRayon(@PathVariable("produit-id") Long produitId) {
		return produitService.retrieveProduit(produitId);
	}

<<<<<<< HEAD

	@PostMapping("/add-produit")
	@ResponseBody
	public Produit addProduit(@RequestBody ProduitDTO
										  p) {
		Produit produit=p.toEntity();
		return produitService.addProduit(produit);
	}


=======
	/* Ajouter en produit tout en lui affectant la catégorie produit et le stock associés */
	@PostMapping("/add-produit")
	@ResponseBody
	public Produit addProduit(@RequestBody Produit p) {

		return produitService.addProduit(p);
	}

>>>>>>> cbcfd6bc0d6f692138386e9adff9452576442cd3
	@DeleteMapping("/remove-produit/{produit-id}")
	@ResponseBody
	public void removeProduit(@PathVariable("produit-id") Long produitId) {
		produitService.deleteProduit(produitId);
	}

<<<<<<< HEAD

=======
>>>>>>> cbcfd6bc0d6f692138386e9adff9452576442cd3
	@PutMapping("/modify-produit")
	@ResponseBody
	public Produit modifyProduit(@RequestBody ProduitDTO p) {

		Produit produit=p.toEntity();
		return produitService.updateProduit(produit);
	}

	/*
	 * Si le responsable magasin souhaite modifier le stock du produit il peut
	 * le faire en l'affectant au stock en question
	 */
	// http://localhost:8089/SpringMVC/produit/assignProduitToStock/1/5
	@PutMapping(value = "/assignProduitToStock/{idProduit}/{idStock}")
	public void assignProduitToStock(@PathVariable("idProduit") Long idProduit, @PathVariable("idStock") Long idStock) {
		produitService.assignProduitToStock(idProduit, idStock);
	}

<<<<<<< HEAD
=======

>>>>>>> cbcfd6bc0d6f692138386e9adff9452576442cd3

}
