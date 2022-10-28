import ComposantFigure.FigureComposant;
import ComposantFigure.GroupeFigure;
import Traitement.Traitement;

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
}
