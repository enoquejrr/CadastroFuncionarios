package com.sonda.CadastroFuncionario.Atividades;

import com.sonda.CadastroFuncionario.Funcionario.FuncionarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_atividades")
public class AtividadesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAtividade;
    private double salario;

    @OneToMany(mappedBy = "atividades")
    private List<FuncionarioModel> funcionario;


}
