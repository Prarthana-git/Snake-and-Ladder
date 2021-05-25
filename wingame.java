public class wingame
 {
   public static final int ISsnake=1;
   public static final int ISladder=2;

   public static void main(String args[])
   {
     int startposition=0;
     int currentposition=0;

     System.out.println("Starting position of player is"+startposition);
     while(currentposition != 50 )
   {
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
       if(currentposition==50)
          {
           System.out.println("You Won the game");
           break;
          }
       else if(currentposition>50)
          {
            currentposition-=dice;
            System.out.println("Keep playing.You will stay on same position"); 
          }
       else if(currentposition<0)
          {
           currentposition=startposition;
           System.out.println("You are back to start");
          }
       else
          {
           System.out.println("New position"+currentposition);
           }
   }

 }
}
