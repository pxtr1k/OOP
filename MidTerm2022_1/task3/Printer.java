package hr.fer.oop.zad3;

class Printer {
    public static String printVideoList(MyList<Video> videos){
      StringBuilder sb=new StringBuilder();
      for(int i=0;i< videos.size();i++){
          Video v=videos.elementAt(i);
          sb.append(String.format("%s - %d sec. - %s\n", v.getTitle(), v.getLength(), v.getFormat()));
      }
      return sb.toString();
    }

    public static String printAudioList(MyList<? extends Audio> audios){
     StringBuilder sb=new StringBuilder();
     for(int i=0;i< audios.size();i++){
         Audio a=audios.elementAt(i);
         sb.append(String.format("%s - %d sec. - %s\n", a.getTitle(), a.getLength(), a.getCodec()));
     }
     return sb.toString();
    }
}
