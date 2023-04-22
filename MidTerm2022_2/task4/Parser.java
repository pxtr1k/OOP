import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Parser {
    public static Reading parseInputString(String input) throws ParseReadingFormatException{
        String[] parts=input.split(", ");
        if(parts.length==3){
            return proccesTypeA(parts);
        }else{
            parts=input.split(";");
            if(parts.length!=3){
                throw new IncorrectArgumentException();
            }else{
                return proccesTypeB(parts);
            }
        }
    }

    public static Reading proccesTypeA(String [] parts) throws ReadingFormatException{
         Integer serialNumber;
         Double readingValue;
         LocalDate date;

         try{
             serialNumber=Integer.parseInt(parts[0].split(":")[1]);
         }catch (Exception e){
             throw new ReadingFormatException(e);
         }try{
             date=parseDateForManufacturerA(parts[1].split(":")[1]);
        }catch (Exception e){
             throw new ReadingFormatException(e);
        }try{
             readingValue=Double.parseDouble(parts[2].split(": ")[1].substring(0, parts[2].split(": ")[1].length()-1));
        }catch (Exception e){
             throw new ReadingFormatException(e);
        }
         return new Reading(serialNumber, readingValue, date);
    }
    public static Reading proccesTypeB(String[] parts) throws ReadingFormatException{
        Integer serialNumber;
        Double readingValue;
        LocalDate date;

        try{
            serialNumber=Integer.parseInt(parts[0]);
        }catch (Exception e){
            throw new ReadingFormatException(e);
        }
        try{
            readingValue=Double.parseDouble(parts[2]);
        }catch (Exception e){
            throw new ReadingFormatException(e);
        }
        try{
            date=parseDateForManufacturerB(parts[1]);
        }catch (Exception e){
            throw new ReadingFormatException(e);
        }
      return new Reading(serialNumber, readingValue, date);
    }

    private static LocalDate parseDateForManufacturerA (String dateA) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        dtf = dtf.withLocale( Locale.GERMAN );
        LocalDate date = LocalDate.parse(dateA, dtf);

        return date;
    }

    private static LocalDate parseDateForManufacturerB (String dateB) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
        dtf = dtf.withLocale( Locale.GERMAN );
        LocalDate date = LocalDate.parse(dateB, dtf);

        return date;
    }

}
