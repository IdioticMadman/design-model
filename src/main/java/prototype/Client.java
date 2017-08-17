package prototype;

public class Client {

    public static void main(String[] args) {

        WordDocument wordDocument = new WordDocument();
        wordDocument.addImage("图片1");
        wordDocument.addImage("图片2");
        wordDocument.addImage("图片3");
        wordDocument.setText("这是一篇文档");

        try {
            WordDocument clone = wordDocument.clone();
            clone.addImage("新增的图片");
            clone.showDocument();
            clone.setText("这是修改过的文本");
            clone.showDocument();
            System.out.println(clone.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(wordDocument.hashCode());
    }
}
