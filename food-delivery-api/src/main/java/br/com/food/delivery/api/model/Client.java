package br.com.food.delivery.api.model;

import java.io.Serializable;

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long clientId;
    private String name;
    private String cpf;

    public Client() {}

    public Client(Long clientId, String name, String cpf) {
        this.clientId = clientId;
        this.name = name;
        this.cpf = cpf;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
