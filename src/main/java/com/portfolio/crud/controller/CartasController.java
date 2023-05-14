package com.portfolio.crud.controller;

import com.portfolio.crud.dto.Mensaje;
import com.portfolio.crud.dto.CartasDto;
import com.portfolio.crud.entity.Cartas;
import com.portfolio.crud.service.CartasService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping("/cartas")
@CrossOrigin(origins = "https://portfoliobackenddamian1.onrender.com")
public class CartasController {

    @Autowired
    CartasService cartasService;

   @GetMapping("/{id}")
public ResponseEntity<Cartas> getById(@PathVariable("id") int id) {
    Optional<Cartas> cartaOptional = cartasService.getOne(id);
    if (!cartaOptional.isPresent()) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Cartas carta = cartaOptional.get();
    return new ResponseEntity<>(carta, HttpStatus.OK);
}

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!cartasService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        cartasService.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody CartasDto cartasDto){
        if(!cartasService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(cartasService.existsByTitle(cartasDto.getTitle()) && cartasService.getByTitle(cartasDto.getTitle()).get().getId() != id)
            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(cartasDto.getTitle()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        Cartas cartas = cartasService.getOne(id).get();
        cartas.setTitle(cartasDto.getTitle());
        cartas.setImagen(cartasDto.getImagen());
        cartas.setTexto(cartasDto.getTexto());
        cartas.setTexto2(cartasDto.getTexto2());
        cartas.setTexto3(cartasDto.getTexto3());
        cartas.setTexto4(cartasDto.getTexto4());
        cartas.setTexto5(cartasDto.getTexto5());
        cartas.setTexto6(cartasDto.getTexto6());
        cartas.setTexto7(cartasDto.getTexto7());
        cartas.setTexto8(cartasDto.getTexto8());
        cartas.setTexto9(cartasDto.getTexto9());
        cartas.setTexto10(cartasDto.getTexto10());
        cartasService.save(cartas);
        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.OK);
    }
}