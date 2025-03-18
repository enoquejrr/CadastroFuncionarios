package com.sonda.CadastroFuncionario.Funcionario;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem Vindo as sistema de cadastro";
    }

    @PostMapping("/cadastrar")
    public FuncionarioModel cadastrarFuncionario(@RequestBody FuncionarioModel funcionarioModel){
        return funcionarioService.cadastrarFuncionario(funcionarioModel);
    }

    @GetMapping("/visualizar")
    public List<FuncionarioModel> visualizarFuncionario(){
        return funcionarioService.visualizarFuncionario();
    }

    @GetMapping("/visualizarid/{id}")
    public FuncionarioModel alterarFuncionarioPorId(@PathVariable Long id){
        return funcionarioService.visualizarFuncionarioPorId(id);
    }


    @PutMapping("/alterarid/{id}")
    public String alterarFuncionarioPorId(){
        return "Alterando funcionario por id!";
    }

    @DeleteMapping("/deletar")
    public String deletarFuncionarioPorId(){
        return "Deletando funcionario por id!";
    }
}
