package br.com.lavaJato.service.serviceImpl;

import br.com.lavaJato.model.Carro;
import br.com.lavaJato.model.Cliente;
import br.com.lavaJato.repository.ClienteRepository;
import br.com.lavaJato.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(long idCliente) {
        return clienteRepository.findById(idCliente).get();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void delete(long idCliente) {
        clienteRepository.deleteById(idCliente);
    }

	@Override
	public Cliente findUserByCPF(String cpf) {
		// TODO Auto-generated method stub
		return clienteRepository.findUserByCPF(cpf);
	}
    

}
