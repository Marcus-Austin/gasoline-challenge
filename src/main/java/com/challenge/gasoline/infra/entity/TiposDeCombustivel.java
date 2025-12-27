package com.challenge.gasoline.infra.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipos_de_combustivel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TiposDeCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;
    @Column(name = "preco_por_litro", nullable = false)
    private BigDecimal precoPorLitro;
}
