package spring.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SPEL {

	public static void main(String[] args) {
		ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("'Hi SpEL'");
        String strVal = expression.getValue(String.class);
        System.out.println("expression value:\n" + strVal);
        expression = expressionParser.parseExpression("5 * 7");
        Integer intVal = expression.getValue(Integer.class);
        System.out.println("value:\n" + intVal);




	}

}
