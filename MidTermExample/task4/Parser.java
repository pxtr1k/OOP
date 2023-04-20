import static java.lang.Character.codePointAt;
import static java.lang.Character.isLetter;

public class Parser {
    public static User parseInputString(String input) throws Exception {
        Double OIB=null;
        String name=null;
        String surname=null;
        ServiceType serviceType=null;

        String[] parts = input.split("/");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Nedovoljno argumenata");
        }else{
            try{
                OIB=Double.parseDouble(parts[0]);
                name=parts[1];
                surname=parts[2];
                if(parts[3].equals("A"))
                    serviceType=ServiceType.SUBSCRIBE;
                else if(parts[3].equals("BA"))
                    serviceType=ServiceType.PREPAID;
                else if(parts[3].equals("C"))
                    serviceType=ServiceType.VIRTUAL;
                else
                    throw new ArgumentParseException("Error occured");
            }catch (Exception ex){
                throw new ArgumentParseException("Exception occured!");
            }
        }
        return new User(OIB, name, surname, serviceType);
    }
}