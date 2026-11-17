package com.estaciona.smart.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Vaga {
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoVaga tipo;
    private String status;

    public Vaga(String nome, TipoVaga tipo, String status) {
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
    }
}
