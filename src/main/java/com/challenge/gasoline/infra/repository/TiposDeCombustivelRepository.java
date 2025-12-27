package com.challenge.gasoline.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.gasoline.infra.entity.TiposDeCombustivel;

public interface TiposDeCombustivelRepository extends JpaRepository<TiposDeCombustivel, Integer> {

}
