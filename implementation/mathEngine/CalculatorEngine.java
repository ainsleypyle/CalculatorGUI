/**
 * the implementation of the calcultor engine
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2021-03-30 20:43:45 
 * Last modified  : 2023-10-24 15:30:33
 */
package CalculatorInProgress.implementation.mathEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import CalculatorInProgress.implementation.mathEngine.operations.AdditionOperation;
import CalculatorInProgress.interfaces.ICalculator;
import CalculatorInProgress.interfaces.ICalculatorAnswer;
import CalculatorInProgress.interfaces.IOperand;
import CalculatorInProgress.interfaces.IOperation;

/**
 * This class implements the ICalculator interface.
 * To add Calculator functions:
 * 1 update the arraylist of operations in the constructor
 * 2 add the operation to the doOperations switch statement
 * 3 implement the operation.
 */
public class CalculatorEngine implements ICalculator {
    // ArrayList<IOperation> m_operations;
    private Map<String, IOperation> m_opMap;

    public CalculatorEngine() {
        m_opMap = new HashMap<String, IOperation>();

        CalculatorOperation addOp = new AdditionOperation("+");
        // m_operations = new ArrayList<>();
        // m_operations.add(addOp);
        m_opMap.put(addOp.getOperation(), addOp);

    }

    @Override
    public ArrayList<IOperation> getOperations() {
        ArrayList<IOperation> _operations = new ArrayList<IOperation>();

        for (IOperation iop : m_opMap.values())
            _operations.add(iop);

        return _operations;
    }

    @Override
    public boolean addOperation(IOperation op) {
        if (!m_opMap.containsKey(op.getOperation()))
            m_opMap.put(op.getOperation(), op);
        return true;
    }

    @Override
    public ICalculatorAnswer doOperation(IOperation op, ArrayList<IOperand> operands) {
        ICalculatorAnswer calcAns = new CalculatorAnswer();
        /*
         * switch(op.getOperation()){
         * case "+":{
         * AddOperation a = (AddOperation) m_opMap.get(op.getOperation());
         * a.setOperandOne(operands.get(0));
         * a.setOperandTwo(operands.get(1));
         * 
         * calcAns = a.doOperation();
         * }
         * }
         */
        op.setOperandOne(operands.get(0));
        if (operands.size() > 1)
            op.setOperandTwo(operands.get(1));

        calcAns = op.doOperation();

        return calcAns;
    }

    /**
     * 
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("The operations are : \n");
        for (IOperation iOperation : m_opMap.values()) {
            sb.append(iOperation.getOperation() + "\n");
        }
        return sb.toString();
    }
}
