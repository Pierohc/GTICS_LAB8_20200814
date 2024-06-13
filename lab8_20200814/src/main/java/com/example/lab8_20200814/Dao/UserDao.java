package com.example.lab8_20200814.Dao;

import com.example.lab8_20200814.Entity.User;
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
public class UserDao{

    public List<User> listar() {
        List<User> lista = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();
        String endPoint = "http://localhost:8080/api/users";

        ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(endPoint, User[].class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            User[] body = responseEntity.getBody();
            lista = Arrays.asList(body);
        }

        return lista;
    }



}
