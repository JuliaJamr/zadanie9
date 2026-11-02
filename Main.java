public class Main {

    public static void main(String[] args)
    {
        Task[][] tasks = new Task[2][2];

        tasks[0][0] = new Task("1",10);
        tasks[0][1] = new Task("2",20);
        tasks[1][0] = new Task("3",30);
        tasks[1][1] = new Task("4",40);

        SnakeScanner snakeScanner = new SnakeScanner(tasks);

        Task[] snake = snakeScanner.scanInSnakeOrder();

        for(int i=0;i<snake.length;i++)
        {
            System.out.println(snake[i].getExecutionTime());
        }
    }
}
