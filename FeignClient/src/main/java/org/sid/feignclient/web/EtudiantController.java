package org.sid.feignclient.web;

import org.sid.feignclient.feign.EtudiantFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EtudiantController {

    private final EtudiantFeignClient feignClient;

    public EtudiantController(EtudiantFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/api/etudiants")
    public List<Map<String, Object>> getAllEtudiants() {
        // Le serveur REST (8080) renvoie un JSON avec "_embedded"
        Map<String, Object> response = feignClient.getAllEtudiants();
        Map<String, Object> embedded = (Map<String, Object>) response.get("_embedded");
        return (List<Map<String, Object>>) embedded.get("etudiants");
    }
}
