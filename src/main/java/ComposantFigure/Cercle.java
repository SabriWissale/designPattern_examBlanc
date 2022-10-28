package ComposantFigure;

import Parametrage.Parametrage;

public class Cercle extends Element{

    private double rayon;
    @Override
    public void update(Parametrage observable) {

        this.setParametrage(observable);
        System.out.println("*****OBSERVER CERCLE UPDATE*******");
        System.out.println("******"+this.getParametrage()+"******");


    }

    @Override
    public double calculerPerimetre() {
        return 2*Math.PI*this.getRayon();
    }

    @Override
    public double calculerSurface() {
        return Math.PI * (this.getRayon() * this.getRayon());
    }

    @Override
    public void dessiner() {
        System.out.println("on dessine cercle");
        System.out.println("rayon : "+this.getRayon());
        System.out.println("perimetre : "+this.calculerPerimetre());
        System.out.println("surface : "+this.calculerSurface());
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public void show() {
        System.out.println("Cercle");
        dessiner();
    }
}
