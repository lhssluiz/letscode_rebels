package br.rebels.finalwork.letscode_rebels.util;

import br.rebels.finalwork.letscode_rebels.dto.AddRebelsDTO;
import br.rebels.finalwork.letscode_rebels.dto.ResponseRebelsDTO;
import br.rebels.finalwork.letscode_rebels.entity.RebelsEntity;

public class ConverterUtil {

    public static ResponseRebelsDTO toDTO(RebelsEntity entity) {
        ResponseRebelsDTO dto = new ResponseRebelsDTO();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setGenero(entity.getGenero());
        dto.setIdade(entity.getIdade());
        dto.setInventory(entity.getInventory());
        dto.setLocalizacao(entity.getLocalizacao());

        dto.setContadorTraicao(entity.getContadorTraicao());
        dto.setTraidor(entity.getTraidor());
        return dto;
    }

    public static RebelsEntity toEntity(AddRebelsDTO dto) {
        RebelsEntity entity = new RebelsEntity();

        entity.setNome(dto.getNome());
        entity.setIdade(dto.getIdade());
        entity.setGenero(dto.getGenero());
        entity.setInventory(dto.getInventory());
        entity.setLocalizacao(dto.getLocalizacao());
        return entity;
    }

}
