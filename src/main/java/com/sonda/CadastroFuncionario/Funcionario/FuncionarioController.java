package com.sonda.CadastroFuncionario.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class FuncionarioController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem Vindo as sistema de cadastro";
    }
}
