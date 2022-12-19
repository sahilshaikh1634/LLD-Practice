package org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Factory;

import org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Product.*;

public class DarkFormFactory implements FormFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}
