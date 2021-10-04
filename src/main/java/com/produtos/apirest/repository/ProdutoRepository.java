package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;

//Para melhorar muito a vida do desenvolverdor no dia a dia
//pq o JPARepository já possui a implementação de diversos metodos de persistencia  find, findAll, save, delete


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	
	//metodo otimizado
	Produto findById(long id);

}
