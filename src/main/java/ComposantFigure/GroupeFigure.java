package ComposantFigure;


import java.util.ArrayList;
import java.util.List;

public class GroupeFigure implements FigureComposant{

    List<FigureComposant> childs = new ArrayList<>();

    public FigureComposant addFigure(FigureComposant component) {
        childs.add(component);
        return component;
    }

    public void removeFigure(FigureComposant component) {
        childs.remove(component);

    }

    @Override
    public void show() {

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("----Groupe Figure : ");
        for (FigureComposant c : childs) {
            System.out.println("\t");
            System.out.println("\n");
            c.show();

        }

    }
}
