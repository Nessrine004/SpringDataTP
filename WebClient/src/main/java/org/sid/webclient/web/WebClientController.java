package org.sid.webclient.web;

import org.sid.webclient.service.EtudiantWebClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WebClientController {

    private final EtudiantWebClient svc;

    public WebClientController(EtudiantWebClient svc) {
        this.svc = svc;
    }

    @GetMapping("/all")
    public Map<String, Object> all() {
        return svc.getEtudiants();       // <-- nom correct
    }

    @DeleteMapping("/supp/{id}")
    public String supp(@PathVariable Long id) {
        return svc.deleteEtudiant(id);   // <-- nom correct
    }
}
