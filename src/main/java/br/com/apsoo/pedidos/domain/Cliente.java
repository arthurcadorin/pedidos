package br.com.apsoo.pedidos.domain;

import br.com.apsoo.pedidos.domain.enumerations.TipoCliente;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
@Entity
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name = "seq_cliente")

public class Cliente implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CL_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_cliente")
    private Long id;

    @Column(name = "CL_NOME")
    private String nome;

    @Column(name = "CL_EMAIL")
    private String email;

    @Column(name = "CL_CPF_CNPJ")
    private String cfpOuCnpj;

    @Column(name = "CL_TIPO")
    private TipoCliente tipo;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "TB_TELEFONE")
    private Set<String> telefone = new HashSet<>();

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, String cfpOuCnpj, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cfpOuCnpj = cfpOuCnpj;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCfpOuCnpj() {
        return cfpOuCnpj;
    }

    public void setCfpOuCnpj(String cfpOuCnpj) {
        this.cfpOuCnpj = cfpOuCnpj;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(Set<String> telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
