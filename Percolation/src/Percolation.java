import java.util.Arrays;

public class Percolation {

    private boolean[][] grid;
    private int dimension = 0;
    private int openSites = 0;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        grid = new boolean[n][n];
        dimension = n;
    }

    // open site (row, col) if it is not open already
    public void open(int row, int col) throws IllegalArgumentException {
        grid[row - 1][col - 1] = true;
        openSites++;
    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col) throws IllegalArgumentException {
        return grid[row - 1][col - 1];
    }

    // is site (row, col) full?
    public boolean isFull(int row, int col) throws IllegalArgumentException {
        return !isOpen(row, col);
    }

    // number of open sites
    public int numberOfOpenSites() {
        return openSites;
    }

    // does the system percolate?
    public boolean percolates() {

        return true;
    }

    private void validateRowOrColumnInput(int value) throws IllegalArgumentException {
        if (value <= 0 || value > dimension) {
            // TODO:brandonshute:2018-08-01
            throw new IllegalArgumentException("");
        }
    }

    // test client (optional)
    public static void main(String[] args) {}
}
