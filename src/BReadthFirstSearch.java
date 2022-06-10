import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BReadthFirstSearch {
    public static void main(String[] args) {
        int n=7;
        ArrayList<Integer> bfs;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<Integer>());
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(7);
        adj.get(3).add(2);
        adj.get(3).add(5);
        adj.get(5).add(3);
        adj.get(5).add(7);
        adj.get(7).add(5);
        adj.get(7).add(2);
        adj.get(4).add(6);
        adj.get(6).add(4);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
        bfs = bfsgraph(n, adj);

        for (int i = 0; i < bfs.size(); i++) {
            System.out.println(bfs.get(i));
        }

    }
    public static ArrayList<Integer> bfsgraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean Vis[] = new boolean[V+1];
        for (int i = 0; i < V; i++) {
            if(Vis[i]==false){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                Vis[i] = true;
                while(!q.isEmpty()){
                    int node = q.poll();
                    bfs.add(node);
                    for(Integer it : adj.get(node)){
                        if(Vis[it]==false){
                            Vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }
        return bfs;
    }

}
