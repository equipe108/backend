package br.com.lavaJato.rest;

import br.com.lavaJato.model.Carro;
import br.com.lavaJato.model.Cliente;
import br.com.lavaJato.service.CarroService;
import br.com.lavaJato.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@Api(value = "API REST LAVA JATO")
@CrossOrigin(origins = "*")
public class ClienteRest {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private  CarroService carroService;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de clientes")
    public List<Cliente> listarClientes() {
        return clienteService.findAll();
    }

    @GetMapping("/{idCliente}")
    @ApiOperation(value = "Retorna um cliente especifico pelo ID")
    public Cliente detalharCliente(@Valid @PathVariable long idCliente) {
        return clienteService.findById(idCliente);
    }

    @PostMapping
    @ApiOperation(value = "salva um cliente")
    public void incluirClientes(@Valid @RequestBody Cliente cliente) {
        clienteService.save(cliente);
    }
    
    @DeleteMapping("/{idCliente}")
    @ApiOperation(value = "Exclui um cliente especifico pelo ID")
    public void excluirCliente(@Valid @PathVariable long idCliente) {
        clienteService.delete(idCliente);
    }

    @PatchMapping
    @ApiOperation(value = "Altera os dados de um cliente especifico")
    public Cliente alterarCliente(@Valid @RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }
    
    @GetMapping("/cpf/{cpf}")
    public boolean verificarCPF(@PathVariable String cpf) {
    	Cliente cliente = clienteService.findUserByCPF(cpf);
    	if(cliente == null) {
    		return false;
    	}else {
    		return true;
    	}
    }


}
