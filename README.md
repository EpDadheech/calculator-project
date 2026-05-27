# Java Swing Calculator

A fully functional GUI calculator built with Java Swing, featuring a clean and intuitive interface with large buttons and display.

## Features

- **Basic Arithmetic Operations**: Addition (+), Subtraction (-), Multiplication (*), Division (/)
- **Number Input**: Digits 0-9 with large, easy-to-click buttons
- **Decimal Support**: Floating-point calculations with decimal point (.)
- **Clear Functions**:
  - **C (Clear)**: Clears all data and resets the calculator
  - **CE (Clear Entry)**: Clears only the current entry
- **Large Display**: 32pt font for easy readability
- **Big Buttons**: 24pt font on all buttons for better visibility
- **Error Handling**: Division by zero protection
- **Chain Calculations**: Perform multiple operations in sequence

## Technical Specifications

- **Language**: Java (JDK 8 or higher)
- **GUI Framework**: Swing (javax.swing)
- **Window Size**: 400x600 pixels
- **Display Font**: Arial Bold, 32pt
- **Button Font**: Arial Bold, 24pt
- **Layout**: BorderLayout with GridLayout for buttons

## Project Structure

```
calculator-project/
├── src/
│   └── Calculator.java    # Main application file
└── README.md              # This file
```

## How to Compile

Navigate to the `src` directory and compile the Java file:

```bash
cd calculator-project/src
javac Calculator.java
```

## How to Run

After compilation, run the calculator:

```bash
java Calculator
```

Or compile and run in one step:

```bash
cd calculator-project/src
javac Calculator.java && java Calculator
```

## How to Use

### Basic Operations

1. **Enter Numbers**: Click number buttons (0-9) to enter values
2. **Decimal Numbers**: Click the decimal point (.) button for floating-point numbers
3. **Perform Operations**:
   - Click an operator button (+, -, *, /)
   - Enter the second number
   - Click equals (=) to see the result

### Examples

**Addition**: `5 + 3 = 8`
- Click: 5 → + → 3 → =

**Subtraction**: `10 - 4 = 6`
- Click: 1 → 0 → - → 4 → =

**Multiplication**: `7 * 6 = 42`
- Click: 7 → * → 6 → =

**Division**: `20 / 4 = 5`
- Click: 2 → 0 → / → 4 → =

**Decimal Calculation**: `3.5 + 2.5 = 6`
- Click: 3 → . → 5 → + → 2 → . → 5 → =

**Chain Calculations**: `5 + 3 - 2 = 6`
- Click: 5 → + → 3 → - → 2 → =

### Clear Functions

- **C (Clear)**: Resets the calculator completely, clearing all stored values and operations
- **CE (Clear Entry)**: Clears only the current number being entered, keeping previous operations intact

## Button Layout

```
┌─────────────────────────────┐
│         Display             │
├────────┬────────┬────────┬──┤
│   C    │   CE   │   /    │ *│
├────────┼────────┼────────┼──┤
│   7    │   8    │   9    │ -│
├────────┼────────┼────────┼──┤
│   4    │   5    │   6    │ +│
├────────┼────────┼────────┼──┤
│   1    │   2    │   3    │ =│
├────────┼────────┼────────┼──┤
│   0    │        │   .    │  │
└────────┴────────┴────────┴──┘
```

## Color Scheme

- **Number Buttons**: Light gray (RGB: 230, 230, 230)
- **Operator Buttons** (+, -, *, /): Orange (RGB: 255, 200, 100)
- **Equals Button** (=): Light blue (RGB: 100, 200, 255)
- **Clear Button** (C): Light red (RGB: 255, 100, 100)
- **Clear Entry Button** (CE): Lighter red (RGB: 255, 150, 150)
- **Display**: White background with gray border

## Error Handling

- **Division by Zero**: Displays "Error" message when attempting to divide by zero
- **Invalid Operations**: Prevents invalid input sequences

## System Requirements

- Java Development Kit (JDK) 8 or higher
- Operating System: Windows, macOS, or Linux
- Display: Minimum resolution of 400x600 pixels

## Development Details

### Key Components

1. **Calculator Class**: Extends JFrame and implements ActionListener
2. **Display Field**: JTextField for showing numbers and results
3. **Number Buttons**: Array of 10 JButtons (0-9)
4. **Function Buttons**: Array of 8 JButtons (operators and functions)
5. **State Variables**: 
   - `num1`, `num2`: Store operands
   - `operator`: Stores current operation
   - `startNewNumber`: Flag for input state

### Event Handling

- All buttons use ActionListener interface
- Number buttons append digits to display
- Operator buttons store values and set operation mode
- Equals button performs calculation and displays result
- Clear buttons reset calculator state

## Future Enhancements (Optional)

- Memory functions (M+, M-, MR, MC)
- Keyboard input support
- Calculation history
- Scientific functions (sin, cos, tan, log, etc.)
- Percentage calculations
- Square root and power functions

## License

This is a free educational project. Feel free to use, modify, and distribute.

## Author

Created as a Java Swing GUI calculator demonstration project.

---

**Enjoy calculating!** 🧮