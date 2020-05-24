class Taxi{
    public void drive(){
        System.out.println("drive a taxi");
    }
}

class Plane {
    public void fly(){
        System.out.println("fly a plane");
    }
}

public class Vehicle{
    public static void main(){
        Taxi tx = new Taxi();
        tx.drive();
    }
}

/*
public はファイル名を同じにして先天する必要があるらしい（javaコマンドを実行すると下記のようになる）
norimono.java:13: エラー: クラス Vehicleはpublicであり、ファイルVehicle.javaで宣言する必要があります
public class Vehicle{

エラー1個

ちなみに、classファイルは上記で記載されている3つが作成される。
設計モデルと対応するならそうだよね。
*/