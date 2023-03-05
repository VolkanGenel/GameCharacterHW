package com.volkan.service;

import com.volkan.dto.request.CharacterSaveRequestDto;
import com.volkan.dto.response.CharacterFindAllResponseDto;
import com.volkan.dto.response.CharacterFindByNameResponseDto;
import com.volkan.mapper.ICharacterMapper;
import com.volkan.repository.ICharacterRepository;
import com.volkan.repository.entity.Character;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService{
    private final ICharacterRepository repository;

    public CharacterService(ICharacterRepository repository) {
        this.repository = repository;
    }

    public CharacterFindByNameResponseDto findByName(String ad) {
        CharacterFindByNameResponseDto result;
        Character character = repository.findByName(ad);
        result = ICharacterMapper.INSTANCE.Characterden(character);
        return result;
    }
    public void saveDto(CharacterSaveRequestDto dto) {

        repository.save(ICharacterMapper.INSTANCE.fromCharacterSaveRequestDto(dto));
    }
    public List<CharacterFindAllResponseDto> findAllResponseDtos(){
        List<CharacterFindAllResponseDto> result = new ArrayList<>();
        repository.findAll().forEach(x->{
            result.add(ICharacterMapper.INSTANCE.fromCharacter(x));
        });
        return result;
    }
}
