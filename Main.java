import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Leer la expresión infix del archivo de texto
        String infixExpression = readExpressionFromFile("datos.txt");
        System.out.println("Expresion infix leida del archivo: " + infixExpression);

        // Convertir la expresión infix a postfix
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String postfixExpression = infixToPostfix.convertToPostfix(infixExpression);
        System.out.println("Expresion postfix: " + postfixExpression);

        // Evaluar la expresión postfix
        double result = infixToPostfix.evaluatePostfix(postfixExpression);
        System.out.println("Resultado de la evaluacion: " + result);
    }

    // Método para leer la expresión infix desde un archivo de texto
    private static String readExpressionFromFile(String fileName) {
        StringBuilder expression = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                expression.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expression.toString();
    }
}