package br.rebels.finalwork.letscode_rebels.dto;

import br.rebels.finalwork.letscode_rebels.entity.RebelsInventory;
import br.rebels.finalwork.letscode_rebels.entity.RebelsLocalization;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AddRebelsDTO {

    private String nome;
    private Integer idade;
    private String genero;
    private RebelsLocalization localizacao;
    private RebelsInventory inventory;
}
