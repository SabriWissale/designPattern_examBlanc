package Parametrage;

import ComposantFigure.Element;

public abstract class Parametrage {

    private int epaisseur;
    private String couleurContoure;
    private String couleurRemplissage;

    public abstract void addObserver(Element observer); //add observer
    public abstract void removeObserver(Element observer); // remove observer
    public abstract void notifyObservers();


}
