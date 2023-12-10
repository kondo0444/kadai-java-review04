package animal;

public class Rewiew04 {

    public static void main(String[] args) {
        //Humanクラスのコンストラクタを起動してインスタンスを生成する
        Human tanaka = new Human("田中 太郎", 25, "電車");
        Human suzuki = new Human("鈴木 次郎", 30, "野球");
        Human sato = new Human("佐藤 花子", 20, "映画");

        // 生成したインスタンスの sayと think メソッドを実行する
        tanaka.say();
        tanaka.think();

        suzuki.say();
        suzuki.think();

        sato.say();
        sato.think();

    }

}
