package arithmetic;

import java.util.function.BiFunction;

public class operation {
     PLUS {
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS {
        public double apply(double a, double b) {
            return a - b;
        }
    },
    TIMES {
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        public double apply(double a, double b) {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            return a / b;
        }
    };

    public abstract double apply(double a, double b);
}
