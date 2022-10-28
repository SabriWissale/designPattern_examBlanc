package ComposantFigure;

import Parametrage.Parametrage;

import java.awt.*;

public abstract class Element extends FigureComposant {

    private Parametrage parametrage;
    private Point point;

    public abstract void update(Parametrage observable);
    public  abstract double calculerPerimetre();
    public abstract double calculerSurface();
    public abstract void dessiner();


    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Parametrage getParametrage() {
        return parametrage;
    }

    public void setParametrage(Parametrage parametrage) {
        this.parametrage = parametrage;
    }



}

