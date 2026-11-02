public class SnakeScanner {

    private Task[][] grid;

    public SnakeScanner(Task[][] grid) {this.grid = grid;}

    public Task[] scanInSnakeOrder()
    {
        int a = grid.length, b = grid[0].length;
        int pom = 0;
        Task[] output = new Task[a*b];

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(i%2==0) output[pom] = grid[i][j];
                else
                {
                    output[pom] = grid[i][b-j-1];
                }
                pom++;
            }
        }


        return output;
    }
}
