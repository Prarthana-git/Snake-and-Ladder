public class ExactPosition
{

    public static final int LADDER = 1;
    public static final int SNAKE = 2;


	public static void main(String[] args)
{
        int StartPosition = 0;
        int CurrentPosition = 0;
        int dice;
        int play;
        System.out.println("Player is Starting at: " + StartPosition);

        while(CurrentPosition !=100)
        {

	         dice=(int) ((Math.floor(Math.random() *10) % 6) +1);
	         System.out.println("Dice Face are: " + dice);
	         play = (int) (Math.floor(Math.random() *10) % 3);

         switch(play)
         {

	         case LADDER:
	        	 CurrentPosition+= dice;
	        	 break;

	         case SNAKE:
	        	 CurrentPosition-= dice;
	        	 break;

	        default:
	        	CurrentPosition = CurrentPosition + 0;
	        	break;
         }

         if (CurrentPosition == 100)
         {
              System.out.println("Congratulations! You Won.");
              break;
         }
         else if (CurrentPosition > 100)
            {
                CurrentPosition -= dice;
                System.out.println("You are staying on same position.");
            }
            else if (CurrentPosition < 0)
            {
                CurrentPosition = StartPosition;
                System.out.println("You came back to start.");
            }
            else
            {
                System.out.println("New Position: " + CurrentPosition);
            }
        }
    }
}



