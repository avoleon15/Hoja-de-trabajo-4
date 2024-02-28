interface Expression {
    String convertToPostfix(String infixExpression);
    double evaluatePostfix(String postfixExpression);
}