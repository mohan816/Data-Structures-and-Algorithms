package arrays.practice.problems;

import java.util.Arrays;

public class FlippingAnImage {
	//https://leetcode.com/problems/flipping-an-image/description/
	      //Pseudo Code
	// 1) Reverse each one dimensional array
	// 2) If the value is 0 assign 1 and if the value is 1 assign 0
	 //Time Complexity - > O(n^2)
	public static int[][] flipAndInvertImage(int[][] image) {
        // reversing each values of image[i]
		//Time Complexity O(n^2)
        for(int i = 0; i < image.length; i++){
            int k = 0, j = image[i].length-1;
            while(k <= j){
                int temp = image[i][k];
                image[i][k] = image[i][j];
                image[i][j] = temp;
                k++;
                j--;
            }

            }
            //if value is 0 change it to 1 , else 0
            for(int i = 0; i < image.length; i++){
                for(int j = 0; j <image[i].length; j++){
                    if(image[i][j] == 1){
                        image[i][j] = 0;
                    }
                    else{
                        image[i][j] = 1;
                    }
                }
            }
            return image;
        }
        

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int[][] resultImage = flipAndInvertImage(image);
		for(int i = 0; i < resultImage.length; i++) {
			for(int j = 0; j < resultImage[i].length; j++) {
				System.out.print(resultImage[i][j]+" ");
			}
			System.out.println();
		}

	}

}
