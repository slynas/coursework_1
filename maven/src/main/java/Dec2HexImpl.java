import java.util.ArrayList;
import java.util.logging.Logger;

class Dec2HexImpl {

    private final static Logger LOGGER = Logger.getLogger(Dec2HexImpl.class.getName());
    private static int Arg1;

    String decToHex(ArrayList<String> values){
        if(values.size() > 0){
            try
            {
                Arg1 = Integer.parseInt(values.get(0));
            }
            catch (NumberFormatException e)
            {
                LOGGER.warning(String.format("Argument%s must be an integer.", values.get(0)));
                System.exit(1);
            }
        } else {
            LOGGER.warning("No value");
            System.exit(1);
        }
        char[] ch ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        int num = Arg1;
        String hexadecimal="";
        LOGGER.info(String.format("Converting the decimal Value %d to hex", num));

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        LOGGER.info(String.format("Hexadecimal value is: %s", hexadecimal));
        return hexadecimal;
    }
}
