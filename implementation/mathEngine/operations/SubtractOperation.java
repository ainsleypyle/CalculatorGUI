/**
 * another example operation class.
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-24 14:50:47 
 * Last modified  : 2023-10-24 15:43:01
 */

package CalculatorInProgress.implementation.mathEngine.operations;

import CalculatorInProgress.implementation.mathEngine.CalculatorAnswer;
import CalculatorInProgress.implementation.mathEngine.CalculatorOperand;
import CalculatorInProgress.implementation.mathEngine.CalculatorOperation;
import CalculatorInProgress.interfaces.ICalculatorAnswer;

public class SubtractOperation extends CalculatorOperation {
    /**
     * build the operation first set its name.
     * 
     * @param opName
     */
    public SubtractOperation(String opName) {
        m_opName = opName;
    }

    @Override
    public ICalculatorAnswer doOperation() {
        CalculatorAnswer ans = new CalculatorAnswer();
        CalculatorOperand op = new CalculatorOperand();

        if (operand1.getType().equalsIgnoreCase("integer")) {
            int value = operand1.getInt() - operand2.getInt();
            op.setValue("integer", (double)value, value);
        } else if (operand1.getType().equalsIgnoreCase("double")) {
            double value = operand1.getDouble() - operand2.getDouble();
            op.setValue(operand1.getType(), value, (int) value);
        } else
            return null;

        ans.setAnswer(op.getType(), op);
        return ans;
    }
}
