package br.rebels.finalwork.letscode_rebels.dto;

import br.rebels.finalwork.letscode_rebels.entity.RebelsLocalization;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatchAtualizaLocalizacaoDTO {

    private Double latitude;
    private Double longitude;
    private String nomeGalaxia;

}
