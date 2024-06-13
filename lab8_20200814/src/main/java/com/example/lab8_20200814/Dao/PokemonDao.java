package com.example.lab8_20200814.Dao;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class PokemonDao {

    public String getPokemonLocation(Integer pokemonId) {
        RestTemplate restTemplate = new RestTemplate();
        String endpoint = "https://pokeapi.co/api/v2/pokemon/" + pokemonId + "/encounters";
        return restTemplate.getForObject(endpoint, String.class);
    }


    public String getPokemonLocationAreaEncounter(Integer pokemonId) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://pokeapi.co/api/v2/location-area/" + pokemonId;
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
        return response.getBody();
    }


}
