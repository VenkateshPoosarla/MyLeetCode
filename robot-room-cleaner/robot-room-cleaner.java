/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */

class Solution {
    Set<String> visited=new HashSet<>();
    int [][]dir={{-1,0},{0,1},{1,0},{0,-1}};
    public void cleanRoom(Robot robot) {
        backtrack(robot,0,0,0);
    }
    void backtrack(Robot robot,int x,int y,int d){
        visited.add(x+" "+y);
        robot.clean();
        for(int i=0;i<dir.length;i++){
                  int newD = (d + i) % 4;
                  int newRow = x + dir[newD][0];
                  int newCol = y + dir[newD][1];
            if(!visited.contains(newRow+" "+newCol) && robot.move()){
                backtrack(robot,newRow,newCol,newD);
                goBack(robot);
            }
          robot.turnRight();  
        }
        
    }
    void goBack(Robot robot){
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnRight();
        robot.turnRight();
    }
}