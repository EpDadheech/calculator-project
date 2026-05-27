import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    // Display field
    private JTextField display;
    
    // Calculator state variables
    private double num1 = 0;
    private double num2 = 0;
    private char operator = ' ';
    private boolean startNewNumber = true;
    
    // Buttons
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[8];
    private JButton addButton, subButton, mulButton, divButton;
    private JButton equButton, clrButton, clrEntryButton, decButton;
    
    // Panel
    private JPanel panel;
    
    // Constructor
    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);
        
        // Create display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 32));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setText("0");
        display.setPreferredSize(new Dimension(380, 80));
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        
        // Create buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        clrButton = new JButton("C");
        clrEntryButton = new JButton("CE");
        decButton = new JButton(".");
        
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equButton;
        functionButtons[5] = clrButton;
        functionButtons[6] = clrEntryButton;
        functionButtons[7] = decButton;
        
        // Style function buttons
        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(new Font("Arial", Font.BOLD, 24));
            functionButtons[i].setFocusable(false);
            functionButtons[i].setPreferredSize(new Dimension(80, 80));
        }
        
        // Style operator buttons with different color
        addButton.setBackground(new Color(255, 200, 100));
        subButton.setBackground(new Color(255, 200, 100));
        mulButton.setBackground(new Color(255, 200, 100));
        divButton.setBackground(new Color(255, 200, 100));
        equButton.setBackground(new Color(100, 200, 255));
        clrButton.setBackground(new Color(255, 100, 100));
        clrEntryButton.setBackground(new Color(255, 150, 150));
        
        // Create number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 24));
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(230, 230, 230));
            numberButtons[i].setPreferredSize(new Dimension(80, 80));
        }
        
        // Create panel with grid layout
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Add buttons to panel in calculator layout
        // Row 1: C, CE, /, *
        panel.add(clrButton);
        panel.add(clrEntryButton);
        panel.add(divButton);
        panel.add(mulButton);
        
        // Row 2: 7, 8, 9, -
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(subButton);
        
        // Row 3: 4, 5, 6, +
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(addButton);
        
        // Row 4: 1, 2, 3, =
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(equButton);
        
        // Row 5: 0 (spanning 2 columns), ., (empty)
        panel.add(numberButtons[0]);
        panel.add(new JLabel("")); // Empty space
        panel.add(decButton);
        panel.add(new JLabel("")); // Empty space
        
        // Add components to frame
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        
        // Make frame visible
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle number button clicks
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                if (startNewNumber) {
                    display.setText(String.valueOf(i));
                    startNewNumber = false;
                } else {
                    if (display.getText().equals("0")) {
                        display.setText(String.valueOf(i));
                    } else {
                        display.setText(display.getText() + i);
                    }
                }
            }
        }
        
        // Handle decimal point
        if (e.getSource() == decButton) {
            if (startNewNumber) {
                display.setText("0.");
                startNewNumber = false;
            } else if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        }
        
        // Handle operator buttons
        if (e.getSource() == addButton) {
            handleOperator('+');
        }
        if (e.getSource() == subButton) {
            handleOperator('-');
        }
        if (e.getSource() == mulButton) {
            handleOperator('*');
        }
        if (e.getSource() == divButton) {
            handleOperator('/');
        }
        
        // Handle equals button
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(display.getText());
            double result = 0;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        startNewNumber = true;
                        return;
                    }
                    break;
            }
            
            // Format result to remove unnecessary decimals
            if (result == (long) result) {
                display.setText(String.valueOf((long) result));
            } else {
                display.setText(String.valueOf(result));
            }
            
            num1 = result;
            startNewNumber = true;
            operator = ' ';
        }
        
        // Handle clear button (C) - clears everything
        if (e.getSource() == clrButton) {
            display.setText("0");
            num1 = 0;
            num2 = 0;
            operator = ' ';
            startNewNumber = true;
        }
        
        // Handle clear entry button (CE) - clears current entry only
        if (e.getSource() == clrEntryButton) {
            display.setText("0");
            startNewNumber = true;
        }
    }
    
    // Helper method to handle operator button clicks
    private void handleOperator(char op) {
        if (!startNewNumber && operator != ' ') {
            // If there's a pending operation, calculate it first
            num2 = Double.parseDouble(display.getText());
            double result = 0;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        startNewNumber = true;
                        return;
                    }
                    break;
            }
            
            if (result == (long) result) {
                display.setText(String.valueOf((long) result));
            } else {
                display.setText(String.valueOf(result));
            }
            num1 = result;
        } else {
            num1 = Double.parseDouble(display.getText());
        }
        
        operator = op;
        startNewNumber = true;
    }
    
    // Main method
    public static void main(String[] args) {
        // Use SwingUtilities to ensure thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}

// Made with Bob
