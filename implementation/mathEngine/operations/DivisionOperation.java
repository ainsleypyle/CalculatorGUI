/**
 * Division Operation file which divides two operands
 *
 * @summary Division Operation
 * @author Ainsley Pyle
 *
 * Created at     : 2023-11-06 12:41:08 
 * Last modified  : 2023-11-06 12:41:08 
 */


package CalculatorInProgress.implementation.mathEngine.operations;

import CalculatorInProgress.implementation.mathEngine.CalculatorAnswer;
import CalculatorInProgress.implementation.mathEngine.CalculatorOperand;
import CalculatorInProgress.implementation.mathEngine.CalculatorOperation;
import CalculatorInProgress.interfaces.ICalculatorAnswer;
import CalculatorInProgress.interfaces.IOperand;

public class DivisionOperation extends CalculatorOperation {
    /**
     * build the operation first set its name.
     * 
     * @param opName
     */
    public DivisionOperation(String opName) {
        m_opName = opName;
    }
    public DivisionOperation(){
        setOperation("/");
    }

    @Override
    public ICalculatorAnswer doOperation() {
        ICalculatorAnswer ans = new CalculatorAnswer();
        IOperand op = new CalculatorOperand();
        if(operand1.getType().equalsIgnoreCase("integer")){
            double x = operand1.getDouble() / operand2.getDouble();
            op.setValue(operand1.getType(), (double) x, (int) x );
        }
        else{
            int x = operand1.getInt()/operand2.getInt();
            op.setValue(operand1.getType(),(double)x, (int)x);
        }
        
        ans.setAnswer(operand1.getType(), op);
        return ans;

     
    }
}