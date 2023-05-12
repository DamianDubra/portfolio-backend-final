package com.portfolio.crud.dto;

import javax.validation.constraints.Min;
import org.springframework.lang.Nullable;


public class CartasDto {


    private String title;
private byte[] imagen;

@Nullable
private String texto;

@Nullable
private String texto2;

@Nullable
private String texto3;

@Nullable
private String texto4;

@Nullable
private String texto5;

@Nullable
private String texto6;

@Nullable
private String texto7;

@Nullable
private String texto8;

@Nullable
private String texto9;

@Nullable
private String texto10;
    

    public CartasDto() {
    }

    public CartasDto(String title, byte[] imagen, String texto, String texto2, String texto3, String texto4, String texto5, String texto6, String texto7, String texto8, String texto9, String texto10) {
        this.title = title;
        this.imagen = imagen;
        this.texto = texto;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.texto4 = texto4;
        this.texto5 = texto5;
        this.texto6 = texto6;
        this.texto7 = texto7;
        this.texto8 = texto8;
        this.texto9 = texto9;
        this.texto10 = texto10;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public String getTexto3() {
        return texto3;
    }

    public void setTexto3(String texto3) {
        this.texto3 = texto3;
    }

    public String getTexto4() {
        return texto4;
    }

    public void setTexto4(String texto4) {
        this.texto4 = texto4;
    }

    public String getTexto5() {
        return texto5;
    }

    public void setTexto5(String texto5) {
        this.texto5 = texto5;
    }

    public String getTexto6() {
        return texto6;
    }

    public void setTexto6(String texto6) {
        this.texto6 = texto6;
    }

    public String getTexto7() {
        return texto7;
    }

    public void setTexto7(String texto7) {
        this.texto7 = texto7;
    }

    public String getTexto8() {
        return texto8;
    }

    public void setTexto8(String texto8) {
        this.texto8 = texto8;
    }

    public String getTexto9() {
        return texto9;
    }

    public void setTexto9(String texto9) {
        this.texto9 = texto9;
    }

    public String getTexto10() {
        return texto10;
    }

    public void setTexto10(String texto10) {
        this.texto10 = texto10;
    }


}