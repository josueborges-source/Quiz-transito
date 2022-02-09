package com.james.Aplicacao.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.Aplicacao.Modelo.Questao;
import com.james.Aplicacao.Repositorio.IQuestaoDao;


@RestController
@RequestMapping("retornaString/")
public class Controlador {
	
	@Autowired 
	IQuestaoDao questaoDao;
	
	@RequestMapping("/")
    public Questao returnObjectInBrowser() {
		Questao questao = new Questao(null, null, null, null, null, 'a');

        return questao;
    }
	
    @GetMapping(path = "/{id}", produces = "application/json")
	public String retornaUm(@PathVariable String id)
    {
		
    	return id;
	}
    

    @GetMapping(path = "/RetornaQuestaoAleatoria", produces = "application/json")
	public Questao retornarQuestaoAleatoria()
    {
    	Random rand = new Random();
    	int quantidadeDeQuestoes = (int) questaoDao.count();
    	int int_random = 164;   
    	//int int_random = rand.nextInt(quantidadeDeQuestoes);     	
    	
    	System.out.print("\nQuantidade de questões: " + quantidadeDeQuestoes);
    	System.out.print("\nInteiro selecionado: " + int_random + "\n");
    	
		Questao questao = questaoDao.findById(Long.valueOf(int_random)).get();
    	return questao;    	
	}
    

    @PostMapping(path = "/questao", produces = "application/json")
	public Questao retornaUm(@ModelAttribute("questao") Questao questao)
    {
		System.out.println(questao);
    	return questao;
	}

}
