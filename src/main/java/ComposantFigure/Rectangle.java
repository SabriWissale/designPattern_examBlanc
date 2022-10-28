package ComposantFigure;

import Parametrage.Parametrage;
import Parametrage.ParametrageImpl;

public class Rectangle extends Element{

    private double largeur;
    private double hauteur;


    @Override
    public void update(Parametrage observable) {

        this.setParametrage(observable);
        System.out.println("*****OBSERVER RECTANGLE UPDATE*******");
        System.out.println("******"+this.getParametrage()+"******");

    }

    @Override
    public double calculerPerimetre() {
        return 2*(this.getHauteur()+this.getLargeur());
    }

    @Override
    public double calculerSurface() {
        return this.getHauteur() * this.getLargeur();
    }

    @Override
    public void dessiner() {

        System.out.println("on dessine rectangle");
        System.out.println("hauteur : "+this.getHauteur());
        System.out.println("largeur : "+this.getLargeur());
        System.out.println("perimetre : "+this.calculerPerimetre());
        System.out.println("surface : "+this.calculerSurface());
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public void show() {
        System.out.println("Rectangle");
        dessiner();
    }
}
