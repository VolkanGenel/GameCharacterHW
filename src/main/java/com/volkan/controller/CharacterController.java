package com.volkan.controller;

import static com.volkan.constants.EndPoints.*;

import com.volkan.dto.request.CharacterSaveRequestDto;
import com.volkan.dto.response.CharacterFindAllResponseDto;
import com.volkan.dto.response.CharacterFindByNameResponseDto;
import com.volkan.service.CharacterService;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(CHARACTER)
@RequiredArgsConstructor
public class CharacterController {
    private final CharacterService characterService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(
            @RequestBody @Valid CharacterSaveRequestDto dto){
        characterService.saveDto(dto);
        return ResponseEntity.ok().build();
    }
    @GetMapping(GETALL)
    public ResponseEntity<List<CharacterFindAllResponseDto>> findAll() {

        return ResponseEntity.ok(characterService.findAllResponseDtos());
    }

    @GetMapping(GETBYNAME)
    public ResponseEntity<CharacterFindByNameResponseDto> findByName(String ad) {
        return ResponseEntity.ok(characterService.findByName(ad));
    }
}
