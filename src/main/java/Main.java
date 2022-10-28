import ComposantFigure.Cercle;
import ComposantFigure.GroupeFigure;
import ComposantFigure.Rectangle;
import Parametrage.Parametrage;
import Parametrage.ParametrageImpl;
import Traitement.Traitement;
import Traitement.TraitementImpl1;

import java.awt.Point;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        Dessin dessin = new Dessin();

        Traitement traitement1 = new TraitementImpl1();
        dessin.setTraitement(traitement1);

        Cercle cercle1 = new Cercle();
        cercle1.setPoint(new Point(1, 2));
        cercle1.setRayon(5);
        System.out.println("Surface du cercle 1 : " + cercle1.calculerSurface());
        System.out.println("Périmètre du cercle 1 : " + cercle1.calculerPerimetre());
        System.out.println();

        Cercle cercle2 = new Cercle();
        cercle2.setPoint(new Point(8, 9));
        cercle2.setRayon(13);
        System.out.println("Surface du cercle 2 : " + cercle2.calculerSurface());
        System.out.println("Périmètre du cercle 2 : " + cercle2.calculerPerimetre());
        System.out.println();

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHauteur(5);
        rectangle1.setLargeur(2);
        rectangle1.setPoint(new Point(4, -3));
        System.out.println("Surface du rectangle 1 : " + rectangle1.calculerSurface());
        System.out.println("Périmètre du rectangle 1 : " + rectangle1.calculerPerimetre());
        System.out.println();

        dessin.addFigure(cercle1);
        dessin.addFigure(rectangle1);
        dessin.addFigure(cercle2);
        dessin.getTraitement().traiter();
        dessin.deleteFigure(cercle2);



        Parametrage parametrage1 = new ParametrageImpl();
        ((ParametrageImpl) parametrage1).setCouleurContoure("PURPLE");
        ((ParametrageImpl) parametrage1).setEpaisseur(50);
        ((ParametrageImpl) parametrage1).setCouleurRemplissage("RED");

        parametrage1.addObserver(cercle1);
        parametrage1.addObserver(rectangle1);

        dessin.showFigures();
        System.out.println();

        parametrage1.removeObserver(rectangle1);


        dessin.serialiser("files/MyDessin.dat");



    }
}
