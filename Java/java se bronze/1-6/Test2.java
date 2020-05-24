class Test2{
    public static void Main(String[] args){
        System.out.println(10);
    }
}

/*
ちなみに、実行をミスるとこんなのが出る
C:\Users\kohon\OneDrive\デスクトップ\gitrepo\java se bronze>javac Test2
エラー: クラス名'Test2'が受け入れられるのは、注釈処理が明示的にリクエストされた場合のみです
エラー1個

実行できないケース
C:\Users\kohon\OneDrive\デスクトップ\gitrepo\java se bronze>java Test2
エラー: メイン・メソッドがクラスTest2で見つかりません。次のようにメイン・メソッドを定義してください。
   public static void main(String[] args)
またはJavaFXアプリケーション・クラスはjavafx.application.Applicationを拡張する必要があります

*/