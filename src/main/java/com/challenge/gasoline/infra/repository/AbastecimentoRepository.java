package com.challenge.gasoline.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.gasoline.infra.entity.Abastecimento;

public interface AbastecimentoRepository extends JpaRepository <Abastecimento, Integer> {

}
