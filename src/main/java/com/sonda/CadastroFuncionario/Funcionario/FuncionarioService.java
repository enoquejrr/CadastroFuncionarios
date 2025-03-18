package com.sonda.CadastroFuncionario.Funcionario;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<FuncionarioModel> visualizarFuncionario(){
        return funcionarioRepository.findAll();
    }
}
