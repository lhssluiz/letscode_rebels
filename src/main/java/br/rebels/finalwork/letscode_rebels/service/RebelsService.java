package br.rebels.finalwork.letscode_rebels.service;

import br.rebels.finalwork.letscode_rebels.dto.AddRebelsDTO;
import br.rebels.finalwork.letscode_rebels.dto.ResponseRebelsDTO;
import br.rebels.finalwork.letscode_rebels.entity.RebelsEntity;
import br.rebels.finalwork.letscode_rebels.repository.RebelsRepository;
import br.rebels.finalwork.letscode_rebels.util.ConverterUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public List<ResponseRebelsDTO> getAllRebels() {
        return getAllStream()
                .collect(Collectors.toList());
    }

    public Stream<ResponseRebelsDTO> getAllStream() {
        return rebelsRepository.getAll().stream()
                .map(ConverterUtil::toDTO);
    }


}
