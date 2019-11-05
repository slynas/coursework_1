import java.util.ArrayList;

class Dec2Hex
{
    public static void main(String[] args)
    {
        Dec2HexImpl dec2Hex = new Dec2HexImpl();
        ArrayList<String> values = new ArrayList<String>();
        values.add("23");
        dec2Hex.decToHex(values);
    }
}
