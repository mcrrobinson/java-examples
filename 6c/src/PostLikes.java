public class PostLikes {
    
    private int[] likes;

    public PostLikes(int posts) {
        this.likes = new int[posts];
    }    

    public int size() {
        return this.likes.length;
    }

    public void set(int i, int nextInt) {
        this.likes[i] = nextInt;
    }

    public int get(int index) {
        return this.likes[index];
    }

    public String listAllLikes() {
        String values = "[ ";
        for(int i = 0; i < size();i++){
            if(i<size()-1){
                values += get(i) + " , ";
            }
            else {
                values += get(i) ;
            }
        } 
        values += " ]";
        return values;
    }

    public int totalLikes() {
        int sum = 0;
        for (int element: this.likes) {
            sum += element;
         }
        return sum;
    }

    public double averageLikes() {
        int value = 0;
        for(int i = 0; i < size();i++){
            value += get(i);
        }
        return value/size();
    }

    public int postWithZeroLikes() {
        int numberOfZeroLikePosts = 0;
        for (int i : this.likes) {
            if(i==0){
                numberOfZeroLikePosts++;
            }
        }
        return numberOfZeroLikePosts;
    }

    public void raiseValuesBelowThreshold(int nextInt) {
        for (int i = 0; i < likes.length; i++) {
            if(this.likes[i]<nextInt){
                set(i, nextInt);
            }
        }
    }
}
