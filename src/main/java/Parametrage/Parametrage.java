package Parametrage;

import ComposantFigure.Element;

public interface Parametrage {

    public void addObserver(Element observer); //add observer
    public void removeObserver(Element observer); // remove observer
    public void notifyObservers();


}
