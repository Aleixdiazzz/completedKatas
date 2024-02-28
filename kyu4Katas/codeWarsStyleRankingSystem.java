import java.util.*;

public class User {

    private static int MAX_RANK = 8, MAX_PROGRESS = 100;
    private static Set<Integer> RANKS = new HashSet<Integer>( Arrays.asList(-8,-7,-6,-5,-4,-3,-2,-1, 1, 2, 3, 4, 5, 6, 7, 8) );
    
    int rank, progress;
    
    public User() {
        rank = -8;
        progress = 0;
    }
    
    public void incProgress(int kataRank) {
        if (!RANKS.contains(kataRank)) throw new RuntimeException("Invalid rank");
        int dRank = kataRank - rank + (rank > 0 ? 1:-1) * (kataRank*rank < 0 ? 1:0);
        updateProgress(dRank > 0  ? 10 * dRank * dRank:
                       dRank == 0 ? 3:
                       dRank > -2 ? 1:0);
    }
    
    private void updateProgress(int p) {
        int nLevel = (progress+p) / MAX_PROGRESS;
        rank += nLevel + (RANKS.contains(rank+nLevel) ? 0:1);
        progress = rank >= MAX_RANK ? 0 : (progress+p) % MAX_PROGRESS;
    }
}
