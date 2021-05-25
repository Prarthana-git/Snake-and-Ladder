public class checkoption
 {
   public static final int ISsnake=1;
   public static final int ISladder=2;

   public static void main(String args[])
   {
     int startposition=0;
     int currentposition=0;

     System.out.println("Player current position is "+startposition);
     int dice=(int)((Math.floor(Math.random()*10)%6)+1);
     System.out.println("Dice Face are" +dice);

     int play=(int)(Math.floor(Math.random()*10)%3);

     switch(play)
      {
        case ISsnake:
                      currentposition-=dice;
                      break;
        case ISladder:
                      currentposition+=dice;
                      break;
        default:
                      currentposition+=0;
                      break;

      } 
     System.out.println("current position"+currentposition);
   }
}
