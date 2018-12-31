package com.rchii.stock.service;

import java.util.List;

import com.rchii.stock.entities.Produit;

public interface IProduitService {

	List<Produit> getProduits();
	
	void addProduit(Produit prd);
	
	void updateProduit(Produit prd);
	
	void deleteProduit(String ref);
	
}
