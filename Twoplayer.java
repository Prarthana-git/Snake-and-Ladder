public class Twoplayer
 {
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

   
    int StartPosition = 0;
    int CurrentPosition = 0;
    int dice = 0;
    int play = 0;
    int count1 = 0;
    int count2 = 0;
    int player = 1;

    public static void main(String[] args) throws Exception 
{
       
        
        Twoplayer sl = new Twoplayer();

      
        System.out.println("Player 1 is Starting at: " + sl.StartPosition);
        System.out.println("Player 2 is Starting at: " + sl.StartPosition);

       
        while (sl.CurrentPosition != 100) 
      {
            if (sl.player == 1) 
           {
                sl.playCheck(1);
            }
          else
           {
                sl.playCheck(2);
            }
        }
}
    
    void checkPosition(int p)
 {
           if (CurrentPosition == 100) 
        {
              System.out.println("New Position of Player " + p + ": " + CurrentPosition);
              exitGame(p);
        }
         else if (CurrentPosition > 100) 
         {
            CurrentPosition -= dice;
            System.out.println("Staying at same location.");
        }
           else if (CurrentPosition < 0)
       {
            CurrentPosition = StartPosition;
            System.out.println("You came back to start.");
        } 
          else
          {
            System.out.println("New Position of Player " + p + ": " + CurrentPosition);
          }
    }

   
    void playCheck(int p) 
       {
           if (p == 1)
             { 
                 count1++;
              } 
            else 
             {
                count2++;
              }
        dice = (int) ((Math.floor(Math.random() * 10) % 6) + 1);
        System.out.println("Current Dice Face for player " + p + ": " + dice);
        play = (int) ((Math.floor(Math.random() * 10) % 3));;
        switch (play) 
     {
            case LADDER:
                CurrentPosition += dice;
                checkPosition(p);
                playCheck(p);
                break;
                
            case SNAKE:
                CurrentPosition -= dice;
                checkPosition(p);
                checkPlayer();
                break;
                
            default:
                System.out.println("Player " + p + ": No play");
                checkPlayer();
                break;
        }
    }

   
    void exitGame(int p) 
   {
        int count = p == 1 ? count1 : count2;
        System.out.println("Player " + p + " Won the game." + count + " Dice plays to win.");
        System.exit(0);
    }

   
    void checkPlayer()
  {
        if (player == 1)
         {
            player = 2;
         }
       else 
          {
            player = 1;
          }
    }
}