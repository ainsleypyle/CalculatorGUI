/**
 * the implementation for the calculator engine
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2021-03-30 20:40:50 
 * Last modified  : 2023-10-24 14:53:31
 */

package CalculatorInProgress.implementation.mathEngine;

import CalculatorInProgress.interfaces.IOperand;
import CalculatorInProgress.interfaces.IOperation;

/**
 * This is the class that implements the set of operations
 * that the calculator can do. The actual mechanics are
 * implemented in the engine.
 * When adding an operation you need to add the KEY to the list
 * in isSet.
 */
public abstract class CalculatorOperation implements IOperation {
    protected String m_opName;
    protected IOperand operand1;
    protected IOperand operand2;

    @Override
    public String getOperation() {
        return m_opName;
    }

    @Override
    public void setOperation(String opName) {
        m_opName = opName;
    }

    @Override
    public boolean isSet() {

        return false;
    }

    @Override
    public void setOperandOne(IOperand iOperand) {
        operand1 = iOperand;
    }

    @Override
    public void setOperandTwo(IOperand iOperand) {
        operand2 = iOperand;
    }
}
