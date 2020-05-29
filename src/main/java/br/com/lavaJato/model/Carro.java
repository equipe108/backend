package br.com.lavaJato.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TB_CARROS")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_carro;

    private String marca;

    private String modelo;

    private String placa;

    private String cor;
    
    private String tamanho;
    
    @ManyToMany(mappedBy = "carros", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Cliente> cliente;
    

    public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Long getId_carro() {
        return id_carro;
    }

    public void setId_carro(Long id_carro) {
        this.id_carro = id_carro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
