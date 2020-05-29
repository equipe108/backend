package br.com.lavaJato.service;

import br.com.lavaJato.model.Carro;
import br.com.lavaJato.model.Cliente;

import java.util.List;

public interface CarroService {
    Carro save(Carro carro);
    void delete(long idCarro);
    List<Carro> findAll();
    Carro findById(long idCarro);

}
