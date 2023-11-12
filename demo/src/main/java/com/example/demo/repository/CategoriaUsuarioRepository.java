package com.example.demo.repository;

import com.example.demo.service.CategoriaUsuarioService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuarioService, Long> {
}
