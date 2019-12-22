package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Merma;

public interface MermaService extends GenericService<Merma> {

    Merma registrarMerma(Merma m);

    int eliminarMerma(Merma m);

    List<Merma> listarMermaFechas(Merma m);

}
