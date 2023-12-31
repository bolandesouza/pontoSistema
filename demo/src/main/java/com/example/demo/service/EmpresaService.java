package com.example.demo.service;

import com.example.demo.enterprise.ValidationException;
import com.example.demo.model.Empresa;
import com.example.demo.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpresaService {
    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public Empresa saveEmpresa(Empresa empresa){

        if(empresaRepository.findByCnpj(empresa.getCnpj()) != null){
            throw new ValidationException("Já existe uma empresa com esse CNPJ cadastrado!");
        }

        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getById(Long idEmpresa){return empresaRepository.findById(idEmpresa);}

    public Empresa updateEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }
    public void deleteEmpresa(Long idEmpresa){empresaRepository.deleteById(idEmpresa);}



}
