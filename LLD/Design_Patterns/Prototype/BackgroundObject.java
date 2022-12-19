package org.sahil.LLD.Design_Patterns.Prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;

// Step-2 : Create Concrete class and implement interface
@AllArgsConstructor
@Setter
public class BackgroundObject implements GraphicalObject {

    private int x;
    private int y;
    private int width;
    private int height;
    private BackgroundObjectType type;

    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x,y,width,height,type);
    }
}
