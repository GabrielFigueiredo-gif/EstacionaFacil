package com.estaciona.smart.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "veiculo")
@Entity(name = "Veiculo")
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private LocalDate horarioEntrada;
    private LocalDate horarioSaida;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "id_vaga")
    private Vaga vaga;

    public Veiculo(Long id, String marca, String modelo, String placa, LocalDate horarioEntrada, LocalDate horarioSaida, Vaga vaga) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.vaga = vaga;
    }

}
