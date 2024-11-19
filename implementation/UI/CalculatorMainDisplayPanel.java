/**
 * Gets the main part of the calculator UI
 *
 * @summary short description for the file
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-24 17:26:01 
 * Last modified  : 2023-10-24 17:27:09
 */

package CalculatorInProgress.implementation.UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

//import CalculatorInProgress.implementation.UI.CalculatorFrame;
//import CalculatorInProgress.implementation.UI.CalculatorMainDisplayText;

/**
 * the panel that will hold the text that is the display
 */
public class CalculatorMainDisplayPanel extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private CalculatorMainDisplayText m_displayText;
    private CalculatorFrame m_parent;

    public CalculatorMainDisplayPanel(CalculatorFrame parent) {
        m_parent = parent;
        setLayout(new BorderLayout());
        Dimension d = new Dimension(parent.getSize().width, parent.getSize().height / 4);
        setSize(d);
        setPreferredSize(d);
        m_displayText = new CalculatorMainDisplayText(parent);
        add(m_displayText, BorderLayout.CENTER);
    }
    /**
     * get the host frame
     */
    public CalculatorFrame getParent(){
        return m_parent;
    }
    /**
     * set what is to display on the frame
     * @param value
     */
    public void setDisplay(String value) {
        m_displayText.setText(value);
    }
    /**
     * clear what is shown on the display
     */
    public void clearDisplay() {
        m_displayText.setText("");
    }
    /**
     * get what is displayed
     */
    public String getDisplay() {
        return m_displayText.getText();
    }
}