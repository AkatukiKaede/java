// scanner import
import java.util.Scanner;

// extendsとimplementsをして必要なメソッドの実装
public class bringitem extends getset implements inter {

    // scannerの実装
    Scanner a=new Scanner(System.in,"UTF-8");

    // privateでフィールド定義
    private String item;
    

    // コンストラクタの実装
    public bringitem(String item){
        this.item=item;
    }


    // 抽象クラスのSetItemの実装/セッタ
    @Override public void setItem(String item){
        this.item=item;
    }


    // 抽象クラスのGetItemの実装/ゲッタ
    @Override public String getItem(){
        return item;
    }


    // インターフェースの実装
    @Override public void bring(){
        String item=a.nextLine();
        setItem(item);
    }
}
