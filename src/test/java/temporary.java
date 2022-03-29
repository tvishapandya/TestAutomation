import java.util.ArrayList;


public class temporary {

    public static void main(String[] args){

        ArrayList colourLst = new ArrayList();
        colourLst.add("Red");
        colourLst.add("Green");
        colourLst.add("Blue");
        colourLst.add("pink");
        colourLst.add("Green");

        int n = colourLst.size();

        for(int i=0;i<n;i++){
            String str = (String) colourLst.get(i);
            System.out.println("Colour "  + str);
        }

    }

}
