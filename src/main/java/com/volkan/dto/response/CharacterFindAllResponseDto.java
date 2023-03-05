package com.volkan.dto.response;

import com.volkan.repository.entity.CharacterType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Builder // Builder, bir sınıftan nesne türetmek için özel oluşturulmuş bir method
@Data // Data,get, set methodlarını tanımlar
@NoArgsConstructor // Parametresiz constructor tanımlar
@AllArgsConstructor // 1....n kadar olan tüm parametreli constructorları tanımlar
public class CharacterFindAllResponseDto {
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "level")
    private int level;
    @Enumerated(EnumType.STRING)
    private CharacterType characterType;
}
