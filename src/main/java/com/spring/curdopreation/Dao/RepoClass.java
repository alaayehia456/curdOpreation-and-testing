package com.spring.curdopreation.Dao;

import com.spring.curdopreation.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoClass extends JpaRepository<Player, Integer> {

     public List<Player> findByFirstNameContaining(@Param("name") String name);




}
