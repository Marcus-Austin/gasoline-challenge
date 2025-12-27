package com.challenge.gasoline.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.challenge.gasoline.infra.entity.Abastecimento;
import com.challenge.gasoline.infra.entity.BombasDeCombustivel;
import com.challenge.gasoline.infra.repository.AbastecimentoRepository;
import com.challenge.gasoline.infra.repository.BombasDeCombustivelRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AbastecimentoService {

    private final AbastecimentoRepository abastecimentoRepostory;
    private final BombasDeCombustivelRepository bombaDeCombustivelService;

    public void abastecer(Integer idBomba, Long litros){
        BombasDeCombustivel bomba =  bombaDeCombustivelService.buscarBombaCombustivelPorId(idBomba);
        BigDecimal valorTotal = bomba.getTiposDeCombustivel()
                .getPrecoPorLitro().multiply(BigDecimal.valueOf(litros));

        Abastecimento abastecimento = Abastecimento.builder()
                .dataAbastecimento(LocalDate.now())
                .bombasDeCombustivel(bomba)
                .valorTotal(valorTotal)
                .quantidadeLitros(litros)
                .build();

        abastecimentoRepostory.save(abastecimento);
    }

    public List<Abastecimento> buscarAbastecimentos(){
       return abastecimentoRepostory.findAll();
    }
}
