public abstract class ArithmeticExp {
    public void evaluate(){

    }
}

class Number extends ArithmeticExp {
    private int value;

    @Override
    public void evaluate(){

    }
}

class Binary extends ArithmeticExp {
    private ArithmeticExp left;
    private ArithmeticExp right;

    @Override
    public void evaluate(){

    }
}

class Product extends Binary {
    @Override
    public void evaluate(){

    }
}

class Sum extends Binary {
    @Override
    public void evaluate(){

    }
}
