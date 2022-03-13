package br.rebels.finalwork.letscode_rebels.util;

import br.rebels.finalwork.letscode_rebels.dto.AddRebelsDTO;
import br.rebels.finalwork.letscode_rebels.dto.ResponseRebelsDTO;
import br.rebels.finalwork.letscode_rebels.entity.RebelsEntity;

public class ConverterUtil {

    public static ResponseRebelsDTO toDTO(RebelsEntity entity) {
        ResponseRebelsDTO dto = new ResponseRebelsDTO();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        return dto;
    }

    public static RebelsEntity toEntity(AddRebelsDTO dto) {
        RebelsEntity entity = new RebelsEntity();

        entity.setNome(dto.getNome());
        entity.setIdade(dto.getIdade());
        return entity;
    }

}
