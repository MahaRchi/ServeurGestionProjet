package com.rchii.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rchii.stock.entities.Produit;

@Service
public class ProduitMockServiceImpl implements IProduitService{
	
	private List<Produit> produits;
	
	public ProduitMockServiceImpl(){
		produits = new ArrayList<Produit>();
		produits.add(new Produit("livre",50,20));
		produits.add(new Produit("cahier",200,5.25f));
		produits.add(new Produit("stylo",500,2.10f));
		
	}
	
	@Override
	public List<Produit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit prd) {
	
		produits.add(prd);
	}

	@Override
	public void updateProduit(Produit prd) {
		
		produits.remove(prd);
		produits.add(prd);
		
	}

	@Override
	public void deleteProduit(String ref) {
	
		Produit p = new Produit();
		p.setRef(ref);
		produits.remove(p);
		
	}

}
