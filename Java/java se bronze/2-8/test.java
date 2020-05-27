class VariableTest{
    public static void main(String args[]){
        int x;
        x = 1;
        {
            x = 2;
            int y = 1;
            y = 2;
        }
        x = 3;
        y = 3;
    }
}