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

        entity.setContadorTraicao(0);
        entity.setTraidor(false);

        // Aqui chamamos um método para calcular o ano de nascimento da pessoa OPCIONAL
        list.add(entity);
        return entity;
    }

    public List<RebelsEntity> getAll() {
        return list;
    }

    public void atualizaLocalizacao(RebelsEntity entity) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(entity.getId())) {
                list.get(i).setLocalizacao(entity.getLocalizacao());
                return;
            }
        }
    }

    public RebelsEntity getById(Long id) {
        return list.stream()
                .filter(localizacao -> localizacao.getId().equals(id))
                .findFirst()
                .get();
    }


}
