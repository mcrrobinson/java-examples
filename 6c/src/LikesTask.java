import java.util.Scanner;
public class LikesTask {

    public static void main(String[] args) {
        int posts = 5;

        //STEP 1 - create object
        lineBreak(); output("STEP 1 - create object");lineBreak();
        PostLikes pl = new PostLikes(posts);
        Scanner input = new Scanner(System.in);
        
        //STEP 2 - populate 
        lineBreak(); output("STEP 2 - populate ");lineBreak();
        for(int i = 0; i < pl.size();i++){
            output("Enter likes for post " + (i + 1) + " of " + posts + ": ");
            pl.set(i, input.nextInt());
        }

        //STEP 3 - analyse and display
        lineBreak();output("STEP 3 - analyse and display");lineBreak();
        output("Likes List: " + pl.listAllLikes());
        output("Total Likes on all posts are " + pl.totalLikes());
        output("Average Likes for all posts are " + pl.averageLikes());        
        output( pl.postWithZeroLikes() + " posts with 0 likes");

        //STEP 4 - update
        lineBreak();output("STEP 4 - update");lineBreak();
        output("***Updating values***");
        output("Please enter a threshold value. ");
        output("All values below threshold will be replaced by threshold value.");
        pl.raiseValuesBelowThreshold(input.nextInt());

        ///STEP 3 - analyse and display
        lineBreak();output("STEP 3 - analyse and display");lineBreak();
        output("Likes List: " + pl.listAllLikes());
        output("Total Likes on all posts are " + pl.totalLikes());
        output("Average Likes for all posts are " + pl.averageLikes());        
        output( pl.postWithZeroLikes() + " posts with 0 likes");   
    }
    
    public static void output(String s){System.out.println(s); }
    public static void lineBreak(){ output("-------------------");  }     
}
