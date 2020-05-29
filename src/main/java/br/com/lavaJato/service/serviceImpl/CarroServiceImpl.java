package br.com.lavaJato.service.serviceImpl;

import br.com.lavaJato.model.Carro;
import br.com.lavaJato.model.Cliente;
import br.com.lavaJato.repository.CarroRepository;
import br.com.lavaJato.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    CarroRepository carroRepository;

    @Override
    public Carro save(Carro carro) {
        return carroRepository.save(carro);
    }

    @Override
    public void delete(long idCarro) {
        carroRepository.deleteById(idCarro);
    }

    @Override
    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    @Override
    public Carro findById(long idCarro) {
        return carroRepository.findById(idCarro).get();
    }


}
