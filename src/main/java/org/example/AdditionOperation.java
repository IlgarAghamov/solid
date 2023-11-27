package org.example;

import org.example.complexInt.ComplexNumber;
import org.example.complexInt.ComplexOperation;

public class AdditionOperation implements ComplexOperation {
    @Override
    public ComplexNumber perform(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getRealPart() + num2.getRealPart();
        double imagResult = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new SimpleComplexNumber(realResult, imagResult);
    }
}
