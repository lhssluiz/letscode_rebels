package br.rebels.finalwork.letscode_rebels.controller;

import br.rebels.finalwork.letscode_rebels.dto.AddRebelsDTO;
import br.rebels.finalwork.letscode_rebels.dto.PatchAtualizaLocalizacaoDTO;
import br.rebels.finalwork.letscode_rebels.dto.ResponseRebelsDTO;
import br.rebels.finalwork.letscode_rebels.entity.RebelsEntity;
import br.rebels.finalwork.letscode_rebels.service.RebelsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/rebels")
@RequiredArgsConstructor
public class RebelsController {

    private final RebelsService rebelsService;

    @PostMapping("/add")
    public ResponseEntity<ResponseRebelsDTO> addRebel(@RequestBody AddRebelsDTO addRebelsDTO) {
        ResponseRebelsDTO response = rebelsService.add(addRebelsDTO);

        return ResponseEntity
                .created(URI.create("http://localhost:8080/v1/rebels/" + response.getId()))
                .body(response);
                //.build();
    }

    @GetMapping
    public ResponseEntity<List<ResponseRebelsDTO>> getAllRebels() {
        List<ResponseRebelsDTO> responseList = rebelsService.getAllRebels();
        return ResponseEntity.ok(responseList);
    }

    @PatchMapping("/localizacao/{id}")
    public ResponseEntity<ResponseRebelsDTO> atualizaLocalizacao(@PathVariable Long id, @RequestBody PatchAtualizaLocalizacaoDTO patchDTO){
        System.out.println(patchDTO.getLongitude());
        ResponseRebelsDTO response = rebelsService.atualizaLocalizacao(id, patchDTO);

        return ResponseEntity.ok(response);

    }
}
