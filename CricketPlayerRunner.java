public class CricketPlayerRunner {

    public static void main(String[] args) {

        CricketPlayer[] players = new CricketPlayer[10];

        // Direct References
        players[0] = new CricketPlayer("Rohit Sharma");
        players[1] = new CricketPlayer("Virat Kohli");
        players[2] = new CricketPlayer("Shubman Gill");
        players[3] = new CricketPlayer("Yashasvi Jaiswal");
        players[4] = new CricketPlayer("Rishabh Pant");

        // References
        CricketPlayer player1 = new CricketPlayer("KL Rahul");
        CricketPlayer player2 = new CricketPlayer("Sanju Samson");
        CricketPlayer player3 = new CricketPlayer("Hardik Pandya");
        CricketPlayer player4 = new CricketPlayer("Ravindra Jadeja");
        CricketPlayer player5 = new CricketPlayer("Jasprit Bumrah");

        players[5] = player1;
        players[6] = player2;
        players[7] = player3;
        players[8] = player4;
        players[9] = player5;

        System.out.println("Length of Cricket Player Array: " + players.length);
        System.out.println();

        System.out.println("Cricket Player Details:");

        for (int i = 0; i < players.length; i++) {
            players[i].displayPlayer();
        }
    }
}