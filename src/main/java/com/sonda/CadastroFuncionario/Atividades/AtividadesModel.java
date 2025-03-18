package com.sonda.CadastroFuncionario.Atividades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sonda.CadastroFuncionario.Funcionario.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_atividades")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AtividadesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAtividade;
    private double salario;

    @OneToMany(mappedBy = "atividades")
    @JsonIgnore
    private List<FuncionarioModel> funcionario;


}
