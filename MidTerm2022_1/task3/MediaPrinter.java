package hr.fer.oop.zad3;

public class MediaPrinter<T extends Media> extends PrintableList<T>{
    @Override
    public String print(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size();i++){
            Media el=elementAt(i);
            sb.append(String.format("%s is %d seconds long.\n", el.getTitle(), el.getLength()));
        }
        return sb.toString();
    }
}
