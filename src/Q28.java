import java.util.Random;

public class Q28 {
    public static void main(String[] args) throws InterruptedException{
        int votes[] = new int[240];
        for (int i = 0; i < 240; i++) {
            int n = 20;
            int randomNum = (int) (Math.random() * 3 + 1);
            votes[i] = randomNum;
        }

        // Create four threads
        Votes V = new Votes(votes);
        VoteCountThread t1 = new VoteCountThread(0,60, V);
        VoteCountThread t2 = new VoteCountThread(60, 120, V);
        VoteCountThread t3 = new VoteCountThread(120, 180, V);
        VoteCountThread t4 = new VoteCountThread(180, 240, V);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to finish the counting
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        // Now print the counted votes
        V.print();
    }

}
// Create a Votes class
class Votes{
    int votesA, votesB, votesC;
    int votes[];
    Votes(int votes[])
    {
        this.votes=votes;
        this.votesA = votesA;
        this.votesB = votesB;
        this.votesC = votesC;
    }
    synchronized public void countVotes(int start, int end)
    {
        for(int i=start; i<end; i++)
        {
            if(this.votes[i] == 1)
                this.votesA++;
            else if(this.votes[i]==2)
                this.votesB++;
            else if(this.votes[i] == 3)
                this.votesC++;
        }
    }
    void print() {
        System.out.println("Votes for A: " + this.votesA);
        System.out.println("Votes for B: "+this.votesB);
        System.out.println("Votes for C: "+this.votesC);
    }
}

// Create a custom thread
class VoteCountThread extends Thread{
    int start, end;
    Votes v;

    VoteCountThread(int s, int f, Votes v)
    {
        this.start = s;
        this.end = f;
        this.v = v;
    }
    public void run()
    {
        this.v.countVotes(this.start, this.end);
    }
}