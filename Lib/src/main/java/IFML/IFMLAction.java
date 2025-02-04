package IFML;

import FactoryElements.InputObject;
import static FactoryElements.ShapeSVGFunctions.hexagonToSvg;

public class IFMLAction extends DrawingObject {
    String componentName;
    String text;
    String fillColor = "#B7BDBB"; //Hex for light blue grey

    public IFMLAction(String id, InputObject inObj){
        super(id, inObj);
        componentName = "";
    }

    public void generateShape(){
        super.shapeSVG = hexagonToSvg(super.inObject);
        super.setSvgData(super.shapeSVG + super.txtToSVG(text,
                super.inObject.getXCord() + inObject.getParams()[0]*.5,
                super.inObject.getYCord() - super.inObject.getParams()[1]*.5));
    }
}
