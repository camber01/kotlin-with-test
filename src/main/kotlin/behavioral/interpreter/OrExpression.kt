package behavioral.interpreter

class OrExpression(expr1: Expression?, expr2: Expression?) : Expression {
    private var expr1: Expression? = null
    private var expr2: Expression? = null

    init {
        this.expr1 = expr1
        this.expr2 = expr2
    }

    override fun interpret(context: String?): Boolean {
        return expr1!!.interpret(context) || expr2!!.interpret(context)
    }
}
