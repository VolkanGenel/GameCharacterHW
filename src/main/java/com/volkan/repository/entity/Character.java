package com.volkan.repository.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Builder // Builder, bir sınıftan nesne türetmek için özel oluşturulmuş bir method
@Data // Data,get, set methodlarını tanımlar
@NoArgsConstructor // Parametresiz constructor tanımlar
@AllArgsConstructor // 1....n kadar olan tüm parametreli constructorları tanımlar
@ToString // sınıf için toString methodunu tanımlar
@Entity
@Table(name = "tblcharacter")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "level")
    private int level;
    @Enumerated(EnumType.STRING)
    private CharacterType characterType;
    private double attackPower;
    private double defencePower;
    private double health;
    private double ultimatePower;
    @ElementCollection
    private List<Long> itemlist;

}
