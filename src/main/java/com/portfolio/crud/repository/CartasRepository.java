package com.portfolio.crud.repository;

import com.portfolio.crud.entity.Cartas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.Optional;

@Repository
public interface CartasRepository extends JpaRepository<Cartas, Integer> {
    Optional<Cartas> findByTitle(String title);
Optional<Cartas> findByTitleContaining(String title);
Optional<Cartas> findByTextoContaining(String texto);

Optional<Cartas> findByTexto2Containing(String texto2);
Optional<Cartas> findByTexto3Containing(String texto3);
Optional<Cartas> findByTexto4Containing(String texto4);
Optional<Cartas> findByTexto5Containing(String texto5);
Optional<Cartas> findByTexto6Containing(String texto6);
Optional<Cartas> findByTexto7Containing(String texto7);
Optional<Cartas> findByTexto8Containing(String texto8);
Optional<Cartas> findByTexto9Containing(String texto9);
Optional<Cartas> findByTexto10Containing(String texto10);
List<Cartas> findByImagenNotNull();
    boolean existsByTitle(String title);
}