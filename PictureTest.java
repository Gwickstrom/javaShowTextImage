public class PictureTest{
    public static void main(String[] args){
        //DECLARING PICTURE
        Picture pic4 = new Picture();

        String base1 = " \" ";
        String base2 = ":";

        String edge1 = "|";
        String edge2 = "/";
        String edge3 = "\\";
        String edge4 = "_";

        String lowerPole1 = "|";
        String upperPole1 = "|";

        String lowerbase1 = "\\_";
        String loweredge1 = "/\\";


        String pole2 = "||";
        String lrgpole = "||||";



        // String block = pic4.formPicture(base1, edge1, lowerPole1, upperPole1);
        // String pictures3 = pic4.createDouble();
        // System.out.printf(block);
        String picturess = pic4.formPicture(base1, base2, edge1, edge2);
    
        String pictures5 = pic4.lowerTower(lowerbase1, loweredge1);
        String pictures4 = pic4.base(base2, edge2);
        String pictures6 = pic4.pole(pole2, lrgpole);
        String pictures2 = pic4.createDouble();
    }
}
