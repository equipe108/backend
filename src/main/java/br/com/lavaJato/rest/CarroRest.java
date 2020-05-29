package br.com.lavaJato.rest;

import br.com.lavaJato.model.Carro;
import br.com.lavaJato.model.Cliente;
import br.com.lavaJato.service.CarroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/carros")
@Api(value = "API REST LAVA JATO")
@CrossOrigin(origins = "*")
public class CarroRest {

    @Autowired
    private CarroService carroService;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de carros")
    public List<Carro> listarClientes() {
        return carroService.findAll();
    }

    @GetMapping("/{idCarro}")
    @ApiOperation(value = "Retorna um cliente especifico pelo ID")
    public Carro detalharCliente(@Valid @RequestParam long idCarro) {
        return carroService.findById(idCarro);
    }

    @PostMapping
    @ApiOperation(value = "salva um carro de um cliente")
    public Carro incluirCarros(@RequestBody Carro carro) {
        return carroService.save(carro);
    }

    @PatchMapping
    @ApiOperation(value = "Altera os dados de um carro")
    public Carro alterarCarro(@RequestBody Carro carro) {
        return carroService.save(carro);
    }

    @DeleteMapping(("/{idCarro}"))
    @ApiOperation(value = "Exclui um carro especifico pelo ID")
    public void excluirCarro(@PathVariable long idCarro) {
        carroService.delete(idCarro);
    }
}
