package com.sonda.CadastroFuncionario.Funcionario;
import com.sonda.CadastroFuncionario.Atividades.AtividadesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;
    private int telefone;

    @ManyToOne
    @JoinColumn(name = "atividades_id")
    private AtividadesModel atividades;

}
