package com.sonda.CadastroFuncionario.Atividades;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("atividades")
public class AtividadesController {

    @PostMapping("/cadastrar")
    public String cadastrarAtividade(){
        return "Atividade cadastrada!";
    }

    @GetMapping("/visualizar")
    public String visualizarAtividade(){
        return "Visualizando atividade!";
    }

    @GetMapping("/visualizarid")
    public String visualizarAtividadePorId(){
        return "Visualizando atividade por id!";
    }

    @PutMapping("/alterarid")
    public String alterarAtividadePorId(){
        return "Alterando atividade por id!";
    }

    @DeleteMapping("/deletar")
    public String deletarAtividadePorId(){
        return "Deletando atividade por id!";
    }

}
