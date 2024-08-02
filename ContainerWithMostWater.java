package CrackYourPlacementDay13;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};
        int[] height3 = {4, 3, 2, 1, 4};
        int[] height4 = {1, 2, 1};

        System.out.println("Maximum container area for height1: " + maxArea(height1)); // Output: 49
        System.out.println("Maximum container area for height2: " + maxArea(height2)); // Output: 1
        System.out.println("Maximum container area for height3: " + maxArea(height3)); // Output: 16
        System.out.println("Maximum container area for height4: " + maxArea(height4)); // Output: 2
    }
}
