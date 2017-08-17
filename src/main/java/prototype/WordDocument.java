package prototype;

import java.util.ArrayList;

public class WordDocument implements Cloneable {

    private String text;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("----------------WordDocument 构造函数----------------");
    }

    public void showDocument() {
        System.out.println("----------------Word Content Start-----------------");
        System.out.println("Text: " + this.text);
        System.out.println("Image List: ");
        for (String image : mImages) {
            System.out.println("Image name: " + image);
        }
        System.out.println("----------------Word Content Stop-----------------");
    }

    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        try {
            WordDocument wordDocument = (WordDocument) super.clone();
            wordDocument.setText(this.getText());
            wordDocument.setImages(this.getImages());
            return wordDocument;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setImages(ArrayList<String> images) {
        mImages = images;
    }

    public void addImage(String image) {
        this.mImages.add(image);
    }
}
