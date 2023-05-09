package fr.ucaolan.xmen;

import androidx.annotation.DrawableRes;

public class XMen {

    private String nom;
    private String alias;
    private  String description;
    private  String pouvoirs;

    private @DrawableRes int idImage;

    public XMen(String nom, String alias, String description, String pouvoirs, @DrawableRes int idImage) {
        this.nom = nom;
        this.alias = alias;
        this.description = description;
        this.pouvoirs = pouvoirs;

        this.idImage = idImage;
    }

    public XMen(){
        nom = "inconnu";

        this.idImage = R.drawable.undef;
    }

    public String getNom() {
        return nom;
    }

    public String getAlias() {
        return alias;
    }

    public String getDescription() {
        return description;
    }

    public String getPouvoirs() {
        return pouvoirs;
    }

    public @DrawableRes int getIdImage() {
        return idImage;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPouvoirs(String pouvoirs) {
        this.pouvoirs = pouvoirs;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
}
