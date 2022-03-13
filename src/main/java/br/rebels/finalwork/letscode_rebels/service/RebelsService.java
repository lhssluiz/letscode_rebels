package br.rebels.finalwork.letscode_rebels.service;

import br.rebels.finalwork.letscode_rebels.dto.AddRebelsDTO;
import br.rebels.finalwork.letscode_rebels.dto.ResponseRebelsDTO;
import br.rebels.finalwork.letscode_rebels.entity.RebelsEntity;
import br.rebels.finalwork.letscode_rebels.repository.RebelsRepository;
import br.rebels.finalwork.letscode_rebels.util.ConverterUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RebelsService {

    private final RebelsRepository rebelsRepository;

    public ResponseRebelsDTO add(AddRebelsDTO addRebelsDTO){

        RebelsEntity entity = ConverterUtil.toEntity(addRebelsDTO);

        RebelsEntity savedEntity = rebelsRepository.save(entity);
        ResponseRebelsDTO dto = ConverterUtil.toDTO(savedEntity);

        return dto;
    }


}
