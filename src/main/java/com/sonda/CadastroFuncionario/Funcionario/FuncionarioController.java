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
    public FuncionarioModel visualizarFuncionarioPorId(@PathVariable Long id){
        return funcionarioService.visualizarFuncionarioPorId(id);
    }


    @PutMapping("/alterarid/{id}")
    public FuncionarioModel alterarFuncionarioPorId(@PathVariable Long id, @RequestBody FuncionarioModel funcionarioAtualizado){
        return funcionarioService.alterarFuncionarioPorId(id, funcionarioAtualizado);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarFuncionarioPorId(@PathVariable Long id){
        funcionarioService.deletarFuncionario(id);
    }
}
