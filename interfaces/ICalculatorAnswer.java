/**
 * An interface to build for supplying answers
 * for the calculator
 *
 * @summary calculator answer
 * @author Ainsley Pyle
 *
 * Created at     : 2021-03-30 20:37:43 
 * Last modified  : 2023-10-24 15:32:17
 */

package CalculatorInProgress.interfaces;

/**
 * a simple answer for a math problem interface
 */
public interface ICalculatorAnswer {
    /**
     * set the type of the answer to the problem
     * 
     * @param typeName int or double
     * @param answer   the result
     */
    public void setAnswer(String typeName, IOperand answer);

    /**
     * gets the IOpernd version of the answer
     * 
     * @return the answer as an operand
     */
    public IOperand getAnswer();
}
