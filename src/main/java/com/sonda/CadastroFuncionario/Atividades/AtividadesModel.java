package com.sonda.CadastroFuncionario.Atividades;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividades")
public class AtividadesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAtividade;
    private double salario;


}
