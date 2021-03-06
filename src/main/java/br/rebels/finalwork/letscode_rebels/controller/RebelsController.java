package br.rebels.finalwork.letscode_rebels.controller;

import br.rebels.finalwork.letscode_rebels.dto.AddRebelsDTO;
import br.rebels.finalwork.letscode_rebels.dto.PatchAtualizaLocalizacaoDTO;
import br.rebels.finalwork.letscode_rebels.dto.ResponseRebelsDTO;
import br.rebels.finalwork.letscode_rebels.entity.RebelsEntity;
import br.rebels.finalwork.letscode_rebels.service.RebelsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/v1/rebels")
@RequiredArgsConstructor
public class RebelsController {

    private final RebelsService rebelsService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ResponseRebelsDTO> addRebel(@RequestBody AddRebelsDTO addRebelsDTO) {
        ResponseRebelsDTO response = rebelsService.add(addRebelsDTO);

        return ResponseEntity
                .created(URI.create("http://localhost:8080/v1/rebels/" + response.getId()))
                .body(response);
                //.build();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<ResponseRebelsDTO>> getAllRebels() {
        List<ResponseRebelsDTO> responseList = rebelsService.getAllRebels();
        return ResponseEntity.ok(responseList);
    }

    @PatchMapping("/localizacao/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseRebelsDTO> atualizaLocalizacao(@PathVariable Long id, @RequestBody PatchAtualizaLocalizacaoDTO patchDTO){

        ResponseRebelsDTO response = rebelsService.atualizaLocalizacao(id, patchDTO);

        return ResponseEntity.ok(response);

    }

    @PatchMapping("/report-traitor/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseRebelsDTO> reportRebelAsTraitor(@PathVariable Long id){

        ResponseRebelsDTO response = rebelsService.rebelIsTraitor(id);

        return ResponseEntity.ok(response);

    }

    @GetMapping("/reports/traitors-percent")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> reportGetTraitors() {

        List<ResponseRebelsDTO> responseList = rebelsService.getAllRebels();

        Stream<ResponseRebelsDTO> traidores = responseList.stream()
                .filter(rebel -> rebel.getTraidor() == true);

        Double percent = ((double)traidores.count() / responseList.size()) * 100;

        return ResponseEntity.ok(percent + "%");
    }

    @GetMapping("/reports/rebels-percent")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> reportGetRebels() {

        List<ResponseRebelsDTO> responseList = rebelsService.getAllRebels();

        Stream<ResponseRebelsDTO> rebeldes = responseList.stream()
                .filter(rebel -> rebel.getTraidor() == false);

        Double percent = ((double)rebeldes.count() / responseList.size()) * 100;


        return ResponseEntity.ok(percent + "%");
    }

}
