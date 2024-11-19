/**
 * the interface for the calculator operations.
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2021-03-30 20:40:07 
 * Last modified  : 2023-10-24 15:32:31
 */

package CalculatorInProgress.interfaces;

/**
 * the interface for operations
 */
public interface IOperation {
    /**
     * set the first operand for a binary operation
     * 
     * @param iOperand
     */
    public void setOperandOne(IOperand iOperand);

    /**
     * set the second operand for a binary operation
     * 
     * @param iOperand
     */
    public void setOperandTwo(IOperand iOperand);

    /**
     * get the operation that this object holds
     * 
     * @return
     */
    public String getOperation();

    /**
     * set the operation string to use for this operation
     * 
     * @param opName
     */
    public void setOperation(String op);

    /**
     * check to see if the object is set.
     * 
     * @return
     */
    public boolean isSet();

    /**
     * run the implemented operation
     * 
     * @return the answer to the operation.
     */
    public ICalculatorAnswer doOperation();
}
