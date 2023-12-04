package org.advent.day4;
public class Day4 {

    private void part1() {
        var problemSolver = new Part1Solver("4-1.txt");
        problemSolver.solve();
        System.out.println(problemSolver.getResult());
    }

    private void part2() {
        var problemSolver = new Part2Solver("4-2.txt");
        problemSolver.solve();
        System.out.println(problemSolver.getResult());
    }

    public static void main(String[] args) {
        var problemSolver = new Day4();
        problemSolver.part1();
        problemSolver.part2();
    }

}