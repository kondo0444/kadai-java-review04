package animal;

public class Human extends Animal implements Thinkable {
    private String 趣味;
    public Human(String 名前, int 年齢, String 趣味) {
     // // 名前と年齢の初期化については、スーパークラス（Animal）のコンストラクタを利用
     super(名前, 年齢);
     this.趣味 = 趣味;

    }

    public void think() {
    // 趣味のフィールドに入っている文字列の中身を利用して、私は□□について考えています。
    // と画面に System.out.println() で表示する
    System.out.println("私は" + 趣味 + "について考えています。");
    }
}