/**
 * the implementation of the calculator operands
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2021-03-30 20:43:11 
 * Last modified  : 2021-03-30 20:43:32
 */

package CalculatorInProgress.implementation.mathEngine;

import CalculatorInProgress.interfaces.IOperand;

public class CalculatorOperand implements IOperand {
    String typeName = "undefined";
    double dblValue;
    int intValue;

    @Override
    public String getType() {
        return typeName;
    }

    @Override
    public void setType(String typeName) {
        if (typeName.equalsIgnoreCase("integer"))
            this.typeName = typeName;
        else if (typeName.equalsIgnoreCase("double"))
            this.typeName = typeName;
        else
            this.typeName = "undefined";
    }

    @Override
    public double getDouble() {
        if (typeName.equalsIgnoreCase("double"))
            return dblValue;
        else if (typeName.equalsIgnoreCase("integer"))
            return (double) intValue;
        else
            return Double.NaN;
    }

    @Override
    public int getInt() {
        if (typeName.equalsIgnoreCase("integer"))
            return intValue;
        else if (typeName.equalsIgnoreCase("double"))
            return (int) dblValue;
        else
            return 0;
    }

    @Override
    public void setValue(String typeName, double valueD, int valueI) {
        this.typeName = typeName;
        this.dblValue = valueD;
        this.intValue = valueI;
    }

    @Override
    public boolean isSet() {
        return !typeName.equalsIgnoreCase("undefined");
    }

    @Override
    public String toString() {
        if (typeName.equalsIgnoreCase("integer"))
            return "" + intValue;
        else if (typeName.equalsIgnoreCase("double"))
            return "" + dblValue;
        else
            return "undefined";
    }
}
