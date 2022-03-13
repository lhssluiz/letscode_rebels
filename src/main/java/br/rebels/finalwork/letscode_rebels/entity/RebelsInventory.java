package br.rebels.finalwork.letscode_rebels.entity;

import lombok.Data;

@Data
public class RebelsInventory {
    private Integer arma;
    private Integer municao;
    private Integer agua;
    private Integer comida;

    public RebelsInventory(Integer arma, Integer municao, Integer agua, Integer comida){

        this.arma = arma;
        this.municao = municao;
        this.agua = agua;
        this.comida = comida;

    }

}
