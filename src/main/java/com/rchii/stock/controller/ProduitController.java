package com.rchii.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rchii.stock.entities.Produit;
import com.rchii.stock.service.IProduitService;

@RestController
@RequestMapping("api/produit")
@CrossOrigin
public class ProduitController {

	@Autowired
	private IProduitService produitService;
	
	@GetMapping
	public List<Produit> getProduit(){
		
		return produitService.getProduits();
	}
	
	@PostMapping
	public void addProduit(@RequestBody Produit prd)
	{
		produitService.addProduit(prd);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit prd)
	{
		produitService.updateProduit(prd);
	}
	
	@DeleteMapping("/{ref}")
	public void deleteProduit(@PathVariable String ref)
	{
		produitService.deleteProduit(ref);
	}
}
