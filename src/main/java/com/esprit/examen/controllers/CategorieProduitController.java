package com.esprit.examen.controllers;

import java.util.List;

import com.esprit.examen.entities.DTOS.CategorieProduitDTO;
import com.esprit.examen.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.services.ICategorieProduitService;
import io.swagger.annotations.Api;

@RestController
@Api(tags = "Gestion des categories Produit")
@RequestMapping("/categorieProduit")
public class CategorieProduitController {

	@Autowired
	ICategorieProduitService categorieProduitService;
	
	// http://localhost:8089/SpringMVC/categorieProduit/retrieve-all-categorieProduit
	@GetMapping("/retrieve-all-categorieProduit")
	@ResponseBody
	public List<CategorieProduit> getCategorieProduit() {
<<<<<<< HEAD

=======
>>>>>>> cbcfd6bc0d6f692138386e9adff9452576442cd3
		return categorieProduitService.retrieveAllCategorieProduits();
	}

	// http://localhost:8089/SpringMVC/categorieProduit/retrieve-categorieProduit/8
	@GetMapping("/retrieve-categorieProduit/{categorieProduit-id}")
	@ResponseBody
	public CategorieProduit retrieveCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
		return categorieProduitService.retrieveCategorieProduit(categorieProduitId);
	}

	// http://localhost:8089/SpringMVC/categorieProduit/add-categorieProduit
	@PostMapping("/add-categorieProduit")
	@ResponseBody
<<<<<<< HEAD
	public CategorieProduit addCategorieProduit(@RequestBody CategorieProduitDTO cp)
	{
		CategorieProduit categorieProduit=cp.toEntity();


		return categorieProduitService.addCategorieProduit(categorieProduit);
	}


=======
	public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp) {
		return categorieProduitService.addCategorieProduit(cp);
	}

>>>>>>> cbcfd6bc0d6f692138386e9adff9452576442cd3
	@DeleteMapping("/remove-categorieProduit/{categorieProduit-id}")
	@ResponseBody
	public void removeCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
		categorieProduitService.deleteCategorieProduit(categorieProduitId);
	}

	// http://localhost:8089/SpringMVC/categorieProduit/modify-categorieProduit
	@PutMapping("/modify-categorieProduit")
	@ResponseBody
	public CategorieProduit modifyCategorieProduit(@RequestBody CategorieProduitDTO categorieProduit)
	{
		CategorieProduit categorieProduit1=categorieProduit.toEntity();

		return categorieProduitService.updateCategorieProduit(categorieProduit1);
	}

	
}
