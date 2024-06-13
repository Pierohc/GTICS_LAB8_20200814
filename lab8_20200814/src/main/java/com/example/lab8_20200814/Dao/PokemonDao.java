package com.example.lab8_20200814.Dao;
import com.example.lab8_20200814.Entity.Pokemon;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PokemonDao {

    public String getPokemonLocation(Integer pokemonId) {
        RestTemplate restTemplate = new RestTemplate();
        String endpoint = "https://pokeapi.co/api/v2/pokemon/" + pokemonId + "/encounters";
        return restTemplate.getForObject(endpoint, String.class);
    }

}
