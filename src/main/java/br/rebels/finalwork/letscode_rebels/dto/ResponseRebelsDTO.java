package br.rebels.finalwork.letscode_rebels.dto;

import br.rebels.finalwork.letscode_rebels.entity.RebelsInventory;
import br.rebels.finalwork.letscode_rebels.entity.RebelsLocalization;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseRebelsDTO {

    private Long id;
    private String nome;
    private Integer idade;
    private String genero;
    private RebelsLocalization localizacao;
    private RebelsInventory inventory;

    private Boolean traidor;
    private Integer contadorTraicao;

}
