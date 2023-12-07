package org.advent.day6;

public class Day6 {

    private void part1() {
        var problemSolver = new Day6Solver("6-1.txt");
        problemSolver.solve();
        System.out.println(problemSolver.getResult());
    }

    private void part2() {
        var problemSolver = new Part2Solver("6-2.txt");
        problemSolver.solve();
        System.out.println(problemSolver.getResult());
    }

    public static void main(String[] args) {
        var problemSolver = new Day6();
        problemSolver.part1();
        problemSolver.part2();
    }

}