package Parametrage;

import ComposantFigure.Element;

import java.util.ArrayList;
import java.util.List;

public class ParametrageImpl extends Parametrage {

    private int epaisseur;
    private String couleurContoure;
    private String couleurRemplissage;

    private List<Element> observers = new ArrayList<>();

    @Override
    public void addObserver(Element observer)
    {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Element observer)
    {
        this.observers.remove(observer);
    }


    @Override
    public void notifyObservers() {

        for(Element observer: observers) {
            observer.update(this);
        }

    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
        this.notifyObservers(); //une fois l'etat de l'observable se change on notifie les observateurs
    }

    public String getCouleurContoure() {
        return couleurContoure;
    }

    public void setCouleurContoure(String couleurContoure) {
        this.couleurContoure = couleurContoure;
        this.notifyObservers(); //une fois l'etat de l'observable se change on notifie les observateurs
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        this.notifyObservers(); //une fois l'etat de l'observable se change on notifie les observateurs
    }
}
