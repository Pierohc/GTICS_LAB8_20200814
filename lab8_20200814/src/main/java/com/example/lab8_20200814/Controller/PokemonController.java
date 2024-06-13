package com.example.lab8_20200814.Controller;
import com.example.lab8_20200814.Dao.PokemonDao;
import com.example.lab8_20200814.Entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pokemon")
public class PokemonController {


    private final PokemonDao pokemonDao;

    @Autowired
    public PokemonController(PokemonDao pokemonDao) {
        this.pokemonDao = pokemonDao;
    }




    @GetMapping("/{pokemonId}/location")
    public String getPokemonLocation(@PathVariable Integer pokemonId, Model model) {
        String location = pokemonDao.getPokemonLocation(pokemonId);
        model.addAttribute("location", location);
        System.out.println(location);
        return "pokemon_location";
    }


    @GetMapping("/{pokemonId}/area_encounter")
    public String getPokemonLocationAreaEncounter(@PathVariable Integer pokemonId, Model model) {
        String area = pokemonDao.getPokemonLocationAreaEncounter(pokemonId);
        model.addAttribute("area", area);
        return "pokemon_area";
    }






}
