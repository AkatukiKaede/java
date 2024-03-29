// メインメソッドの実装
public class user {
    public static void main(String[] args) {
        // Line Notifyのトークン 
        String token = "7GPXpoal5iEdncdkKDzUQeFLuI3pfgZ67oDVXbyuvu0";

        // noneを入れてbringitemを無理やりインスタンス化させる
        String none="none";
        bringitem item=new bringitem(none);

        // 持ち物の入力
        System.out.print("持ち物を入力してください:");
        item.bring();

        // 継承先のLineNotifyに渡す形はString型なのでgetItemでString型に変換
        String message=item.getItem();

        // LineNotifyに渡す
        LineNotify lineNotify = new LineNotify(token,message);

        // メッセージを送る
        lineNotify.notify(message);

    }
    
}
