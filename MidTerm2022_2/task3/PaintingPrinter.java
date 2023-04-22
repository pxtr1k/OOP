public class PaintingPrinter<E extends Painting> extends MyList<E> implements Printable{
    @Override
    public String print(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size();i++){
            Painting p=elementAt(i);
            sb.append(String.format("%s: %s painted by using %s\n", p.getAuthor(), p.getName(), p.getTechnique()));
        }
        return sb.toString();
    }
}
