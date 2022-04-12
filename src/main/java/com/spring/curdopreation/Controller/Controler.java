package com.spring.curdopreation.Controller;

import com.spring.curdopreation.Model.Player;
import com.spring.curdopreation.Service.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class Controler {
    public Controler() {
    }

    playerService playerService ;

    @Autowired
    public Controler( playerService playerService) {
        this.playerService=playerService;
    }

    @GetMapping("/adduser")
    public void addUser(@RequestParam String fName,@RequestParam String lastName,@RequestParam String nameOfClube ){

        playerService.addPlayers(fName,lastName,nameOfClube);
    }


    @GetMapping("/AllPlayers")
    public List<Player> getAllPlayers(){
        return playerService.getPlayers();
    }

    @GetMapping("/player")
    public void updatePlayer(@RequestParam int id,@RequestParam String changeUpdate,@RequestParam  Optional newUpdate){

         playerService.updatePlayer(id,changeUpdate,newUpdate);
    }

    @GetMapping("/deletePlayer")
    public  void deletePlayer(@RequestParam int id) {
        playerService.deletePlayer(id);
    }

        @GetMapping("/search")
        public List<Player> searchOfName(@RequestParam String firstName){
            return playerService.search(firstName);


    }






}
