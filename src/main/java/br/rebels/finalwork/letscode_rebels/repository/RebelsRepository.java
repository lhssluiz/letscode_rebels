package br.rebels.finalwork.letscode_rebels.repository;

import br.rebels.finalwork.letscode_rebels.entity.RebelsEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RebelsRepository {

    private static List<RebelsEntity> list = new ArrayList<>();
    private static Long sequence = 1L;

    public RebelsEntity save(RebelsEntity entity) {
        entity.setId(sequence++);
        list.add(entity);
        return entity;
    }

}
