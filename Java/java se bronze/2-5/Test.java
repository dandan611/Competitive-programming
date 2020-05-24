class Test {
    public static void main(String[] args){
        shart s = 88000;
        byte b = -128;
        long l = 9876543210L;
        int i = -50000000;
    }
}

/*
実際に実行するとこうなる

C:\Users\kohon\OneDrive\デスクトップ\gitrepo\java se bronze\2-5>javac Test.java
Test.java:3: エラー: シンボルを見つけられません
        shart s = 88000;
        ^
  シンボル:   クラス shart
  場所: クラス Test
エラー1個

*?