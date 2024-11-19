/**
 * A sample class that implements the add operation
 * this can be used to build more
 *
 * @summary example implementation of a calculator operation.
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-24 14:11:45 
 * Last modified  : 2023-10-24 16:30:35
 */

package CalculatorInProgress.implementation.mathEngine.operations;

import CalculatorInProgress.implementation.mathEngine.CalculatorAnswer;
import CalculatorInProgress.implementation.mathEngine.CalculatorOperand;
import CalculatorInProgress.implementation.mathEngine.CalculatorOperation;
import CalculatorInProgress.interfaces.ICalculatorAnswer;
import CalculatorInProgress.interfaces.IOperand;

/**
 * 
 */
public class AdditionOperation extends CalculatorOperation {

    public AdditionOperation(String opName) {
        setOperation(opName);
    }

    @Override
    public ICalculatorAnswer doOperation() {
        ICalculatorAnswer ans = new CalculatorAnswer();
        IOperand op = new CalculatorOperand();

        if (operand1.getType().equalsIgnoreCase("integer")) {
            int value = operand1.getInt() + operand2.getInt();
            op.setValue("integer", (double) value, value);
        } else if (operand1.getType().equalsIgnoreCase("double")) {
            double value = operand1.getDouble() + operand2.getDouble();
            op.setValue(operand1.getType(), value, (int) value);
        } else
            return null;

        ans.setAnswer(op.getType(), op);
        return ans;
    }
}
