package com.volkan.repository;

import com.volkan.repository.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICharacterRepository extends JpaRepository<Character,Long> {
    Character findByName(String ad);

}
