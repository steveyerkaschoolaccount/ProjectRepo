package IFML;

import FactoryElements.InputObject;
import static FactoryElements.ShapeSVGFunctions.circleToSVG;
import lombok.Getter;
import lombok.Setter;

/**
 * @author David Lindeman
 * Event objects for the IFML Factory
 * Like all classes with text boxes these are generated via setter calls from the front end
 */
@Getter @Setter
public class IFMLEvent extends DrawingObject {
    String text;
//    String fillColor = "#000000"; //hex for black
    boolean isFilled; //default value is false

    public IFMLEvent(String id, InputObject inObj){
        super(id, inObj);
        text = "";
        isFilled = false;
    }

    public void generateShape(){
        if(isFilled){
            super.inObject.setColor("#000000"); //sets the fill color to the hex code for black
        }
        super.shapeSVG = circleToSVG(super.inObject);
        super.setSvgData(super.shapeSVG + super.txtToSVG(text,
                super.inObject.getXCord() + 2*super.inObject.getParams()[0],
                super.inObject.getYCord()- 2*super.inObject.getParams()[0]));
    }

}
