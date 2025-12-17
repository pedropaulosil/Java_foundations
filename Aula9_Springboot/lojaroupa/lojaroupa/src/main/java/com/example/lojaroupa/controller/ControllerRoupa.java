package com.example.lojaroupa.controller;

import org.springframework.web.bind.annotation.*;

// Identificar que essa classe é um Controller - responsável por receber as requisições em http
// Rest - API rest

// Funcionamento da API REST - Usa metodos do protocolo HTTP para definir ações.
// Metodo GET - Busca Dados
// Metodo POST - Criar Dados
// PUT - Atualizar
// DELETE - Excluir dados

//Define a URL do Controller
//Nosso controle terá seguinte endpoint
//http/localhost:8080/roupas
@RestController
@RequestMapping("/roupas")
//Liberar Acesso
@CrossOrigin(origins = "*")
public class ControllerRoupa {

   @PostMapping
    public void cadastrarRoupa(@RequestBody String roupa){
       System.out.println(roupa);

   }


}
