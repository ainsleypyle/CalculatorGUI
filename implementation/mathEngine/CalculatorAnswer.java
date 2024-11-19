/**
 * the implementation of the answer to the problem.
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2021-03-30 20:44:16 
 * Last modified  : 2023-10-24 15:30:26
 */
package CalculatorInProgress.implementation.mathEngine;

import CalculatorInProgress.interfaces.ICalculatorAnswer;
import CalculatorInProgress.interfaces.IOperand;

/**
 * 
 */
public class CalculatorAnswer implements ICalculatorAnswer {
    private String m_typeName;
    private IOperand m_answer;

    @Override
    public void setAnswer(String typeName, IOperand answer) {
        m_typeName = typeName;
        m_answer = answer;
    }

    public String getType() {
        return m_typeName;
    }

    @Override
    public IOperand getAnswer() {
        return m_answer;
    }

}
