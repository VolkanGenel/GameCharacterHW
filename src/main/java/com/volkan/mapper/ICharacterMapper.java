package com.volkan.mapper;

import com.volkan.dto.request.CharacterSaveRequestDto;
import com.volkan.dto.response.CharacterFindAllResponseDto;
import com.volkan.dto.response.CharacterFindByNameResponseDto;
import com.volkan.repository.entity.Character;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICharacterMapper {
    ICharacterMapper INSTANCE = Mappers.getMapper(ICharacterMapper.class);
    /**
     * Buradan itibaren dönüşüm yapmak istediğimiz sınıflara ait methodlar tanımlıyoruz.
     * DİKKATTT!!!!
     * burada yazılan methodun adının ve kullanılan keywordlerin bir önemi yoktur.
     */
    Character fromCharacterSaveRequestDto(final CharacterSaveRequestDto dto);
    CharacterFindAllResponseDto fromCharacter(final Character Character);
    CharacterFindByNameResponseDto Characterden(final Character Character);

}
