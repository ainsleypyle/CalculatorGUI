/**
 * Test application for calculator. Added the operations for multiplication and division
 *
 * @summary Test Application 
 * @author Ainsley Pyle
 *
 * Created at     : 2023-11-06 12:44:51 
 * Last modified  : 2023-11-06 12:45:40
 */



package CalculatorInProgress.implementation.base;

import java.util.ArrayList;
import java.util.Scanner;

//import CalculatorInProgress.implementation.UI.CalculatorFrame;
import CalculatorInProgress.implementation.mathEngine.*;
import CalculatorInProgress.implementation.mathEngine.operations.AdditionOperation;
import CalculatorInProgress.implementation.mathEngine.operations.DivisionOperation;
import CalculatorInProgress.implementation.mathEngine.operations.MultiplicationOperation;
import CalculatorInProgress.implementation.mathEngine.operations.NullOperation;
import CalculatorInProgress.implementation.mathEngine.operations.SubtractOperation;
import CalculatorInProgress.interfaces.*;

public class CalculatorTest {
    /**
     * lists out the operations available
     * 
     * @param calcEngine
     */
    private static void ListOperations(ICalculator calcEngine) {
        System.out.println(calcEngine.toString());
    }

    /**
     * the main entry point for the test application.
     * 
     * @param args
     */
    public static void main(String[] args) {
        ICalculator calc = new CalculatorEngine();

        Scanner ioOps = new Scanner(System.in);
        String op = "";
        ArrayList<IOperand> operands = new ArrayList<IOperand>();
        IOperand operand = new CalculatorOperand();
        IOperation operation = new NullOperation();

        // CalculatorFrame calcUI = new CalculatorFrame(calc);

        // this tests the operations...

        do {
            System.out.print("enter operation L for list of available: ");
            op = ioOps.nextLine();
            switch (op) {
                case "L": {
                    ListOperations(calc);
                    break;
                }
                case "+": {
                    operation = new AdditionOperation("+");
                    break;
                }
                case "-": {
                    operation = new SubtractOperation("-");
                    calc.addOperation(operation);
                    break;
                }
                case "/":
                    operation = new DivisionOperation("/");
                    calc.addOperation(operation);
                    break;
                case "*":
                    operation = new MultiplicationOperation("*");
                    calc.addOperation(operation);
                    break;
                case "^":
                    
                case "%": {
                    // operation.setOperation(op);
                    break;
                }
                case "=": {
                    // this is where to run the operation.
                    if ((operands.size() == 2) && (operand.isSet())) {

                        operation.setOperandOne(operands.get(0));
                        operation.setOperandTwo(operands.get(1));

                        ICalculatorAnswer a = calc.doOperation(operation, operands);
                        System.out.println("the answer is :" + a.getAnswer().toString());
                        // clear out the operands
                        operands = new ArrayList<IOperand>();
                    }
                }
                default: {
                    try {
                        int x = Integer.parseInt(op);
                        operand = new CalculatorOperand();
                        operand.setValue("integer", 0, x);
                        operands.add(operand);
                    } catch (NumberFormatException e) {
                        try {
                            double d = Double.parseDouble(op);
                            operand = new CalculatorOperand();
                            operand.setValue("double", d, 0);
                            operands.add(operand);
                        } catch (NumberFormatException ne) {

                        }
                    }
                }
            }
        } while (!op.equalsIgnoreCase("Q"));
        ioOps.close();
    }
}
