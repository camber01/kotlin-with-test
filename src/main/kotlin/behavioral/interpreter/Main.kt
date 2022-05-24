package behavioral.interpreter

object Main {
    //Robert and John are male
    val maleExpression: Expression
        get() {
            val robert: Expression = TerminalExpression("Robert")
            val john: Expression = TerminalExpression("John")
            return OrExpression(robert, john)
        }

    val marriedWomanExpression: Expression
        get() {
            val julie: Expression = TerminalExpression("Julie")
            val married: Expression = TerminalExpression("Married")
            return AndExpression(julie, married)
        }

    @JvmStatic
    fun main(args: Array<String>) {
        val isMale = maleExpression
        val isMarriedWoman = marriedWomanExpression
        System.out.println("John is male? " + isMale.interpret("John"))
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"))
    }
}
