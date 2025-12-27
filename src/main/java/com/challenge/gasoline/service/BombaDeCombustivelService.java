package com.challenge.gasoline.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.challenge.gasoline.infra.entity.BombasDeCombustivel;
import com.challenge.gasoline.infra.repository.BombasDeCombustivelRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {

    private final BombasDeCombustivelRepository bombaDeCombustiveRepostory;

    public void criar(BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustiveRepostory.save(bombasDeCombustivel);
    }

    public BombasDeCombustivel buscarBombaCombustivelPorId(Integer id){
        return bombaDeCombustiveRepostory.findById(id).orElseThrow(() ->
                new NullPointerException("Bomba de combustível não encontrada pelo id" + id));
    }

    public List<BombasDeCombustivel> buscarBombasDeCombustivel(){
        return bombaDeCombustiveRepostory.findAll();
    }

    @Transactional
    public void deletarBombaCombustivel(Integer id){
        bombaDeCombustiveRepostory.deleteById(id);
    }

    public void alterarBombaCombustivel(Integer id, BombasDeCombustivel bombasDeCombustivel){
        BombasDeCombustivel bomba = buscarBombaCombustivelPorId(id);
        bombasDeCombustivel.setId(bomba.getId());
        bombaDeCombustiveRepostory.save(bombasDeCombustivel);
    }

}