package com.portfolio.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import org.springframework.lang.Nullable;
import javax.persistence.Lob;

@Entity
public class Cartas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Nullable
    @Lob
    private byte[] imagen;
    
    private String title;
    
    @Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto2;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto3;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto4;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto5;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto6;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto7;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto8;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto9;
@Nullable
    @Column(nullable = true, columnDefinition = "TEXT")
    private String texto10;

    public Cartas() {
    }

    public Cartas(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//texto
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

// Getter y setter para texto2
public String getTexto2() {
    return texto2;
}

public void setTexto2(String texto2) {
    this.texto2 = texto2;
}

// Getter y setter para texto3
public String getTexto3() {
    return texto3;
}

public void setTexto3(String texto3) {
    this.texto3 = texto3;
}

// Getter y setter para texto4
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

public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}