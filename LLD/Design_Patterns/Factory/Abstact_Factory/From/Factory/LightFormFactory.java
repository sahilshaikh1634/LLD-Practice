package org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Factory;

import org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Product.Button;
import org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Product.CheckBox;
import org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Product.LightButton;
import org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Product.LightCheckBox;

public class LightFormFactory implements FormFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
