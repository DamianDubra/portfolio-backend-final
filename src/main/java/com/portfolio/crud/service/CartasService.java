package com.portfolio.crud.service;

import com.portfolio.crud.entity.Cartas;
import com.portfolio.crud.repository.CartasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CartasService {

    @Autowired
    CartasRepository cartasRepository;

    public Optional<Cartas> getOne(int id){
        return cartasRepository.findById(id);
    }

    public Optional<Cartas> getByTitle(String title){
        return cartasRepository.findByTitle(title);
    }

    public void  save(Cartas cartas){
        cartasRepository.save(cartas);
    }

    public void delete(int id){
        cartasRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return cartasRepository.existsById(id);
    }

    public boolean existsByTitle(String title){
        return cartasRepository.existsByTitle(title);
    }

    public List<Cartas> getAll() {
        return cartasRepository.findAll();
    }

    public Optional<Cartas> findByTitleContaining(String title) {
        return cartasRepository.findByTitleContaining(title);
    }

    public Optional<Cartas> findByTextoContaining(String texto) {
        return cartasRepository.findByTextoContaining(texto);
    }

public Optional<Cartas> findByTexto2Containing(String texto2) {
        return cartasRepository.findByTexto2Containing(texto2);
    }
public Optional<Cartas> findByTexto3Containing(String texto3) {
        return cartasRepository.findByTexto3Containing(texto3);
    }
public Optional<Cartas> findByTexto4Containing(String texto4) {
        return cartasRepository.findByTexto4Containing(texto4);
    }
public Optional<Cartas> findByTexto5Containing(String texto5) {
        return cartasRepository.findByTexto5Containing(texto5);
    }
public Optional<Cartas> findByTexto6Containing(String texto6) {
        return cartasRepository.findByTexto6Containing(texto6);
    }
public Optional<Cartas> findByTexto7Containing(String texto7) {
        return cartasRepository.findByTexto7Containing(texto7);
    }
public Optional<Cartas> findByTexto8Containing(String texto8) {
        return cartasRepository.findByTexto8Containing(texto8);
    }
public Optional<Cartas> findByTexto9Containing(String texto9) {
        return cartasRepository.findByTexto9Containing(texto9);
    }
public Optional<Cartas> findByTexto10Containing(String texto10) {
        return cartasRepository.findByTexto10Containing(texto10);
    }

    public List<Cartas> findByImagenNotNull() {
        return cartasRepository.findByImagenNotNull();
    }
}