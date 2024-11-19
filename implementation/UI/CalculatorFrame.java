/**
 * The frame that holds the calculator UI
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-24 17:23:53 
 * Last modified  : 2023-10-24 17:25:40
 */


package CalculatorInProgress.implementation.UI;

import java.awt.*;
import javax.swing.JFrame;

import CalculatorInProgress.implementation.mathEngine.CalculatorMemory;
import CalculatorInProgress.interfaces.ICalculator;

/**
 * the main frame for the application. The other parts will
 * be layered on top of this frame.
 */
public class CalculatorFrame extends JFrame {
    private ICalculator m_engine;
    private CalculatorMemory m_memory;
    private CalculatorMainDisplayPanel m_displayTextPanel;
    private CalculatorNumberPanel m_numbers;
    private CalculatorRightSidePanel m_rightSide;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public CalculatorFrame(ICalculator engine) {
        m_engine = engine;
        m_memory = new CalculatorMemory();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        // set the size here.
        setSize(400, 400);
        Dimension d = new Dimension(400, 400);
        setPreferredSize(d);
        m_displayTextPanel = new CalculatorMainDisplayPanel(this);
        add(m_displayTextPanel, BorderLayout.NORTH);

        m_numbers = new CalculatorNumberPanel(this);
        add(m_numbers, BorderLayout.CENTER);

        m_rightSide = new CalculatorRightSidePanel(this);
        add(m_rightSide, BorderLayout.EAST);

        pack();
        setVisible(true);
    }
    /**
     * gets the "engine" for calculations
     */
    public ICalculator getEngine() {
        return m_engine;
    }
    /**
     * get a memory object NOT USED
     */
    public CalculatorMemory getMemory() {
        return m_memory;
    }
    /**
     * sets what is displayed on the UI
     * @param value
     */
    public void setDisplayValue(String value) {
        m_displayTextPanel.setDisplay(value);
    }
    /**
     * gets what is being displayed on the UI
     * @return
     */
    public String getDisplayValue() {
        return m_displayTextPanel.getDisplay();
    }
    /**
     * clears what is on the display
     */
    public void clearDisplay() {
        m_displayTextPanel.clearDisplay();
    }
}
