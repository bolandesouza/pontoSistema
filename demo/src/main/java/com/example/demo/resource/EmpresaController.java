package com.example.demo.resource;

import com.example.demo.model.Empresa;
import com.example.demo.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.saveEmpresa(empresa);
    }

    @GetMapping
    public List<Empresa> getEmpresaList(){
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaByID(@PathVariable("idEmpresa") Long idEmpresa) throws Exception {
        return  ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
    @PutMapping("/{idEmpresa}")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }
    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity deleteById(@PathVariable("idEmpresa")Long idEmpresa) throws Exception {
        try {
            empresaService.deleteEmpresa(idEmpresa);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Empresa>) ResponseEntity.ok();
    }
}
