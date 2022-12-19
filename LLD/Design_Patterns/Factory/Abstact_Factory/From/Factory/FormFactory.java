package org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Factory;

import org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Product.Button;
import org.sahil.LLD.Design_Patterns.Factory.Abstact_Factory.From.Product.CheckBox;

public interface FormFactory {

        Button createButton();

        CheckBox createCheckBox();

}
