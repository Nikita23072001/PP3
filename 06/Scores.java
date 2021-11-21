import java.util.Arrays;

public class Scores
{
    private static double finalScore;
    
    public static double finalResult(int[] scores)
    {
        Arrays.sort(scores);
        finalScore = (scores[1]+scores[2]+scores[3])/3;
        return finalScore;
    }
    
    public static void main(String[] args){
        int[] player1 = {2, 3, 5, 4, 1};
        int[] player2 = {2, 2, 5, 3, 1};
        int[] player3 = {1, 3, 5, 2, 1};

        System.out.println(Scores.finalResult(player1));
        System.out.println(Scores.finalResult(player2));
        System.out.println(Scores.finalResult(player3));
    }
}
