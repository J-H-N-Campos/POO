package batatasfritas.apresentacao;

import javax.swing.*;

public class Entrada
{
    static final String STRING_TITLE = "Entre com uma string";
    static final String CHAR_TITLE = "Entre com um char";
    static final String INT_TITLE = "Entre com um int";
    static final String BOOLEAN_TITLE = "Selecione true ou false";
    static final String DOUBLE_TITLE = "Entre com um double";
    static final String TRUE = "true";
    static final String FALSE = "false";
    static final String EMPTY_STRING = "";

    private Entrada()
    {
    }

    public static String leiaString() {
        return leiaString("","");
    }

    public static String leiaString(String prompt) {
        return leiaString(prompt,"");
    }

    public static String leiaString(String prompt, String initialValue) {
        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = {"OK"};

        boolean validResponse = false;

        String result = null;

        while (!validResponse) {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           JOptionPane.OK_CANCEL_OPTION,
                                                           null,
                                                           options,
                                                           options[0]);

            optionPane.setWantsInput(true);
            optionPane.setInitialSelectionValue(initialValue);
            JDialog dialog = optionPane.createDialog(null, STRING_TITLE);

            dialog.pack();
            dialog.show();

            Object response = optionPane.getInputValue();

            if (response != JOptionPane.UNINITIALIZED_VALUE) {
                result = (String) response;
                if (result != null)
                    validResponse = true;
                else {
                    commentArray[1] = "Entrada inválida: ";
                    commentArray[2] = "Entre com uma string válida";
                }
            } else {
                commentArray[1] = "Precisa entrar com uma string";
                commentArray[2] = EMPTY_STRING;
            }
        }
        return result;
    }
    public static char leiaChar() {
        return leiaChar("","");
    }

    public static char leiaChar(String prompt) {
        return leiaChar(prompt,"");
    }

    public static char leiaChar(String prompt, char initialValue) {
        return leiaChar(prompt,Character.toString(initialValue));
    }

    public static char leiaChar(String prompt, String initialValue) {
        char response = (initialValue != null && initialValue.length() > 0) ? initialValue.charAt(0) : '-'; // EA: modified

        String result = null;

        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = {"OK"};

        boolean validResponse = false;

        while (!validResponse) {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           JOptionPane.OK_CANCEL_OPTION,
                                                           null,
                                                           options,
                                                           options[0]);

            optionPane.setWantsInput(true);
            optionPane.setInitialSelectionValue(initialValue);  // EA: added
            JDialog dialog = optionPane.createDialog(null, CHAR_TITLE);

            dialog.pack();
            dialog.show();

            result = null;
            Object input = optionPane.getInputValue();
            if (input != JOptionPane.UNINITIALIZED_VALUE) {
                result = (String) input;
                if (result != null) {
                    if (result.length() == 1) {
                        response = result.charAt(0);
                        validResponse = true;
                    } else {
                        commentArray[1] = "Entrada inválida: " + result;
                        commentArray[2] = "Entre com apenas um caracter";
                    }
                } else {
                    commentArray[1] = "Entrada inválida";
                    commentArray[2] = "Entre com apenas um caracter";
                }
            } else {
                commentArray[1] = "Precisa entrar com apenas um caracter"; 
                commentArray[2] = EMPTY_STRING; 
            }
        }
        return response;
    }

    public static boolean leiaBoolean() {
        return leiaBoolean("", TRUE, FALSE);
    }

    public static boolean leiaBoolean(String prompt) {
        return leiaBoolean(prompt, TRUE, FALSE);
    }

    public static boolean leiaBoolean(String prompt, String trueText, String falseText) {
        Object[] commentArray = {prompt, EMPTY_STRING};
        boolean validResponse = false;
        int result = -1;

        while (!validResponse) {
            Object[] options = {trueText, falseText};
            result = JOptionPane.showOptionDialog(null,
                                                  commentArray,
                                                  BOOLEAN_TITLE,
                                                  JOptionPane.YES_NO_OPTION,
                                                  JOptionPane.QUESTION_MESSAGE,
                                                  null, 
                                                  options,
                                                  trueText);

      
            if (result == JOptionPane.YES_OPTION || result == JOptionPane.NO_OPTION)
            {
                validResponse = true;
            } else {
                commentArray[1] = "Sele��o incorreta: escolha os bot�es true ou false";
            }
        }
        return (result == 0);
    }

    public static int leiaInt() {
        return leiaInt("","");
    }

    public static int leiaInt(String prompt) {
        return leiaInt(prompt,"");
    }
    
    public static int leiaInt(String prompt, int initialValue) {
        return leiaInt(prompt,Integer.toString(initialValue));
    }

    public static int leiaInt(String prompt, String initialValue) {
        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = {"OK"};

        boolean validResponse = false;

        int response = 0;
        while (!validResponse) {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           JOptionPane.OK_CANCEL_OPTION,
                                                           null,
                                                           options,
                                                           options[0]);

            optionPane.setWantsInput(true);
            optionPane.setInitialSelectionValue(initialValue);  // EA: added
            JDialog dialog = optionPane.createDialog(null, INT_TITLE);

            dialog.pack();
            dialog.show();

            Object input = optionPane.getInputValue();
            if (input == JOptionPane.UNINITIALIZED_VALUE) {
                commentArray[1] = "Precisa entrar com um valor inteiro"; 
                commentArray[2] = EMPTY_STRING;
            } else {
                String result = (String) input;
                if (result == null) {
                    commentArray[1] = "Valor inteiro inv�lido:";
                    commentArray[2] = "Entre com um valor inteiro v�lido";
                } else {
                    try {
                       
                        response = Integer.parseInt(result);
                        validResponse = true;
                    } catch (NumberFormatException exception) {
                        commentArray[1] = "Valor inteiro inv�lido: " + result;
                        commentArray[2] = "Entre com um valor inteiro v�lido";
                        initialValue = result; 
                    }
                }
            }
        }
        return response;
    }

    public static double leiaDouble() {
        return leiaDouble("","");
    }

    public static double leiaDouble(String prompt) {
        return leiaDouble(prompt,"");
    }

    public static double leiaDouble(String prompt, double initialValue) {
        return leiaDouble(prompt,Double.toString(initialValue));
    }

    public static double leiaDouble(String prompt, String initialValue) {
        Object[] options = {"OK"};
        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};

        boolean validResponse = false;

        double response = 0.0;

        while (!validResponse) {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           JOptionPane.OK_CANCEL_OPTION,
                                                           null,
                                                           options,
                                                           options[0]);

            optionPane.setWantsInput(true);
            optionPane.setInitialSelectionValue(initialValue);  
            JDialog dialog = optionPane.createDialog(null, DOUBLE_TITLE);

            dialog.pack();
            dialog.show();

            Object input = optionPane.getInputValue();
            if (input == JOptionPane.UNINITIALIZED_VALUE) {
                commentArray[1] = "Precisa entrar com um valor fracion�rio"; 
                commentArray[2] = EMPTY_STRING;
            } else {
                String result = (String) input;
                if (result == null) { 
                    commentArray[1] = "valor fracion�rio inv�lido:";
                    commentArray[2] = "Entre com um valor fracion�rio v�lido";
                } else {
                 
                    try {
                        
                        response = Double.valueOf(result).doubleValue();
                        response = Double.valueOf(result).doubleValue();
                        validResponse = true;
                    } catch (NumberFormatException exception) {
                       
                        commentArray[1] = "Valor fracion�rio inv�lido: " + result;
                        commentArray[2] = "Entre com um valor fracion�rio v�lido";
                        initialValue = result;  
                    }
                }
            }
        }
        return response;
    }
}
