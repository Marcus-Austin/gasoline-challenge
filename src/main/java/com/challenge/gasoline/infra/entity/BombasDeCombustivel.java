package com.challenge.gasoline.infra.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bombas_de_combustivel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BombasDeCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "combustivel_id", nullable = false)
    private TiposDeCombustivel tiposDeCombustivel;

}
