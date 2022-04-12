package com.spring.curdopreation.Dao;

import com.spring.curdopreation.Model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class RepoClassTest {

    @Autowired
    private RepoClass repoClass;

    Player player;

    @Test
    void findByFirstNameContaining() {
        player.setFirstName("mane");
        repoClass.save(player);

        Assertions.assertEquals("mane",repoClass.findByFirstNameContaining("mane"));

    }

    @Test
    void testCreate(){




    }




}