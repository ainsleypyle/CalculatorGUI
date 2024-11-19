/**
 * The NULL operation to allow the app to compile
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-24 17:19:24 
 * Last modified  : 2023-10-24 17:21:07
 */

package CalculatorInProgress.implementation.mathEngine.operations;

import CalculatorInProgress.implementation.mathEngine.CalculatorOperation;
import CalculatorInProgress.interfaces.ICalculatorAnswer;

public class NullOperation extends CalculatorOperation {

    @Override
    public ICalculatorAnswer doOperation() {
        return null;
    }

}
