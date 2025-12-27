package com.challenge.gasoline.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.gasoline.infra.entity.BombasDeCombustivel;

public interface BombasDeCombustivelRepository extends JpaRepository<BombasDeCombustivel, Integer> {

}
