package br.rebels.finalwork.letscode_rebels.controller;

import br.rebels.finalwork.letscode_rebels.dto.AddRebelsDTO;
import br.rebels.finalwork.letscode_rebels.dto.ResponseRebelsDTO;
import br.rebels.finalwork.letscode_rebels.service.RebelsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/v1/rebels")
@RequiredArgsConstructor
public class RebelsController {

    private final RebelsService rebelsService;

    @RequestMapping("/add")
    @ResponseBody
    public ResponseEntity<Void> addRebel(@RequestBody AddRebelsDTO addRebelsDTO) {
        ResponseRebelsDTO response = rebelsService.add(addRebelsDTO);

        return ResponseEntity
                .created(URI.create("http://localhost:8080/v1/rebels/" + response.getId()))
                //.body();
                .build();
    }
}
