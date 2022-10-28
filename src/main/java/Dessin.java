import ComposantFigure.FigureComposant;
import ComposantFigure.GroupeFigure;
import Traitement.Traitement;

import java.io.*;
import java.util.List;

public class Dessin {

    private Traitement traitement;
    private FigureComposant figure = new GroupeFigure();

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }

    public Traitement getTraitement() {
        return traitement;
    }



    public void traiter()
    {
        traitement.traiter();
    }

    public void deleteFigure(FigureComposant figure)
    {
        if ( this.figure instanceof GroupeFigure)
        {
            ((GroupeFigure)this.figure).removeFigure(figure);

        }
    }

    public void addFigure(FigureComposant figure)
    {
        if ( this.figure instanceof GroupeFigure)
        {
            ((GroupeFigure)this.figure).addFigure(figure);

        }


    }

    public void showFigures()
    {
        this.figure.show();
    }

    public List<FigureComposant> getFiguresDessin()
    {
        return ((GroupeFigure)this.figure).getChilds();
    }



    //methode serialiser
    public void serialiser(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            List<FigureComposant> dessin = getFiguresDessin();
            for (FigureComposant figureComposant : dessin) {
                objectOutputStream.writeObject(figureComposant);
            }

            //objectOutputStream.writeObject(this.getFiguresDessin());

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception es)
        {

        }

    }


}
