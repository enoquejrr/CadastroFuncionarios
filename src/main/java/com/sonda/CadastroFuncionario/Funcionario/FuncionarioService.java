package com.sonda.CadastroFuncionario.Funcionario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<FuncionarioModel> visualizarFuncionario(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel visualizarFuncionarioPorId(Long id){
        Optional<FuncionarioModel> funcionarioModelOptinal = funcionarioRepository.findById(id);
        return funcionarioModelOptinal.orElse(null);
    }
}
