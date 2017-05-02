package xyz.javecs.tools.text2expr.test.java;

import org.junit.Assert;
import org.junit.Test;
import xyz.javecs.tools.text2expr.Text2Expr;

public class Text2ExprTest {
    @Test
    public void testExpr() {
        Text2Expr text2Expr = new Text2Expr();
        Assert.assertEquals("5", text2Expr.eval("3+2", false));
    }

}
