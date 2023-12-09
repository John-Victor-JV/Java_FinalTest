public abstract class ArithmeticExp {
    public abstract int evaluate();

    public abstract String ToString();
}

class Number extends ArithmeticExp {
    private int value;

    public Number( int value){
        this.value = value;
    }

    @Override
    public int evaluate(){
        return value;
    }

    @Override
    public String ToString(){
        return Integer.toString(value);
    }
}

class Binary extends ArithmeticExp {
    private ArithmeticExp left;
    private ArithmeticExp right;
    private String operator;

    public ArithmeticExp getLeft() {
        return left;
    }

    public ArithmeticExp getRight() {
        return right;
    }

    public Binary(ArithmeticExp left, ArithmeticExp right, String operator){
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
    @Override
    public int evaluate(){
        int value = left.evaluate() + right.evaluate();
        return value;
    }

    @Override
    public String ToString(){
        return left.ToString() + " " + operator + " " + right.ToString();
    }
}

class Product extends Binary {

    public Product(ArithmeticExp left, ArithmeticExp right){
        super(left, right, "*");
    }
    @Override
    public int evaluate(){
        return getLeft().evaluate() * getRight().evaluate();
    }

    @Override
    public String ToString(){
        return getLeft().ToString() + " * " + getRight().ToString() + " = " + evaluate();
    }
}

class Sum extends Binary {

    public Sum(ArithmeticExp left, ArithmeticExp right){
        super(left, right, "+");
    }
    @Override
    public int evaluate() {
        return getLeft().evaluate() + getRight().evaluate();
    }

    @Override
    public String ToString() {
        return getLeft().ToString() + " + " + getRight().ToString() + " = " + evaluate();
    }
}

class Modulo extends Binary {

    public Modulo(ArithmeticExp left, ArithmeticExp right){
        super(left, right, "%");
    }
    @Override
    public int evaluate(){
        return getLeft().evaluate() % getRight().evaluate();
    }

    @Override
    public String ToString() {
        return getLeft().ToString() + " % " + getRight().ToString() + " = " + evaluate();
    }
}
