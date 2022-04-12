package com.spring.curdopreation.Service;

import com.spring.curdopreation.Dao.RepoClass;
import com.spring.curdopreation.Model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class playerService {


    private RepoClass repoClass;

    @Autowired
    public playerService( RepoClass repoClass) {
        this.repoClass = repoClass;
    }

    public  void addPlayers(String fName, String lastName, String nameOfClube){

        Player player=new Player();
            player.setFirstName(fName);
           player.setLastName(lastName);
            player.setNameOfClube(nameOfClube);
        repoClass.save(player);


    }

    public List<Player> getPlayers(){
        return repoClass.findAll();

    }

    public Player updatePlayer(Integer id, String playerUpdate, Optional newUpdate) {

        playerUpdate.toLowerCase();
        Player player = repoClass.findById(id).get();
        if (playerUpdate.contentEquals("firstname") || playerUpdate.contentEquals("first name")){

            player.setFirstName(newUpdate.toString());
        }else if(playerUpdate.contentEquals("last name") || playerUpdate.contentEquals("lastname")){


            player.setLastName(newUpdate.toString());
        }
        repoClass.save(player);

           return repoClass.findById(id).get();
    }


    public void deletePlayer(int id){

        repoClass.deleteById(id);

    }


    public List<Player> search(String wordOfSearch){

        return   repoClass.findByFirstNameContaining(wordOfSearch);

    }









}
