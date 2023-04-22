public class NameablePrinter<E extends Artwork & Nameable> extends MyList<E> implements Printable{
    @Override
    public String print(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size();i++){
            Artwork a=elementAt(i);
            Nameable n=elementAt(i);
            sb.append(String.format("%s: %s\n", a.getAuthor(), n.getName()));
        }
        return sb.toString();
    }
}
