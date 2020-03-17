package expression;

abstract class BinaryExpression implements Expression {
    protected Expression x;
    protected Expression y;

	BinaryExpression(Expression x, Expression y) {
        this.x = x;
        this.y = y;
    }
}