package br.rebels.finalwork.letscode_rebels.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;

@Getter
@Setter
public class RebelsEntity {

    private Long id;
    private String nome;
    private Integer idade;
    private LocalDate dataNascimento;
    private String genero;
    private RebelsLocalization localizacao;
    private RebelsInventory inventory;

//    public RebelsEntity(Long id,
//                        String nome,
//                        Integer idade,
////                        LocalDate dataNascimento,
//                        RebelsLocalization localizacao,
//                        RebelsInventory rebelsInventory
//                        ){
//
//        this.id = id;
//        this.nome = nome;
//        this.idade = idade;
////        this.dataNascimento = dataNascimento;
//        this.localizacao = localizacao;
//        this.inventory = rebelsInventory;

    //}
}
