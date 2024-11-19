/**
 * An interface to build a calculator around.
 *
 * @summary calculator interface
 * @author Ainsley Pyle
 *
 * Created at     : 2021-03-30 20:36:04 
 * Last modified  : 2023-10-24 15:32:11
 */

package CalculatorInProgress.interfaces;

import java.util.ArrayList;

/**
 * the interface for a calculator project.
 */
public interface ICalculator {
    /**
     * set a new operation in the calculator
     * 
     * @param op
     * @return
     */
    public boolean addOperation(IOperation op);

    /**
     * gets the list of the available operations
     * 
     * @return the arraylist of operations
     */
    public ArrayList<IOperation> getOperations();

    /**
     * do the operation
     * 
     * @param op       the operation to do
     * @param operands the operands required for the operation
     * @return the result of the operation.
     */
    public ICalculatorAnswer doOperation(IOperation op, ArrayList<IOperand> operands);
}
